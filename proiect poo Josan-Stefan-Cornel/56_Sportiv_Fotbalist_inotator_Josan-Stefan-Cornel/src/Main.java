
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // VECTOR CU 10 FOTBALISTI
        Object[] fotbalisti = new Fotbalist[10];

        fotbalisti[0] = new Fotbalist("Popescu", "Andrei", 22, 75, 180, "Steaua", "Atacant", 9, 15, 20);
        fotbalisti[1] = new Fotbalist("Ionescu", "Mihai", 25, 80, 185, "Dinamo", "Fundas", 4, 3, 25);
        fotbalisti[2] = new Fotbalist("Marin", "Alex", 21, 72, 178, "Rapid", "Mijlocas", 8, 7, 18);
        fotbalisti[3] = new Fotbalist("Dumitru", "Vlad", 24, 78, 182, "CFR Cluj", "Portar", 1, 0, 30);
        fotbalisti[4] = new Fotbalist("Stan", "Robert", 23, 76, 181, "FCSB", "Atacant", 10, 12, 22);
        fotbalisti[5] = new Fotbalist("Radu", "Cristian", 26, 82, 187, "U Cluj", "Fundas", 5, 2, 28);
        fotbalisti[6] = new Fotbalist("Matei", "Daniel", 20, 70, 175, "Farul", "Mijlocas", 6, 5, 15);
        fotbalisti[7] = new Fotbalist("Ilie", "George", 27, 85, 190, "Sepsi", "Portar", 12, 0, 32);
        fotbalisti[8] = new Fotbalist("Enache", "Paul", 22, 74, 179, "UTA", "Atacant", 11, 9, 19);
        fotbalisti[9] = new Fotbalist("Tudor", "Stefan", 24, 77, 183, "Petrolul", "Mijlocas", 7, 6, 21);


        // VECTOR CU 10 INOTATORI
        Object[] inotatori = new Inotator[10];

        inotatori[0] = new Inotator("Popa", "Maria", 20, 55, 170, "Liber", 5, 58.5, 12, "CSM");
        inotatori[1] = new Inotator("Vasilescu", "Ana", 22, 58, 172, "Bras", 3, 65.2, 15, "Steaua");
        inotatori[2] = new Inotator("Georgescu", "Elena", 19, 53, 168, "Fluture", 7, 60.1, 10, "Dinamo");
        inotatori[3] = new Inotator("Munteanu", "Ioana", 24, 60, 175, "Spate", 4, 62.3, 18, "Rapid");
        inotatori[4] = new Inotator("Dobre", "Laura", 21, 57, 171, "Liber", 6, 55.8, 14, "CSM");
        inotatori[5] = new Inotator("Barbu", "Elisa", 23, 59, 173, "Bras", 2, 68.4, 16, "Steaua");
        inotatori[6] = new Inotator("Neagu", "Bianca", 20, 54, 169, "Fluture", 8, 59.7, 11, "Dinamo");
        inotatori[7] = new Inotator("Preda", "Diana", 25, 62, 176, "Spate", 5, 63.9, 20, "Rapid");
        inotatori[8] = new Inotator("Lazar", "Sofia", 18, 52, 167, "Liber", 3, 57.2, 9, "CSM");
        inotatori[9] = new Inotator("Nistor", "Eva", 22, 56, 170, "Bras", 4, 66.1, 13, "Steaua");


        // AFISAREA TUTUROR FOTBALISTILOR
        System.out.println("===== LISTA FOTBALISTILOR =====");

        for (int i = 0; i < fotbalisti.length; i++) {
            System.out.println(fotbalisti[i]);
        }


        // AFISAREA TUTUROR INOTATORILOR
        System.out.println("\n===== LISTA INOTATORILOR =====");

        for (int i = 0; i < inotatori.length; i++) {
            System.out.println(inotatori[i]);
        }


        // CAUTARE FOTBALISTI
        System.out.println("\n===== CAUTARE FOTBALISTI =====");

        System.out.print("Introdu numarul minim de goluri: ");
        int goluriMinime = scanner.nextInt();

        System.out.print("Introdu varsta maxima: ");
        int varstaMaxima = scanner.nextInt();

        cautaFotbalisti(fotbalisti, goluriMinime, varstaMaxima);


        // CAUTARE INOTATORI
        System.out.println("\n===== CAUTARE INOTATORI =====");

        System.out.print("Introdu numarul minim de medalii: ");
        int medaliiMinime = scanner.nextInt();

        System.out.print("Introdu timpul maxim la proba: ");
        double timpMaxim = scanner.nextDouble();

        cautaInotatori(inotatori, medaliiMinime, timpMaxim);

        scanner.close();
    }


    // METODA DE CAUTARE A FOTBALISTILOR
    public static void cautaFotbalisti(Object[] fotbalisti,
                                       int goluriMinime,
                                       int varstaMaxima) {

        boolean gasit = false;

        for (int i = 0; i < fotbalisti.length; i++) {

            Fotbalist f = (Fotbalist) fotbalisti[i];

            if (f.getGoluri() >= goluriMinime &&
                    f.getVarsta() <= varstaMaxima) {

                System.out.println(f);
                gasit = true;
            }
        }

        if (!gasit) {
            System.out.println("Nu exista fotbalisti care sa respecte conditiile.");
        }
    }


    // METODA DE CAUTARE A INOTATORILOR
    public static void cautaInotatori(Object[] inotatori,
                                      int medaliiMinime,
                                      double timpMaxim) {

        boolean gasit = false;

        for (int i = 0; i < inotatori.length; i++) {

            Inotator in = (Inotator) inotatori[i];

            if (in.getMedalii() >= medaliiMinime &&
                    in.getTimpProba() <= timpMaxim) {

                System.out.println(in);
                gasit = true;
            }
        }

        if (!gasit) {
            System.out.println("Nu exista inotatori care sa respecte conditiile.");
        }
    }
}
