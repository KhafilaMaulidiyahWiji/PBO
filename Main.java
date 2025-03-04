package FifthWeeks;

/**
 *
 * @author Khafila Maulidiyah W
 */

// Kelas Induk (Superclass)
abstract class BangunDatar {
    abstract double luas();
    abstract double keliling();
}

// Kelas Turunan Persegi
class Persegi extends BangunDatar {
    double sisi;

    Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    double luas() {
        return sisi * sisi;
    }

    @Override
    double keliling() {
        return 4 * sisi;
    }
}

// Kelas Turunan Lingkaran
class Lingkaran extends BangunDatar {
    double r;

    Lingkaran(double r) {
        this.r = r;
    }

    @Override
    double luas() {
        return Math.PI * r * r;
    }

    @Override
    double keliling() {
        return 2 * Math.PI * r;
    }
}

// Kelas Turunan Segitiga
class Segitiga extends BangunDatar {
    double alas, tinggi;

    Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    double luas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    double keliling() {
        // Misalkan segitiga sama kaki untuk contoh
        double sisiMiring = Math.sqrt((alas / 2) * (alas / 2) + tinggi * tinggi);
        return alas + 2 * sisiMiring;
    }
}

// Kelas Main
public class Main {
    public static void main(String[] args) {
        BangunDatar persegi = new Persegi(4);
        BangunDatar lingkaran = new Lingkaran(7);
        BangunDatar segitiga = new Segitiga(6, 8);

        System.out.println("Luas Persegi: " + persegi.luas());
        System.out.println("Keliling Persegi: " + persegi.keliling());

        System.out.println("Luas Lingkaran: " + lingkaran.luas());
        System.out.println("Keliling Lingkaran: " + lingkaran.keliling());

        System.out.println("Luas Segitiga: " + segitiga.luas());
        System.out.println("Keliling Segitiga: " + segitiga.keliling());
    }
}
