package Pertemuan5;

abstract class Kendaraan {
    public abstract void mulai();
    public abstract void berhenti();
}

class Mobil extends Kendaraan {
    @Override
    public void mulai() {
        System.out.println("Mobil bergerak.");
    }

    @Override
    public void berhenti() {
        System.out.println("Mobil berhenti.");
    }
}

