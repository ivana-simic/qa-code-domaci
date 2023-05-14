package petlje;

import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite broj godina");
        int brGodina = scanner.nextInt();

        if (brGodina == 18) {
            System.out.println("Osoba ima 18 godina");
        } else if (brGodina > 18) {
            System.out.println("Osoba je punoletna");
        } else {
            System.out.println("Osoba je maloletna");
        }

    }
}
