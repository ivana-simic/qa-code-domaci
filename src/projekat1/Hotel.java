package projekat1;

public class Hotel {
    public String ime;
    public String mesto;
    public String imeRestorana;
    public boolean garaza;
    public int brParkingMesta;
    public int brApartmana;
    public int brSoba;
    public boolean spa;


    public Hotel(String ime,String mesto,String imeRestorana,boolean garaza,int brParkingMesta,int brApartmana,int brSoba,boolean spa){
        this.ime=ime;
        this.mesto=mesto;
        this.imeRestorana=imeRestorana;
        this.garaza=garaza;
        this.brParkingMesta=brParkingMesta;
        this.brApartmana=brApartmana;
        this.brSoba=brSoba;
        this.spa=spa;
    }

    public void promeniImeRestorana(String novoIme){
        this.imeRestorana=novoIme;
    }

    public void umanjiParkingMesta(int zaOvajBr){
        this.brParkingMesta=this.brParkingMesta-zaOvajBr;
    }

    public void dodajJedanApartman(){
        this.brApartmana++;
    }

    public void dodajSobe(int zaOvoliko){
        this.brSoba=this.brSoba+zaOvoliko;
    }

    public void stampajSve(){
        System.out.println("IME HOTELA: "+ime);
        System.out.println("MESTO: "+mesto);
        System.out.println("IME RESTORANA: "+   imeRestorana);
        System.out.println("GARAZA: "+garaza);
        System.out.println("BROJ PARKING MESTA: "+brParkingMesta);
        System.out.println("BROJ APARTMANA: "+brApartmana);
        System.out.println("BROJ SOBA: "+brSoba);
        System.out.println("SPA: "+spa);
    }
    public Hotel(){}

}
