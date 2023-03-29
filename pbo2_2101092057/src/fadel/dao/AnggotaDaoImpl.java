/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fadel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import fadel.model.Anggota;
/**
 *
 * @author Muhammad Fadel R
 */
public class AnggotaDaoImpl implements AnggotaDao {

    public void insert(Connection con, Anggota anggota) throws Exception {
        
        String sql = "Inset into anggota values(?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, anggota.getKodeAnggota());
        ps.setString(2, anggota.getNamaAnggota());
        ps.setString(3, anggota.getAlamat());
        ps.setString(4, anggota.getJenisKelamin());
        ps.executeUpdate();
    }

    @Override
    public void insert(Anggota anggota) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Anggota anggota) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Anggota anggota) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Anggota getAnggota(String kode) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
