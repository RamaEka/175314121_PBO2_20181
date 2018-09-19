/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Pasien;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author admin
 */
public class DaftarAntrianDialog extends JDialog implements ActionListener {   
    private JLabel namaLabel;
    private JLabel labelAlamat; 
    private JLabel labelNik; 
    private JTextField namaText;
    private JTextField alamatText,tglText,blnText,tahunText,klinikText;
    private JTextField nikText;
    private JButton tambahButton;
    

    public DaftarAntrianDialog() {
        this.setTitle("Form Daftar Pasien Baru");
        init();
    }
    
    public void init(){
         this.setLayout(null);

 namaLabel = new JLabel("NoRM");
        namaLabel.setBounds(100, 70, 50, 20);
        this.add(namaLabel);
        
        namaLabel = new JLabel("Nama");
        namaLabel.setBounds(320, 70, 50, 20);
        this.add(namaLabel);
        
        namaText= new JTextField();
        namaText.setBounds(370, 70, 100, 20);
        this.add(namaText);
        
        namaLabel = new JLabel("Alamat");
        namaLabel.setBounds(320, 100, 50, 20);
        this.add(namaLabel);
        
        alamatText= new JTextField();
        alamatText.setBounds(370, 100, 100, 20);
        this.add(alamatText);
        
        nikText= new JTextField();
        nikText.setBounds(200, 70, 100, 20);
        this.add(nikText);
        
        namaLabel = new JLabel("Tanggal Lahir");
        namaLabel.setBounds(100, 100, 100, 20);
        this.add(namaLabel);
        
        tglText= new JTextField();
        tglText.setBounds(200, 100, 100, 20);
        this.add(tglText);
        
         namaLabel = new JLabel("Bulan Lahir");
        namaLabel.setBounds(100, 130, 100, 20);
        this.add(namaLabel);
        
        blnText= new JTextField();
        blnText.setBounds(200, 130, 100, 20);
        this.add(blnText);
        
         namaLabel = new JLabel("Tahun Lahir");
        namaLabel.setBounds(100, 160, 100, 20);
        this.add(namaLabel);
        
        tahunText= new JTextField();
        tahunText.setBounds(200, 160, 100, 20);
        this.add(tahunText);
        
        namaLabel = new JLabel("Klinik");
        namaLabel.setBounds(100, 190, 100, 20);
        this.add(namaLabel);
        
        klinikText= new JTextField();
        klinikText.setBounds(200, 190, 100, 20);
        this.add(klinikText);
        
        tambahButton=new JButton("SIMPAN");
        tambahButton.setBounds(260,220,100,20);
        this.add(tambahButton);
        
        namaLabel = new JLabel("DAFTAR PASIEN BARU");
        namaLabel.setBounds(260, 40, 300, 20);
        this.add(namaLabel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == tambahButton) {
                Pasien baru = new Pasien();
                baru.setNama(namaText.getText());
                baru.setAlamat(alamatText.getText());
               

                Pasien.tambahPasienBaru(baru);
    }
}
}