/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import static Model.Klinik.daftarKlinik;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class RumahSakit implements Serializable {

    private String nama, alamat;
    private ArrayList<Pasien> daftarPasien = new ArrayList<Pasien>();

    public RumahSakit() {
        this.nama=this.getNama();
        this.alamat=this.getAlamat();
    }

    public RumahSakit(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public void tambahPasienBaru(Pasien test) {
        daftarPasien.add(test);

    }

    public  Pasien cariPasien(String string) {
        for (int i = 0; i < daftarPasien.size(); i++) {
            if (daftarPasien.get(i).getNoRekamMedis() == string) {
                return daftarPasien.get(i);
            }

        }
        return null;
    }

    public  void simpanDaftarPasien(File file) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
            for (int i = 0; i < daftarPasien.size(); i++) {
                String data = daftarPasien.get(i).toString();
                fos.write(data.getBytes());
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
//            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);

        } catch (IOException ex) {
//            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        } finally {
            try {
                fos.close();

            } catch (IOException ex) {
//                Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex.getMessage());
            }
        }
    }

    public  void bacaDaftarPasien(File file) {
        FileInputStream fis = null;
        String hasil = "";
        int dataInt;
        boolean nama = false;
        boolean alamat = false;
        Pasien temp = new Pasien();
        try {
            fis = new FileInputStream(file);
            while ((dataInt = fis.read()) != -1) {
                if ((char) dataInt != '\n') {
                    if ((char) dataInt != '\t') {
                        hasil = hasil + (char) dataInt;
                    } else if (nama == false) {
                        temp.setNama(hasil);
                        nama = true;
                        hasil = "";
                    } else if (alamat == false) {
                        temp.setAlamat(hasil);
                        alamat = true;
                        hasil = "";
                    }
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());

        } catch (IOException ex) {
            System.out.println(ex.getMessage());

        }

    }

    public void simpanObjekRumahSakit(File file) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);

            oos.writeObject(this);

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }

    }

    public void bacaObjekRumahSakit(File file) {
        FileInputStream fis = null;
        ObjectInputStream ois=null; 
       
        try {
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            
            RumahSakit rs=(RumahSakit) ois.readObject();
            this.setNama(rs.getNama());
            this.setAlamat(rs.getAlamat());
            this.setDaftarPasien(rs.daftarPasien);
            
            
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());

        } catch (IOException ex) {
            System.out.println(ex.getMessage());

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RumahSakit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Pasien> getDaftarPasien() {
        return daftarPasien;
    }

    public  void setDaftarPasien(ArrayList<Pasien> daftarPasien) {
        this.daftarPasien=daftarPasien;

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public static void tambahKlinik(Klinik klinik) {
        daftarKlinik.add(klinik);
    }

    public static Klinik cariKlinik(String namaKlinik) {
        for (int i = 0; i < daftarKlinik.size(); i++) {
            if (daftarKlinik.get(i).getNama() == namaKlinik) {
                return daftarKlinik.get(i);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "RumahSakit{" + "nama=" + nama + ", alamat=" + alamat + ", daftarPasien=" + daftarPasien + '}';
    }

}
