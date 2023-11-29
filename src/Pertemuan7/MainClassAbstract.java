package Pertemuan7;

import java.io.*;

public class MainClassAbstract {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //instansiasi
        LuasBalok lb = new LuasBalok(0.0, 0.0, 0.0);

        System.out.print("Input Panjang : ");
        double p = Double.parseDouble(br.readLine());
        System.out.print("Input lebar : ");
        double l = Double.parseDouble(br.readLine());
        System.out.print("Input tinggi : ");
        double t = Double.parseDouble(br.readLine());

        //memasukkan inputan (variabel inputan) ke cons
        lb = new LuasBalok(p, l, t);


        //hitung dan cetak luas
        lb.cetak();
    }
}
