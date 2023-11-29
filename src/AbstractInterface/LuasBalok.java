package AbstractInterface;
import java.io.*;
public class LuasBalok extends RumusBalok implements InterfaceBalok {
    //bantuan atribut
    double p, l, t;
    //cons
    public LuasBalok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar, tinggi);

    }

    @Override
    public void insertData(LuasBalok[] lb) throws IOException {
        //tdk perlu lagi utk memberikan elemen array
        //elemen array diberikan di mainClass
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < lb.length; i++){
            System.out.println("Masukkan panjang : ");
            p = Double.parseDouble(br.readLine());
            System.out.println("Masukkan lebar : ");
            l = Double.parseDouble(br.readLine());
            System.out.println("Masukkan tinggi : ");
            t = Double.parseDouble(br.readLine());

            lb[i] = new LuasBalok(p, l, t);
        }

    }

    @Override
    public void cetakData(LuasBalok[] lb) throws IOException {
        for (int i = 0; i < lb.length; i++) {
         //   System.out.println("Luas balok ke- "+(i+1)+" = "+lb[i].hitungLuas());

        }
    }

    @Override
    public double hitungLuas() {
        double luas = (2* (getPanjang()*getLebar())+2*(getPanjang()*getTinggi())
                +2* (getLebar()*getTinggi()));
        return luas;
    }
}