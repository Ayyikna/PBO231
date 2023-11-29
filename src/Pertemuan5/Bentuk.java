package Pertemuan5;

abstract class Bentuk {
    public abstract double Luas();
    public abstract double Keliling();
}

class Lingkaran extends Bentuk {
    private double radius;

    public Lingkaran(double radius) {
        this.radius = radius;
    }

    @Override
    public double Luas() {
        return Math.PI * radius * radius;
    }

    @Override
    public double Keliling() {
        return 2 * Math.PI * radius;
    }
}

