
public class Inotator extends Sportiv {

    private String stilPreferat;
    private int medalii;
    private double timpProba;
    private int competitii;
    private String club;

    // Constructor fara argumente
    public Inotator() {
        super();
        this.stilPreferat = "";
        this.medalii = 0;
        this.timpProba = 0;
        this.competitii = 0;
        this.club = "";
    }

    // Constructor cu toate argumentele
    public Inotator(String nume, String prenume, int varsta,
                    double greutate, double inaltime,
                    String stilPreferat, int medalii,
                    double timpProba, int competitii, String club) {

        super(nume, prenume, varsta, greutate, inaltime);

        this.stilPreferat = stilPreferat;
        this.medalii = medalii;
        this.timpProba = timpProba;
        this.competitii = competitii;
        this.club = club;
    }

    // Constructor de copiere
    public Inotator(Inotator altInotator) {
        super(altInotator);

        this.stilPreferat = altInotator.stilPreferat;
        this.medalii = altInotator.medalii;
        this.timpProba = altInotator.timpProba;
        this.competitii = altInotator.competitii;
        this.club = altInotator.club;
    }

    public String getStilPreferat() {
        return stilPreferat;
    }

    public void setStilPreferat(String stilPreferat) {
        this.stilPreferat = stilPreferat;
    }

    public int getMedalii() {
        return medalii;
    }

    public void setMedalii(int medalii) {
        this.medalii = medalii;
    }

    public double getTimpProba() {
        return timpProba;
    }

    public void setTimpProba(double timpProba) {
        this.timpProba = timpProba;
    }

    public int getCompetitii() {
        return competitii;
    }

    public void setCompetitii(int competitii) {
        this.competitii = competitii;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    @Override
    public void practicaSportul() {
        System.out.println("Inotatorul practica inotul.");
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Stil preferat: " + stilPreferat +
                ", Medalii: " + medalii +
                ", Timp proba: " + timpProba +
                ", Competitii: " + competitii +
                ", Club: " + club;
    }
}
