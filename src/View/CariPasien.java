/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Pasien;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author RamaEka
 */
public class CariPasien extends JFrame implements ActionListener  {

    private JLabel namaLabel;
    private JTextField namaText,hasilText,hasil2Text;
    private JButton cariButton;
    
    public CariPasien() {
        init();
    }
    
     public CariPasien(String title){
        this.setTitle(title);
        init();
    }
     
     public void init(){
        this.setLayout(null);
        
       namaLabel = new JLabel();
        namaLabel.setText("NIK");
        namaLabel.setBounds(50, 90, 80, 20);
        this.add(namaLabel);
        
        namaText = new JTextField();
        namaText.setBounds(130, 90, 120, 20);
        this.add(namaText);
        
//        namaLabel = new JLabel();
//        namaLabel.setText("Data yang di cari");
//        namaLabel.setBounds(50, 150, 80, 20);
//        this.add(namaLabel);
//        
//        namaLabel = new JLabel();
//        namaLabel.setText("Nama");
//        namaLabel.setBounds(50, 180, 80, 20);
//        this.add(namaLabel);
//        
//        hasilText = new JTextField();
//        hasilText.setBounds(130, 180, 120, 20);
//        this.add(hasilText);
//        
//        namaLabel = new JLabel();
//        namaLabel.setText("NIK");
//        namaLabel.setBounds(50, 210, 80, 20);
//        this.add(namaLabel);
//        
//        hasil2Text = new JTextField();
//        hasil2Text.setBounds(130, 210, 120, 20);
//        this.add(hasil2Text);
        
        
       cariButton = new JButton();
        cariButton.setText("Cari");
        cariButton.setBounds(130, 260, 80, 30);
        this.add(cariButton);}
    
    @Override
   public void actionPerformed(ActionEvent e) {
        try{
 if (e.getSource() == cariButton) {
            Pasien cari =new Pasien();
            Pasien.cariPasien(namaText.getText());
            
               JOptionPane.showMessageDialog(null, "Nama Pasien: "+cari.getNama());
                this.dispose();
                
        }
        }catch(HeadlessException ex){
           
            JOptionPane.showMessageDialog(null, ex);
        }
}
    
}
