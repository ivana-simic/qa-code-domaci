package getriseteri;

public class Osoba {
    private String punoIme;
    private String jmbg;
    private String mestoRodjenja;
    private int godine;
    private double visina;
    private double tezina;


    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public void setMestoRodjenja(String mestoRodjenja) {
        this.mestoRodjenja = mestoRodjenja;
    }

    public void setGodine(int godine) {
        this.godine = godine;
    }

    public void setVisina(double visina) {
        this.visina = visina;
    }

    public void setTezina(double tezina) {
        this.tezina = tezina;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public String getJmbg() {
        return jmbg;
    }

    public String getMestoRodjenja() {
        return mestoRodjenja;
    }

    public int getGodine() {
        return godine;
    }

    public double getVisina() {
        return visina;
    }

    public double getTezina() {
        return tezina;
    }
}
