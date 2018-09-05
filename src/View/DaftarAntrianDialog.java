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
        namaLabel.setBounds(50, 50, 50, 20);
        this.add(namaLabel);
        
        namaText= new JTextField();
        namaText.setBounds(100, 50, 100, 20);
        this.add(namaText);
        
        namaLabel = new JLabel("Nama");
        namaLabel.setBounds(50, 80, 50, 20);
        this.add(namaLabel);
        
        namaText= new JTextField();
        namaText.setBounds(100, 80, 100, 20);
        this.add(namaText);
        
         namaLabel = new JLabel("Alamat");
        namaLabel.setBounds(50, 110, 50, 20);
        this.add(namaLabel);
        
        namaText= new JTextField();
        namaText.setBounds(100, 110, 100, 20);
        this.add(namaText);
    }
    public static void main(String[] args) {
        DaftarAntrianDialog test = new DaftarAntrianDialog();
        test.setSize(600, 400);
        test.setTitle("DAFTAR PASIEN BARU");
        test.setVisible(true);
    }
}
