package nasledjivanje_zadatak2;

public class Main {
    public static void main(String[] args) {

        Direktor direktor=new Direktor();
        direktor.dnevnica=1000;
        direktor.obracunajOsnovnuPlatu();
        System.out.println("Plata direktora je "+direktor.direktorPlata());

        Radnik1 radnik1=new Radnik1();
        radnik1.dnevnica=1000;
        System.out.println("nasledjivanje.Radnik 1 ima platu "+radnik1.radnik1Plata());

        Radnik2 radnik2=new Radnik2();
        radnik2.dnevnica=1000;
        System.out.println("nasledjivanje.Radnik 2 ima platu "+radnik2.radnik2Plata());
    }
}
