
public class Main {

    public static void main(String[] args) {

        // ==============================
        // FOTBALISTI
        // ==============================

        Fotbalist f1 = new Fotbalist(
                "Popescu", "Andrei", 22, "Steaua", 15);

        Fotbalist f2 = new Fotbalist(
                "Ionescu", "Mihai", 25, "Dinamo", 20);

        System.out.println("===== FOTBALISTI =====");

        f1.afiseazaInformatii();
        f1.calculeazaPerformanta();

        System.out.println();

        f2.afiseazaInformatii();
        f2.calculeazaPerformanta();


        // ==============================
        // INOTATORI
        // ==============================

        Inotator i1 = new Inotator(
                "Marinescu", "Ana", 19, 5, 48.5);

        Inotator i2 = new Inotator(
                "Dumitru", "Elena", 21, 3, 52.3);

        System.out.println("\n===== INOTATORI =====");

        i1.afiseazaInformatii();
        i1.calculeazaPerformanta();

        System.out.println();

        i2.afiseazaInformatii();
        i2.calculeazaPerformanta();


        // ==============================
        // SPORTIV INDIVIDUAL
        // ==============================

        SportivIndividual s1 = new SportivIndividual(
                "Georgescu", "Mihai", 23,
                "Atletism", "Romania",
                5, 20, 2019);

        System.out.println("\n===== SPORTIV INDIVIDUAL =====");

        System.out.println(s1);


        // ==============================
        // ATLET
        // ==============================

        Atlet a1 = new Atlet(
                "Popa", "Alexandru", 24,
                "Atletism", "Romania",
                6, 30, 2018,
                "Alergare 100m", 10.25,
                1.82, 75.0, 8);

        System.out.println("\n===== ATLET =====");

        System.out.println(a1);


        // ==============================
        // CONSTRUCTOR DE COPIERE
        // ==============================

        Atlet a2 = new Atlet(a1);

        System.out.println("\n===== COPIE ATLET =====");

        System.out.println(a2);


        // ==============================
        // TESTARE SETTER SI GETTER
        // ==============================

        a2.setNumarMedalii(10);

        System.out.println("\n===== TESTARE SET SI GET =====");

        System.out.println("Numarul de medalii: "
                + a2.getNumarMedalii());

        System.out.println("\nProgramul s-a terminat.");
    }
}
