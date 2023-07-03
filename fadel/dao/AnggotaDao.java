/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fadel.dao;

import fadel.model.Anggota;
/**
 *
 * @author Muhammad Fadel R
 */
public interface AnggotaDao {
    public void insert(Anggota anggota)throws Exception;
    public void update(Anggota anggota)throws Exception;
    public void delete(Anggota anggota)throws Exception;
    public Anggota getAnggota(String kode)throws Exception;
    

}
