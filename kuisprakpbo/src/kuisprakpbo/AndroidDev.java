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
public class AndroidDev extends DataPeserta implements hitungnilai
{

    public AndroidDev(String nama, String nik, int tulis, int coding, int wawancara) 
    {
        super(nama, nik, tulis, coding, wawancara);
    }

    @Override
    public double nilai() 
    {
        return (super.coding * 50/100) + (super.tulis * 20/100) + (super.wawancara * 30/100); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String keterangan() 
    {
        if(this.nilai() >= 85)
        {
            return ("KETERANGAN: LULUS \nSelamat, kepada " + this.nama + " telah diterima sebagai divisi Android Development");
        }

        else
        {
            return ("KETERANGAN: GAGAL \nMohon maaf, kepada " + this.nama + " telah ditolak sebagai divisi Android Development");
        } //To change body of generated methods, choose Tools | Templates.
    }
    
    public void settulis(int tulis) 
    {
        this.tulis = tulis;
    }

    public void setcoding(int coding) 
    {
        this.coding = coding;
    }

    public void setwawancara(int wawancara) 
    {
        this.wawancara = wawancara;
    }    
}
