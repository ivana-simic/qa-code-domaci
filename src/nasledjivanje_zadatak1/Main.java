package nasledjivanje_zadatak1;

public class Main {
    public static void main(String[] args) {

        PetarStudent petarStudent=new PetarStudent();
        petarStudent.punoIme="Petar Petrovic";
        petarStudent.jmbg="2510986614289";
        petarStudent.brojGodina=36;
        petarStudent.ocena=8;
        petarStudent.popraviOcenu(9);

        petarStudent.sabiranje(7,8,9,7);


        petarStudent.prosek= petarStudent.deljenje(petarStudent.sabiranje(7,8,9,7),4);

        petarStudent.imeFakulteta="ETF";
        petarStudent.trajanjeFakulteta=4;
        petarStudent.zavrsenaSrednja=true;
        petarStudent.stampajPetar();


        MarkoStudent markoStudent= new MarkoStudent();
        markoStudent.punoIme="Marko Markovic";
        markoStudent.imeOca="Milos";
        markoStudent.brIndexa=54321;
        markoStudent.imeFakulteta="ETF";
        markoStudent.trajanjeFakulteta=4;
        markoStudent.zavrsenaSrednja=true;
        markoStudent.stampajMarko();



    }
}
