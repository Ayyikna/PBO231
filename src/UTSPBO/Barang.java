package UTSPBO;

public class Barang {
    //atribut
    public String kodeBarang, namaBarang;
    public int harga, stok;

    //cons

    public Barang(String kodeBarang, String namaBarang, int harga, int stok) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.harga = harga;
        this.stok = stok;
    }

    //getter

    public String getKodeBarang() {
        return kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public int getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }
}
