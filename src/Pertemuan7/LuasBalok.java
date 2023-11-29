package Pertemuan7;

public class LuasBalok extends RumusBalok {
    //cons
    public LuasBalok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar, tinggi);
    }

    //method
    //overriding method dr abstract method

    @Override
    double hitungBalok() {
        double luas = (2* (getPanjang()*getLebar())+2*(getPanjang()*getTinggi())
                +2* (getLebar()*getTinggi()));
        return luas;
    }

    @Override
    void cetak() {
        System.out.println("Luas Balok adalah " + hitungBalok());
    }
}
