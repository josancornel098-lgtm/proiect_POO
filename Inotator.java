
public class Inotator extends Sportiv implements SportivInterface {

    private int medalii;
    private double timpProba;

    public Inotator(String nume, String prenume, int varsta,
                    int medalii, double timpProba) {

        super(nume, prenume, varsta);

        this.medalii = medalii;
        this.timpProba = timpProba;
    }

    @Override
    public void afiseazaInformatii() {
        System.out.println("=== INOTATOR ===");
        afiseazaDateGenerale();
        System.out.println("Medalii: " + medalii);
        System.out.println("Timp proba: " + timpProba + " secunde");
    }

    @Override
    public void calculeazaPerformanta() {
        System.out.println("Performanta: " + medalii +
                " medalii obtinute.");
        System.out.println("Timpul probei: " + timpProba + " secunde.");
    }
}
