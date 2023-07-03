/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fadel.controller;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import fadel.dao.AnggotaDaoImpl;
import fadel.dao.Koneksi;
import fadel.form.formAnggota;
import fadel.model.Anggota;
import java.sql.Connection;
/**
 *
 * @author Muhammad Fadel R
 */
public class AnggotaController {
    private formAnggota formAnggota;
    private Anggota Anggota;
    private AnggoaDao AnggotaDao;
    private Connection con;
    private Koneksi Koneksi;

    private static class AnggoaDao {

        public AnggoaDao() {
        }
    }
    
    
}
