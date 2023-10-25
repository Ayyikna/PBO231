package Pertemuan4;

 import java.io.*;
public class MainClassSuper {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //instance of class
        subClass b = new subClass("", "", 0);


        System.out.println("--INPUT--");
        System.out.println("Masukkan Nama : ");
        String nama = br.readLine();
        System.out.println("Masukkan Keterangan : ");
        String keterangan = br.readLine();
        System.out.println("Masukkan Usia : ");
        int usia = Integer.parseInt(br.readLine());

        //masukkan data ke objek constructor
        b = new subClass(nama, keterangan, usia);

        System.out.println("Nama : " + b.getNama());
        System.out.println("Keterangan : " + b.getKeterangan());
        System.out.println("Usia : " + b.getUsia());
    }
}
