
public class Fotbalist extends Sportiv {

    private String echipa;
    private String post;
    private int numarTricou;
    private int goluri;
    private int meciuriJucate;

    // Constructor fara argumente
    public Fotbalist() {
        super();
        this.echipa = "";
        this.post = "";
        this.numarTricou = 0;
        this.goluri = 0;
        this.meciuriJucate = 0;
    }

    // Constructor cu toate argumentele
    public Fotbalist(String nume, String prenume, int varsta,
                     double greutate, double inaltime,
                     String echipa, String post,
                     int numarTricou, int goluri, int meciuriJucate) {

        super(nume, prenume, varsta, greutate, inaltime);

        this.echipa = echipa;
        this.post = post;
        this.numarTricou = numarTricou;
        this.goluri = goluri;
        this.meciuriJucate = meciuriJucate;
    }

    // Constructor de copiere
    public Fotbalist(Fotbalist altFotbalist) {
        super(altFotbalist);

        this.echipa = altFotbalist.echipa;
        this.post = altFotbalist.post;
        this.numarTricou = altFotbalist.numarTricou;
        this.goluri = altFotbalist.goluri;
        this.meciuriJucate = altFotbalist.meciuriJucate;
    }

    public String getEchipa() {
        return echipa;
    }

    public void setEchipa(String echipa) {
        this.echipa = echipa;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getNumarTricou() {
        return numarTricou;
    }

    public void setNumarTricou(int numarTricou) {
        this.numarTricou = numarTricou;
    }

    public int getGoluri() {
        return goluri;
    }

    public void setGoluri(int goluri) {
        this.goluri = goluri;
    }

    public int getMeciuriJucate() {
        return meciuriJucate;
    }

    public void setMeciuriJucate(int meciuriJucate) {
        this.meciuriJucate = meciuriJucate;
    }

    @Override
    public void practicaSportul() {
        System.out.println("Fotbalistul joaca fotbal.");
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Echipa: " + echipa +
                ", Post: " + post +
                ", Numar tricou: " + numarTricou +
                ", Goluri: " + goluri +
                ", Meciuri jucate: " + meciuriJucate;
    }
}
