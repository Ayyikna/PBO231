package Pertemuan6_2;
import javax.management.InstanceNotFoundException;
import java.io.*;
public class MainClass2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //instance of class
        Laundry master = new Laundry("", "", 0);
        transaksiLaundry transaksi = new transaksiLaundry("", "", 0, "", "", "", "", 0);

        //deklarasi variabel
        String jenis, nama, kode, metode, tglCuci, tglAmbil;
        int harga, berat;

        //menu
        //loop
        do {
            System.out.println("---LAUNDRY---");
            System.out.println("1. Menu Master");
            System.out.println("2. Menu Transaksi");
            System.out.println("3. Menu Cari Data");
            System.out.println("4. Menu Keluar");
            System.out.println("Masukkan Pilihan Menu : ");
            int menu = Integer.parseInt(br.readLine());
            switch (menu){
                case 1:
                    System.out.println("---1. Menu Master Data---");
                    System.out.println("Entri jenis cucian : ");
                    jenis = br.readLine();
                    System.out.println("Entri harga : ");
                    harga = Integer.parseInt(br.readLine());
                    System.out.println("Entri metode : ");
                    metode = br.readLine();
                    master = new Laundry(jenis, metode, harga);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("---2. Menu Transaksi---");
                    System.out.println("Entri kode : ");
                    kode = br.readLine();
                    System.out.println("Entri nama : ");
                    nama = br.readLine();
                    System.out.println("Entri jenis cuci \n Cuci Setrika/Cuci Kering : ");
                    jenis = br.readLine();
                    System.out.println("Entri metode (Regular/Express) : ");
                    metode = br.readLine();
                    System.out.println("Entri berat : ");
                    berat = Integer.parseInt(br.readLine());
                    System.out.println("Entri tgl cuci : ");
                    tglCuci = br.readLine();
                    System.out.println("Entri tgl ambil : ");
                    tglAmbil = br.readLine();
                    //simpan ke cons
                    transaksi = new transaksiLaundry(jenis, metode, master.getHarga(), kode, nama, tglCuci, tglAmbil, berat);
                    System.out.println();
                    System.out.println("---CETAK DATA---");
                    transaksi.transaksi();
                    break;
                case 3:
                    System.out.println("---3. Menu Cari Data---");
                    System.out.println("Entri kode transaksi yang dicari : ");
                    kode = br.readLine();
                    //cek apakah kode yang diisi sm dgn yang disimpan
                    if (kode.equalsIgnoreCase(transaksi.getKode())){
                        transaksi.transaksi(kode);
                    } else {
                        System.out.println("Data tidak ada");
                    }
                    break;
                default:
                    System.exit(0);
            }
        }while(true);
    }
}
