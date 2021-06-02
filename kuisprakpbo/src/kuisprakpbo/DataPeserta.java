/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuisprakpbo;

/**
 *
 * @author edlan
 */
public class DataPeserta 
{
    protected String nama, nik;
    protected int tulis, coding, wawancara;
    
    public DataPeserta(String nama, String nik, int tulis, int coding, int wawancara)
    {
        this.nama      = nama;
        this.nik       = nik;
        this.tulis     = tulis;
        this.coding    = coding;
        this.wawancara = wawancara;
    }
}
