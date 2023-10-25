package Tugas1;

public class Tiket {
    //atribut
    private String user, pass, nmhotel, nmpesawat, tujuan;
    private int jmlkamar, hrgkamar, jmlpenumpang, hrgtiket;

    //constructor

    public Tiket(String user, String pass){
        user = "admin";
        pass = "123";
        this.user = user;
        this.pass = pass;
    }
    public Tiket(String namahtl, int kamar, int hargakmr, String namapst, int orang, int hargaorg, String tjn){
        nmhotel = namahtl;
        jmlkamar = kamar;
        hrgkamar = hargakmr;
        nmpesawat = namapst;
        jmlpenumpang = orang;
        hrgtiket = hargaorg;
        tujuan = tjn;
    }


    //method
    public String getUser() {return this.user;}
    public String getPass() {return this.pass;}
    public String getNamaHotel() {return this.nmhotel;}
    public int getJumlahKamar() {return this.jmlkamar;}
    public int getHargaKamar() {return this.hrgkamar;}
    public String getNamaPesawat() {return this.nmpesawat;}
    public int getJumlahPenumpang() {return this.jmlpenumpang;}
    public int getHargaTiket() {return this.hrgtiket;}
    public String getTujuan() {return this.tujuan;}


    public double getTotalHotel(){
        return (getHargaKamar() - (getHargaKamar() * 0.45)) * getJumlahKamar();
    }
    public double getTotalPesawat(){
        return (getHargaTiket() * getJumlahPenumpang()) + (getJumlahPenumpang() * 29000);
    }
}
