package Pertemuan1;

public class Contoh { //identitas

    //atribut=variabel
    // private/protected

    private String name;
    public double gpa;


    //operasi/fungsi
    //setter penulisan dengan void , getter penulisan dengan tipe data
    //setter = prosedur
    public void setName(String n){
        //jika nama atribut pada class sama dengan nama atribut pada parameter setter/getter,
        //maka, beri keyword this
        // this.name = name;
        // jika berbeda
        name = n;
    }
    //getter = fungsi --> tanpa parameter, harus ada return
    public String getName(){
        return this.name;

    }
    //nyoba yg gpa
    public void setGpa(double i){
        gpa = i;
    }

    public double getGpa(){
        return this.gpa;
    }
    //custom method--> fungsi2 lain



}
