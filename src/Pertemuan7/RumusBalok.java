package Pertemuan7;

abstract class RumusBalok {
    //atribut
    private double panjang, lebar, tinggi;

    //cons
    public RumusBalok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    //getter

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public double getTinggi() {
        return tinggi;
    }

    //abstrac method
    abstract double hitungBalok(); //fungsi
    abstract void cetak(); //prosedur

    //implementasi dr abstract method --> polymorphism --> overriding
}
