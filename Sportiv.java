
public class Sportiv {

    protected String nume;
    protected String prenume;
    protected int varsta;

    public Sportiv(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public void afiseazaDateGenerale() {
        System.out.println("Nume: " + nume);
        System.out.println("Prenume: " + prenume);
        System.out.println("Varsta: " + varsta);
    }
}
