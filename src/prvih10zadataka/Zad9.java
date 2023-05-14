package prvih10zadataka;

import java.util.Scanner;

public class Zad9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("a=");
        int a=sc.nextInt();
        int p=a*a;
        System.out.println("Povrsina kvadrata je "+p);
        int o=4*a;
        System.out.println("Obim kvadrata je "+o);
    }
}
