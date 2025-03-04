package FifthWeeks;

/**
 *
 * @author Khafila Maulidiyah W
 */
// Kelas induk
class Main {
    void mainkan() {
        System.out.println("Memainkan alat musik...");
    }
}

// Kelas turunan Gitar
class Gitar extends Main {
    @Override
    void mainkan() {
        System.out.println("Bunyi gitar: Jreng... Jreng...");
    }
}

// Kelas turunan Piano
class Piano extends Main {
    @Override
    void mainkan() {
        System.out.println("Bunyi piano: Pling... Pling...");
    }
}

// Kelas utama
public class AlatMusik {
    public static void main(String[] args) {
        Main a1 = new Gitar();
        Main a2 = new Piano();

        a1.mainkan();
        a2.mainkan();
    }
}
