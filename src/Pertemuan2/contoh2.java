package Pertemuan2;

public class contoh2 {
    //membuat program menghitung nilai akhir dari MK PBO per Mahasiswa
    ///NA = (UTS X 20%) + (UAS X 25%) + (TUGAS X 55%)
    /* Contoh Output :
    NIM : 0111
    Nama : Jodi
    Prodi : S1
    MK : PBO
    NA : 88
     */
    //atribut
    private String nim;
    private String nama;
    private String prodi;
    private String mk;
    private double uts;
    private double uas;
    private double tugas;
    private double na;

    //operasi
    //setter
    public void setNim (String nim){
        this.nim = nim;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setProdi(String proid){
        this.prodi = prodi;
    }

    public void setMk(String mk) {
        this.mk = mk;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }

    public void setTugas(double tugas) {
        this.tugas = tugas;
    }

    //getter
    public String getNim(){
        return this.nim;
    }

    public double getUts() {
        return this.uts;
    }

    public double getUas() {
        return this.uas;
    }

    public double getTugas() {
        return this.tugas;
    }

    //custom method
    public double getNa(){
        na = (getUts()*0.2) + (getUas()*0.25) + (getTugas()*0.55);
        return na;
    }

    public void tampilkanNilai(){
        System.out.println("NIM :" + getNim() + "\n" + "NA :" + getNa());
    }
}
