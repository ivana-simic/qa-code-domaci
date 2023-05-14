package prvih10zadataka;

import java.util.Scanner;

public class Zad10 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Unesite temperaturu(Kelvin)");
        double kelvin=sc.nextDouble();
        double celsius=kelvin-(double) 273.15;
        System.out.format("Temperatura u Celsiusu je "+ "%.2f" ,celsius);

    }
}
