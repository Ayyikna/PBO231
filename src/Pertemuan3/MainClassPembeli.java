package Pertemuan3;

import java.io.*;
import java.sql.SQLOutput;

public class MainClassPembeli {
    public static void main(String [] args) {
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));
        /*
        1. Pendaftaran Member
        2. Transaksi pembelian barang
            - punya member atau tdk
            - jika member (telp), cek telp member sama/tidak
              dgn yg di daftar member, dpt poin
            - jika tidak, hanya proses transaksi biasa
         */

        Pembeli member = new Pembeli("", "", 0, "");
        Pembeli transaksi = new Pembeli("", 0, 0);

        //-const = perlu deklarasi ulang variabel
        String namaBrg, namaPembeli, alamat, telp;
        int usia, hrg, jml;
        try{
            do{
                System.out.println("--- MARET APRIL ---");
                System.out.println("1. Pendaftaran");
                System.out.println("2. Transaksi");
                System.out.println("3. Keluar Aplikasi");
                System.out.println("Pilih Menu : ");
                int menu = Integer.parseInt(br.readLine());
                switch (menu){
                    case 1 :
                        //1. Pendaftaran member
                        System.out.println("--- Daftar Member ---");
                        System.out.println("Nama :");
                        namaPembeli = br.readLine();
                        System.out.println("Alamat :");
                        alamat = br.readLine();
                        System.out.println("No. Telp :");
                        telp = br.readLine();
                        System.out.println("Usia :");
                        usia = Integer.parseInt(br.readLine());

                        member = new Pembeli(namaPembeli, alamat, usia, telp);
                        break;
                    case 2:
                        //2. Transaksi
                        System.out.println("--- Transaksi ---");
                        System.out.println("Nama Barang : ");
                        namaBrg = br.readLine();
                        System.out.println("Harga barang : ");
                        hrg = Integer.parseInt(br.readLine());
                        System.out.println("Jumlah Beli : ");
                        jml = Integer.parseInt(br.readLine());

                        //data disimpan ke constructor
                        transaksi = new Pembeli(namaBrg, hrg, jml);
                        System.out.println("Total belanja : " +
                                transaksi.getTotal() );

                        System.out.println("Member? (Y/N) : ");
                        String jawab = br.readLine();
                        if(jawab.equalsIgnoreCase("Y")){
                            System.out.println("Masukkan NO Telp : ");
                            telp = br.readLine();
                            //cek no telp sama kaya di daftra atau nggak
                        if (telp.equalsIgnoreCase(member.getNoTelp())) {
                            System.out.println("No telp yang didaftarkan : " +
                                    member.getNoTelp());
                            System.out.println("Poin anda adalah : " + transaksi.getMemberPoin());
                        } else {
                            System.out.println("Mohon maaf, no telp tidak terdaftar");
                        }
                        }else{
                            //non member transaksi
                            System.out.println("Terima kasih");
                        }
                        break;
                    default:
                        //keluar program
                        System.exit(0);

                }
            }while(true);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
