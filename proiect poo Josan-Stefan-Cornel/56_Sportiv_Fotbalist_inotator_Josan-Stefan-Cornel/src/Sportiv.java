
public abstract class Sportiv implements Sport {

    private String nume;
    private String prenume;
    private int varsta;
    private double greutate;
    private double inaltime;

    public Sportiv() {
        this.nume = "";
        this.prenume = "";
        this.varsta = 0;
        this.greutate = 0;
        this.inaltime = 0;
    }

    public Sportiv(String nume, String prenume, int varsta,
                   double greutate, double inaltime) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.greutate = greutate;
        this.inaltime = inaltime;
    }

    public Sportiv(Sportiv altSportiv) {
        this.nume = altSportiv.nume;
        this.prenume = altSportiv.prenume;
        this.varsta = altSportiv.varsta;
        this.greutate = altSportiv.greutate;
        this.inaltime = altSportiv.inaltime;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public double getGreutate() {
        return greutate;
    }

    public void setGreutate(double greutate) {
        this.greutate = greutate;
    }

    public double getInaltime() {
        return inaltime;
    }

    public void setInaltime(double inaltime) {
        this.inaltime = inaltime;
    }

    @Override
    public String toString() {
        return "Nume: " + nume +
                ", Prenume: " + prenume +
                ", Varsta: " + varsta +
                ", Greutate: " + greutate +
                ", Inaltime: " + inaltime;
    }
}
