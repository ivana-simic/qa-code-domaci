package nasledjivanje_zadatak1;

public class MarkoStudent extends Student {

    public String punoIme;
    public String imeOca;
    public int brIndexa;

    public void stampajMarko(){
        System.out.println("Ime i prezime: "+punoIme);
        System.out.println("Ime oca: "+imeOca);
        System.out.println("Broj indexa: "+brIndexa);
        System.out.println("Fakultet: "+imeFakulteta);
        System.out.println("Fakultet traje "+trajanjeFakulteta+"godine");
        System.out.println("Zavrsena srednja skola "+zavrsenaSrednja);
    }



}
