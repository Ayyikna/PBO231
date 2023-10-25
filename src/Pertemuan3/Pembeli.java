package Pertemuan3;

public class Pembeli {
    //atribut

    /* member :
    nama, umur, notelp, alamat
    dpt poin setiap :
    min belanja 50rb --> poin 10
    min belanja 100rb --> poin 20
     */

    /*
    non member :
    nama barang, jumlah barang, total, struk
     */
    private String namaPembeli, alamat, namaBarang, noTelp;
    private int usia, jumlah, total, poin, harga;


    //constructor
    //cons member
    public Pembeli(String nama, String alamat, int usia,
                   String telp){
        namaPembeli = nama;
        this.alamat = alamat;
        this.usia = usia;
        noTelp = telp;
    }

    ///cons non member == transaksi
    public Pembeli (String namaBarang, int jml, int harga){
        this.namaBarang = namaBarang;
        jumlah = jml;
        this.harga = harga;
    }

    //method
    //getter
    public String getNamaPembeli(){
        return this.namaPembeli;
    }
    public String getNamaBarang(){
        return this.namaBarang;
    }
    public String getAlamat(){
        return this.alamat;
    }
    public String getNoTelp(){
        return this.noTelp;
    }
    public int getUsia(){
        return this.usia;
    }
    public int getJumlah(){
        return this.jumlah;
    }

    public int getHarga(){
        return this.harga;
    }

    //method tambahan
    /* dpt poin setiap :
    min belanja 50rb --> poin 10
    min belanja 100rb --> poin 20 */

    public int getMemberPoin(){
        poin = 0;
        if (getTotal() >= 50000) {
            poin = 10;
        } else if (getTotal() >= 100000) {
            poin = 20;
        }
        return poin;
    }

    public int getTotal(){
        return getHarga() * getJumlah();
    }

}
