package AbstractInterface;

import java.io.*;

public class MainClassAbstract {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //instansiasi -- > array
        LuasBalok lb = new LuasBalok(0.0, 0.0, 0.0);
        //LuasBalok lba[];

        lb.insertData(new LuasBalok[2]);
        System.out.println();
        lb.cetakData(new LuasBalok[2]);

    }
}
