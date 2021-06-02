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
import java.util.Scanner;

public class main 
{
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        String nama, nik;
        int tulis, coding, wawancara, pilih, repeat = 1;
        Scanner inputpilih = new Scanner(System.in);
        Scanner inputdata  = new Scanner(System.in);
        
        System.out.println("FORM PENDAFTARAN PT.AMORA ENTERTAINMENT");
        System.out.println("1. Android Development");
        System.out.println("2. Web Development");
        System.out.print("Pilih Jenis Form : ");
        pilih = inputpilih.nextInt();
        
        System.out.println("");
        System.out.println("~Isi Data Peserta~");
        System.out.print("NIK                 : ");
        nik = inputdata.nextLine();
        System.out.print("Nama                : ");
        nama = inputdata.nextLine();
        System.out.print("Nilai Tes Tulis     : ");
        tulis = inputdata.nextInt();
        System.out.print("Nilai Tes Coding    : ");
        coding = inputdata.nextInt();
        System.out.print("Nilai Tes Wawancara : ");
        wawancara = inputdata.nextInt(); 
        System.out.println("\n");
        System.out.println("Input data berhasil!");       
        
        switch(pilih)
        {
            case 1 ->
            {
                AndroidDev android = new AndroidDev(nama, nik, tulis, coding, wawancara);
                
                do
                {
                    System.out.println("\n");
                    System.out.println("MENU");
                    System.out.println("1. Edit");
                    System.out.println("2. Tampil");
                    System.out.println("3. Keluar");
                    System.out.print("Pilih : ");
                    pilih = inputpilih.nextInt();
                    
                    switch(pilih)
                    {
                        case 1 ->
                        {
                            System.out.println("");
                            System.out.print("Input Nilai Tes Tulis      : ");
                            android.settulis(inputdata.nextInt());
                            System.out.print("Input Nilai Tes Coding     : ");
                            android.setcoding(inputdata.nextInt());
                            System.out.print("Input Nilai Test Wawancara : ");
                            android.setwawancara(inputdata.nextInt());
                            System.out.println("\n");
                            System.out.println("Ubah data berhasil!");
                        }
                        
                        case 2 ->
                        {
                            System.out.println("");
                            System.out.println(android.nilai());
                            System.out.println(android.keterangan());
                        }
                        
                        case 3 ->
                        {
                            System.out.println("");
                            System.out.println("Terimakasih.");
                            repeat = 0;
                            System.exit(repeat);
                        }
                    }
                    
                }while(repeat == 1);
            }
            
            case 2 ->
            {
                WebDev web = new WebDev(nama, nik, tulis, coding, wawancara);
                
                do
                {
                    System.out.println("\n");
                    System.out.println("MENU");
                    System.out.println("1. Edit");
                    System.out.println("2. Tampil");
                    System.out.println("3. Keluar");
                    System.out.print("Pilih : ");
                    pilih = inputpilih.nextInt();
                    
                    switch(pilih)
                    {
                        case 1 ->
                        {
                            System.out.println("");
                            System.out.print("Input Nilai Tes Tulis      : ");
                            web.settulis(inputdata.nextInt());
                            System.out.print("Input Nilai Tes Coding     : ");
                            web.setcoding(inputdata.nextInt());
                            System.out.print("Input Nilai Test Wawancara : ");
                            web.setwawancara(inputdata.nextInt());
                            System.out.println("\n");
                            System.out.println("Ubah data berhasil!");
                        }
                        
                        case 2 ->
                        {
                            System.out.println("");
                            System.out.println(web.nilai());
                            System.out.println(web.keterangan());
                        }
                        
                        case 3 ->
                        {
                            System.out.println("");
                            System.out.println("Terimakasih.");
                            repeat = 0;
                            System.exit(repeat);
                        }
                    }
                    
                }while(repeat == 1);            
            }          
        }
    }
    
}
