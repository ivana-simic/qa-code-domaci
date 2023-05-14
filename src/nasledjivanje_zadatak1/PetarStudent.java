package nasledjivanje_zadatak1;

public class PetarStudent extends Student {

    public String punoIme;
    public String jmbg;
    public int brojGodina;
    public int ocena;
    public double prosek;

    public void popraviOcenu(int novaOcena){
        this.ocena=novaOcena;
    }

    public int sabiranje(int a,int b,int c,int d){
        return a+b+c+d;
    }
    public double deljenje(int sabiranje,int b){
        return (double) (sabiranje/b);
    }

    public void stampajPetar(){
        System.out.println("Ime i prezime studenta "+punoIme);
        System.out.println("Jmbg: "+jmbg);
        System.out.println("Godine: "+brojGodina);
        System.out.println("Polozen ispit ocenom "+ocena);
        System.out.println("Prosek: "+prosek);
        System.out.println("Fakultet: "+imeFakulteta);
        System.out.println("Fakultet traje "+trajanjeFakulteta+"godine");
        System.out.println("Zavrsena srednja skola "+zavrsenaSrednja);
    }


}
