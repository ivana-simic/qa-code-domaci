package projekat1;

public class Main {
    public static void main(String[] args) {

        Hotel hotel=new Hotel("Mark","Beograd","Restoran Mark",true,35,12,38,false);

        hotel.stampajSve();

        hotel.promeniImeRestorana("S[ecial Mark");
        hotel.umanjiParkingMesta(7);
        hotel.dodajJedanApartman();
        hotel.dodajSobe(4);

        hotel.stampajSve();

        Hotel hotel1=new Hotel();
        hotel1.ime="Mark";
        hotel1.mesto="Beograd";
        hotel1.imeRestorana="Mark Restoran";
        hotel1.garaza=false;
        hotel1.brParkingMesta=47;
        hotel1.brApartmana=14;
        hotel1.brSoba=23;
        hotel1.spa=true;
        hotel1.stampajSve();
        hotel1.promeniImeRestorana("Markov Restoran");
        hotel1.umanjiParkingMesta(4);
        hotel.dodajJedanApartman();
        hotel1.dodajSobe(8);
        hotel1.stampajSve();


    }
}
