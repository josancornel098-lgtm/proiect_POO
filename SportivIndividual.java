
public class SportivIndividual extends Sportiv {

    private String disciplina;
    private String tara;
    private int aniExperienta;
    private int numarCompetitii;
    private int anDebut;

    // Constructor fara argumente
    public SportivIndividual() {
        super("", "", 0);
        this.disciplina = "";
        this.tara = "";
        this.aniExperienta = 0;
        this.numarCompetitii = 0;
        this.anDebut = 0;
    }

    // Constructor cu toate argumentele
    public SportivIndividual(String nume, String prenume, int varsta,
                             String disciplina, String tara,
                             int aniExperienta, int numarCompetitii,
                             int anDebut) {

        super(nume, prenume, varsta);
        this.disciplina = disciplina;
        this.tara = tara;
        this.aniExperienta = aniExperienta;
        this.numarCompetitii = numarCompetitii;
        this.anDebut = anDebut;
    }

    // Constructor de copiere
    public SportivIndividual(SportivIndividual altul) {
        super(altul.nume, altul.prenume, altul.varsta);
        this.disciplina = altul.disciplina;
        this.tara = altul.tara;
        this.aniExperienta = altul.aniExperienta;
        this.numarCompetitii = altul.numarCompetitii;
        this.anDebut = altul.anDebut;
    }

    // Getteri si setteri
    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getTara() {
        return tara;
    }

    public void setTara(String tara) {
        this.tara = tara;
    }

    public int getAniExperienta() {
        return aniExperienta;
    }

    public void setAniExperienta(int aniExperienta) {
        this.aniExperienta = aniExperienta;
    }

    public int getNumarCompetitii() {
        return numarCompetitii;
    }

    public void setNumarCompetitii(int numarCompetitii) {
        this.numarCompetitii = numarCompetitii;
    }

    public int getAnDebut() {
        return anDebut;
    }

    public void setAnDebut(int anDebut) {
        this.anDebut = anDebut;
    }

    @Override
    public String toString() {
        return "SportivIndividual{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", varsta=" + varsta +
                ", disciplina='" + disciplina + '\'' +
                ", tara='" + tara + '\'' +
                ", aniExperienta=" + aniExperienta +
                ", numarCompetitii=" + numarCompetitii +
                ", anDebut=" + anDebut +
                '}';
    }
}
