package Pertemuan6_2;

public class transaksiLaundry extends Laundry {
    private String kode, namaPelanggan, tglCuci, tglAmbil;
    private int berat;

    //cons
    public transaksiLaundry(String jenisCuci, String metode, int harga, String kode, String namaPelanggan, String tglCuci, String tglAmbil, int berat) {
        super(jenisCuci, metode, harga);
        this.kode = kode;
        this.namaPelanggan = namaPelanggan;
        this.tglCuci = tglCuci;
        this.tglAmbil = tglAmbil;
        this.berat = berat;
    }

    //getter
    public String getKode() {
        return kode;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public String getTglCuci() {
        return tglCuci;
    }

    public String getTglAmbil() {
        return tglAmbil;
    }

    public int getBerat() {
        return berat;
    }

    //method tambahan --> getTotal,  ovverloading method
    public int getTotal(){
        //menghitung sub total jasa cuci
        return getBerat()*getHarga();
    }

    //overloading --> method statis
    public void transaksi(){ //cetak data
        System.out.println("Nama Pelanggan : " + getNamaPelanggan());
        System.out.println("Jenis Cuci : " + getJenisCuci());
        System.out.println("Metode (Reguler/Express) : " + getMetode());
        System.out.println("Harga Jasa : " + getHarga());
        System.out.println("Tanggal Cuci : " + getTglCuci());
        System.out.println("Tanggal Ambil : " + getTglAmbil());
        System.out.println("Berat Cucian : " + getBerat());
        System.out.println("Sub Total : " + getTotal()); //sub total (hrg+brt)
        System.out.println("Total : " + cuciExpress()); //+jasa express
    }

    //searching data --? tau lebih dulu kode transaksi nya
    public void transaksi(String kode){
        System.out.println("Nama Pelanggan : " + getNamaPelanggan());
        System.out.println("Jenis Cuci : " + getJenisCuci());
        System.out.println("Metode (Reguler/Express) : " + getMetode());
        System.out.println("Harga Jasa : " + getHarga());
        System.out.println("Tanggal Cuci : " + getTglCuci());
        System.out.println("Tanggal Ambil : " + getTglAmbil());
        System.out.println("Berat Cucian : " + getBerat());
        System.out.println("Sub Total : " + getTotal()); //sub total (hrg+brt)
        System.out.println("Total : " + cuciExpress()); //+jasa express
    }

    //overriding --> method dinamis
    @Override
    public int cuciExpress() {
        //menjumlahkan sub total dengan biaya expres
        //misal : sub total = 16000 + 5000, shg total = 21000
        //boleh memanggil fungsi di dlm fungsi
        int total = getTotal();
        if (getMetode().equalsIgnoreCase("express")){
            total = total + super.cuciExpress(); //atau total += super.cuciExpress
            //16000 = 16000+5000
        }
        return total;
    }
}
