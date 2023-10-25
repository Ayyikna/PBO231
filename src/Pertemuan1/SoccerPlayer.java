package Pertemuan1;

public class SoccerPlayer extends Contoh {
    //utk mengambil item dari class contoh bisa menggunakan
    //instance of class = objek (membuat objek dari contoh ke class soccer)

    Contoh c = new Contoh();//instance of class

    public void ambilSetDariContoh()
    {
        super.setName("Nama");
        //super: utk ambil fungsi yang ada di class induknya
    }


}
