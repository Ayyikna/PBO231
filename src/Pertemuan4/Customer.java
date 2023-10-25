package Pertemuan4;

//class turunan atau warisan dr class person = sub class/anak class
public class Customer extends Person {

    private String id;

    //cons
    public Customer(String nama, String alamat, String id) {
        super(nama, alamat);
        this.id = id;
    }

    //getter

    public String getId() {
        return id;
    }

    //overriding method

    @Override
    public String getNama() {
        return super.getNama();
    }

    @Override
    public String getAlamat() {
        return super.getAlamat();
    }
}

