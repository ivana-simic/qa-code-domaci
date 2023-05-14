package petlje;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Automobil automobil = new Automobil();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite marku automobila");
        automobil.marka = scanner.nextLine();

        if (automobil.marka.equals("mercedes") || automobil.marka.equals("opel")) {
            System.out.println("Auto je iz Nemacke");
        } else {
            System.out.println("Auto nije iz Nemacke");
        }




        System.out.println("Unesite broj vrata");
        automobil.brVrata = scanner.nextInt();

        if (automobil.brVrata == 2) {
            System.out.println("Auto je kupe");
        } else {
            System.out.println("Auto nije kupe");
        }
        scanner.nextLine();
        System.out.println("Unesite model automobila");
        automobil.model = scanner.nextLine();
        System.out.println(automobil.model);
        if (automobil.model.equals("c220") ) {
            System.out.println("Ovo je Stefanov auto");
        } else {
            System.out.println("Ne znam ciji je auto");
        }



    }
}
