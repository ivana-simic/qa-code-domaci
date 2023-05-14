package petlje;

import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Unesite visinu igraca");
        double visina=scanner.nextDouble();

        if (visina<=50 || visina>250){
            System.out.println("Nemoguce da igrate");
        } else if (visina<185){
            System.out.println("Igrate na poziciji plej");
        } else if (visina<200){
            System.out.println("Igrate na poziciji 2-4");
        } else {
            System.out.println("Igrate na poziciji centar");
        }
    }

}
