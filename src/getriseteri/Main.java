package getriseteri;

public class Main {
    public static void main(String[] args) {

        Osoba osoba=new Osoba();
        osoba.setPunoIme("Marko Markovic");
        osoba.setJmbg("2509981345123");
        osoba.setMestoRodjenja("Beograd");
        osoba.setGodine(42);
        osoba.setVisina(195);
        osoba.setTezina(103);

        System.out.println("IME I PREZIME: "+osoba.getPunoIme());
        System.out.println("JMBG: "+osoba.getJmbg());
        System.out.println("MESTO RODJENJA: "+osoba.getMestoRodjenja());
        System.out.println("GODINE: "+osoba.getGodine());
        System.out.println("VISINA: "+osoba.getVisina()+"cm");
        System.out.println("TEZINA: "+osoba.getTezina()+"kg");
    }
}
