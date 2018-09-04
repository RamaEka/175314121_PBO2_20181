/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1;

/**
 *
 * @author RamaEka
 */
public class Pasien {
    private String noRekamMedis,nama,alamat,tempatLahir; //deklarasi variabel bertipe data String dan bersifat private
    private int tanggalLahir,bulanLahir,tahunLahir; //deklarasi variabel bertipe data integer dan bersifat privat
    
      
    public Pasien(){ //menambahkan konstruktor, Konsktruktor adalah method yang pertama kali dijalankan pada saat sebuah objek pertama kali diciptakan
        
    }
    

    public String getNoRekamMedis() { //membuat method bernama getNoRekamedis yang akan mereturn variabel bertipe data String
        return noRekamMedis;
    }

    public void setNoRekamMedis(String noRekamMedis) throws NumberFormatException { //membuat method void dengan menambahkan throws NumberFormatException
        if (noRekamMedis.toCharArray().length>=6) { //Method ini mengalokasikan array karakter baru, yang panjangnya sesuai dengan panjang string yang ditentukan
            this.noRekamMedis = noRekamMedis;
        }else{
                throw new NumberFormatException("Nomor Rekam Medis Salah"); //NumberFormatException berfungsi untuk menangani kesalahan2 dalam format penulisan angka.
                }
    }

    public String getNama() { //membuat method bernama getNama yang akan mereturn variabel bertipe data String
        return nama;
    }

    public void setNama(String nama) { //membuat method void bernama setNama dengan parameter variabel nama bertipe data String
        this.nama = nama;
    }

    public String getAlamat() { //membuat method bernama getAlamat yang akan mereturn variabel bertipe data String
        return alamat;
    }

    public void setAlamat(String alamat) { //membuat method void bernama setNama dengan parameter variabel alamat bertipe data String
        this.alamat = alamat;
    }

    public String getTempatLahir() { //membuat method bernama getTempatLair yang akan mereturn variabel bertipe data String
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {  //membuat method void bernama setTempatLahir dengan parameter variabel tempatLahir bertipe data integer
        this.tempatLahir = tempatLahir;
    }

    public int getTanggalLahir() { //membuat method bernama getTanggalLahir yang akan mereturn variabel bertipe data integer
        return tanggalLahir;
    }

    public void setTanggalLahir(int tanggalLahir) throws NumberFormatException { //membuat method void bernama setTanggalLahir dengan parameter variabel tanggalLahir bertipe data integer
        if(tanggalLahir>0 && tanggalLahir<31)
        this.tanggalLahir = tanggalLahir;
        else{  throw new NumberFormatException("Tanggal Lahir tidak vaild");}
    }

    public int getBulanLahir() {  //membuat method bernama getBulanLahir yang akan mereturn variabel bertipe data integer
        return bulanLahir;
    }

    public void setBulanLahir(int bulanLahir) { //membuat method void bernama setBulanLahir dengan parameter variabel bulanLahir bertipe data integer
        this.bulanLahir = bulanLahir;
    }

    public int getTahunLahir() {  //membuat method bernama getTahunLahir yang akan mereturn variabel bertipe data integer
        return tahunLahir;
    }

    public void setTahunLahir(int tahunLahir) { //membuat method void bernama setTahunlahir dengan parameter variabel tahunLahir bertipe data integer
        this.tahunLahir = tahunLahir;
    }
    
}
