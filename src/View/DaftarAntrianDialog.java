/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author admin
 */
public class DaftarAntrianDialog extends JDialog{
    private JLabel judulLabel;
    private JLabel namaLabel;
    private JTextField namaText;
    private JButton saveButton;
    
    public DaftarAntrianDialog() {
        init();
    }

    public DaftarAntrianDialog(String title) {
        this.setTitle(title);
        init();
    }

    public void init() {
        this.setLayout(null);
        
        namaLabel = new JLabel("NoRM");
        namaLabel.setBounds(200, 70, 50, 20);
        this.add(namaLabel);
        
        namaText= new JTextField();
        namaText.setBounds(250, 70, 100, 20);
        this.add(namaText);
        
        namaLabel = new JLabel("Nama");
        namaLabel.setBounds(200, 100, 50, 20);
        this.add(namaLabel);
        
        namaText= new JTextField();
        namaText.setBounds(250, 100, 100, 20);
        this.add(namaText);
        
         namaLabel = new JLabel("Alamat");
        namaLabel.setBounds(200, 130, 50, 20);
        this.add(namaLabel);
        
        namaText= new JTextField();
        namaText.setBounds(250, 130, 100, 20);
        this.add(namaText);
        
        saveButton=new JButton("SIMPAN");
        saveButton.setBounds(250,160,100,20);
        this.add(saveButton);
        
        namaLabel = new JLabel("DAFTAR PASIEN BARU");
        namaLabel.setBounds(240, 40, 300, 20);
        this.add(namaLabel);
    }
   
}