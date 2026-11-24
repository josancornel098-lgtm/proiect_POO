
public class Atlet extends SportivIndividual {

    private String proba;
    private double recordPersonal;
    private double inaltime;
    private double greutate;
    private int numarMedalii;

    // Constructor fara argumente
    public Atlet() {
        super();
        this.proba = "";
        this.recordPersonal = 0;
        this.inaltime = 0;
        this.greutate = 0;
        this.numarMedalii = 0;
    }

    // Constructor cu toate argumentele
    public Atlet(String nume, String prenume, int varsta,
                 String disciplina, String tara,
                 int aniExperienta, int numarCompetitii,
                 int anDebut, String proba,
                 double recordPersonal, double inaltime,
                 double greutate, int numarMedalii) {

        super(nume, prenume, varsta, disciplina, tara,
                aniExperienta, numarCompetitii, anDebut);

        this.proba = proba;
        this.recordPersonal = recordPersonal;
        this.inaltime = inaltime;
        this.greutate = greutate;
        this.numarMedalii = numarMedalii;
    }

    // Constructor de copiere
    public Atlet(Atlet altul) {
        super(altul);
        this.proba = altul.proba;
        this.recordPersonal = altul.recordPersonal;
        this.inaltime = altul.inaltime;
        this.greutate = altul.greutate;
        this.numarMedalii = altul.numarMedalii;
    }

    // Getteri si setteri
    public String getProba() {
        return proba;
    }

    public void setProba(String proba) {
        this.proba = proba;
    }

    public double getRecordPersonal() {
        return recordPersonal;
    }

    public void setRecordPersonal(double recordPersonal) {
        this.recordPersonal = recordPersonal;
    }

    public double getInaltime() {
        return inaltime;
    }

    public void setInaltime(double inaltime) {
        this.inaltime = inaltime;
    }

    public double getGreutate() {
        return greutate;
    }

    public void setGreutate(double greutate) {
        this.greutate = greutate;
    }

    public int getNumarMedalii() {
        return numarMedalii;
    }

    public void setNumarMedalii(int numarMedalii) {
        this.numarMedalii = numarMedalii;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nAtlet{" +
                "proba='" + proba + '\'' +
                ", recordPersonal=" + recordPersonal +
                ", inaltime=" + inaltime +
                ", greutate=" + greutate +
                ", numarMedalii=" + numarMedalii +
                '}';
    }
}
