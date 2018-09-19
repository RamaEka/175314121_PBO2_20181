/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author admin
 */
public class MainFrame extends JFrame implements ActionListener {
    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenuItem exitMenuItem;
    private JMenuItem tambahPasienMenuItem;
    private JMenuItem tambahAntrianMenuItem;

    public MainFrame() throws HeadlessException {
        init();
    }

    public void init() {
        menuBar = new JMenuBar();
        this.setTitle("Frame");
        fileMenu = new JMenu("File");

        exitMenuItem = new JMenuItem("Exit");
        tambahPasienMenuItem = new JMenuItem("TambahPasien");
        tambahAntrianMenuItem = new JMenuItem("TambahAntrian");
        fileMenu.add(tambahAntrianMenuItem);
        fileMenu.add(tambahPasienMenuItem);
        fileMenu.add(exitMenuItem);
        menuBar.add(fileMenu);

        exitMenuItem.addActionListener(this);
        tambahPasienMenuItem.addActionListener(this);
        tambahAntrianMenuItem.addActionListener(this);
        //set menuBar
        this.setJMenuBar(menuBar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exitMenuItem) {
            System.exit(0);
        }
//        if (e.getSource() == tambahAntrianMenuItem) {
//            DaftarAntrianDialog test = new DaftarAntrianDialog();
//            test.setSize(500, 500);
//            test.setVisible(true);
//        }
        if (e.getSource() == tambahPasienMenuItem) {
            DaftarAntrianDialog test = new DaftarAntrianDialog();
            test.setSize(500, 500);
            test.setVisible(true);
        }
        
    }
}
