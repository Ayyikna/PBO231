package UTSPBO;
import java.io.*;
public class Minuman extends Barang implements InterfaceBarang{
    String kd, nm, jns, strk;
    int hrg, stk, jml;
    private String jenis;
    private int jumlahBeli, total, diskon;



    public Minuman(String kodeBarang, String namaBarang, int harga, int stok, String jenis, int jumlahBeli, int total, int diskon) {
        super(kodeBarang, namaBarang, harga, stok);
        this.jenis = jenis;
        this.jumlahBeli = jumlahBeli;
        this.total = total;
        this.diskon = diskon;
    }

    public Minuman(String kodeBarang, String namaBarang, int harga, int stok, String jenis) {
        super(kodeBarang, namaBarang, harga, stok);
        this.jenis = jenis;
    }

    public String getJenis() {
        return jenis;
    }

    public int getJumlahBeli() {
        return jumlahBeli;
    }

    public int getTotal() {
        return (getJumlahBeli() * getHarga());
    }

    public int getDiskon() {
        return diskon = 10/100 * getHarga();
    }

    @Override
    public String getKodeBarang() {
        return super.getKodeBarang();
    }

    @Override
    public String getNamaBarang() {
        return super.getNamaBarang();
    }

    @Override
    public int getHarga() {
        return super.getHarga();
    }

    @Override
    public int getStok() {
        return super.getStok();
    }

    @Override
    public int stokUpdate() {
        return (super.getStok() - getJumlahBeli());
    }

    @Override
    public void entriData(Barang b) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("---DATA MINUMAN---");
        System.out.println("Kode Barang : ");
        kd = br.readLine();
        System.out.println("Nama Barang : ");
        nm = br.readLine();
        System.out.println("Jenis Barang : ");
        jns = br.readLine();
        System.out.println("Harga Barang : ");
        hrg = Integer.parseInt(br.readLine());
        System.out.println("Stok Barang : ");
        stk = Integer.parseInt(br.readLine());

        b = new Minuman(kd, nm, hrg, stk, jns);
    }

    @Override
    public void entriData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("---DATA PENJUALAN");
        System.out.println("Kode Barang : ");
        kd = br.readLine();
        System.out.println("Nama Barang : " +getNamaBarang() );
        System.out.println("Jenis Barang : " + getJenis());
        System.out.println("Harga : " + super.getHarga());
        System.out.println("Stok saat ini : " + super.getStok());
        System.out.println("Jumlah yang ingin dibeli : ");
        jml = Integer.parseInt(br.readLine());
        System.out.println("Stok Tersisa : " + stokUpdate());
        System.out.println("Total Bayar : " + getTotal());
        System.out.println("Ingin cetak struk? Ya/Tidak");
        strk = br.readLine();

    }

    @Override
    public void struk() {


    }
}
