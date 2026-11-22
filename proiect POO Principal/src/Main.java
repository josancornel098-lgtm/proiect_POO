
public class Main {

    public static void main(String[] args) {

        // Cream doi fotbalisti
        Fotbalist f1 = new Fotbalist(
                "Popescu", "Andrei", 22, "Steaua", 15);

        Fotbalist f2 = new Fotbalist(
                "Ionescu", "Mihai", 25, "Dinamo", 20);

        // Cream doi inotatori
        Inotator i1 = new Inotator(
                "Marinescu", "Ana", 19, 5, 48.5);

        Inotator i2 = new Inotator(
                "Dumitru", "Elena", 21, 3, 52.3);

        // Afisam informatiile fotbalistilor
        f1.afiseazaInformatii();
        f1.calculeazaPerformanta();

        System.out.println();

        f2.afiseazaInformatii();
        f2.calculeazaPerformanta();

        System.out.println();

        // Afisam informatiile inotatorilor
        i1.afiseazaInformatii();
        i1.calculeazaPerformanta();

        System.out.println();

        i2.afiseazaInformatii();
        i2.calculeazaPerformanta();
    }
}
