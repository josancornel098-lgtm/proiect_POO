
public class Fotbalist extends Sportiv implements SportivInterface {

    private String echipa;
    private int goluri;

    public Fotbalist(String nume, String prenume, int varsta,
                     String echipa, int goluri) {

        super(nume, prenume, varsta);

        this.echipa = echipa;
        this.goluri = goluri;
    }

    @Override
    public void afiseazaInformatii() {
        System.out.println("=== FOTBALIST ===");
        afiseazaDateGenerale();
        System.out.println("Echipa: " + echipa);
        System.out.println("Goluri: " + goluri);
    }

    @Override
    public void calculeazaPerformanta() {
        System.out.println("Performanta: " + goluri + " goluri marcate.");
    }
}
