package prvih10zadataka;

import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("a=");
        double a=sc.nextDouble();
        System.out.println("b=");
        double b=sc.nextDouble();
        System.out.println("c=");
        double c=sc.nextDouble();
        System.out.println("d=");
        double d=sc.nextDouble();

        double x=(a+b+c+d)/4;
        System.out.println("x="+x);
        System.out.println("Aritmeticka sredina je "+x);
    }
}
