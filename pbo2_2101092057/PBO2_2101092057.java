/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_2101092057;

import fadel.dao.Koneksi;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Muhammad Fadel R
 */
public class PBO2_2101092057 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Koneksi Koneksi = new Koneksi();
            Connection con = Koneksi.getKoneksi();
            JOptionPane.showMessageDialog(null, "Koneksi ok");
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, "Error :" + ex.getMessage());
            Logger.getLogger(PBO2_2101092057.class.getName()).log(Level.SEVERE, null, ex);
            
        }
}
}
