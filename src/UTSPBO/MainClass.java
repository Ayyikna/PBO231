package UTSPBO;
import java.io.*;

/*  NIM : 22410100060
    NAMA : SAYYIDAH NABIGHAH ATHALLAH
    JENIS SOAL : GANJIL
 */
public class MainClass {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Barang b = new Barang("", "", 0, 0);
        Minuman a = new Minuman("", "", 0, 0, "", 0, 0, 0);

        try {
            do {
                System.out.println("---MENU TOKO KITA---");
                System.out.println("1. Entri Data Barang");
                System.out.println("2. Entri Data Penjualan");
                System.out.println("3. Keluar");
                System.out.println("Pilih menu : ");
                int pilih = Integer.parseInt(br.readLine());
                switch (pilih){
                    case 1 :
                        a.entriData(b);
                        break;
                    case 2 :
                        a.entriData();
                        break;
                    default:
                        System.exit(0);
                }

            }while(true);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
