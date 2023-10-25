package Pertemuan1;

//tahapan I/O;
/*
1. import I/O (Scanner/BufferedReader)
2. Error Handling
3. Objek dari library I/O
 */

import java.io.BufferedReader;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class tes {
    public static void main(String[] args) {
        // objek br
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //instance of class
        Contoh c = new Contoh();


        //error handling
        try{
            //blok kode dengan asumsi benar
            //input
            System.out.println("----INPUT----");
            c.setName(br.readLine());
            //int ----> c.setGpa(Integer.parseInt(br.readLine))
            //double --> c.setGpa(Double.parseDouble(br.readdLine))


            //output
            System.out.println(c.getName());
            c.getGpa();//---> jika memanggil method yg didalamnya sudah ada println

        } catch (Exception exc) {
            //blok kode untuk menjalankan informasi kesalahan dari blok try
            System.out.println(exc.getMessage());
        }

    }
}
