package Pertemuan4;

public class subClass extends superClass{
    //atribut

    private int usia;

    //cons

    public subClass(String nama, String keterangan, int usia) {
        super(nama, keterangan);
        this.usia = usia;
    }

    //getter

    public int getUsia() {
        return usia;
    }

    @Override
    public String getNama() {
        return super.getNama();
    }

    @Override
    public String getKeterangan() {
        return super.getKeterangan();
    }
}
