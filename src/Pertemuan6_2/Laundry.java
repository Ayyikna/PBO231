package Pertemuan6_2;

public class Laundry {
    //atribut : jenis cuci, metode

    private String jenisCuci, metode;
    private int harga;

    //cons
    public Laundry(String jenisCuci, String metode, int harga) {
        this.jenisCuci = jenisCuci;
        this.metode = metode;
        this.harga = harga;
    }

    //getter
    public String getJenisCuci() {
        return jenisCuci;
    }

    public String getMetode() {
        return metode;
    }

    public int getHarga() {
        return harga;
    }

    //method tambahan --> overriding
    public int cuciExpress(){
        //set harga express 5000
        return 5000;
    }
}
