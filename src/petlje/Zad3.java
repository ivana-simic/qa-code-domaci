package petlje;

import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {

        Scanner scanne=new Scanner(System.in);
        System.out.println("Unesite godinu rodjenja");
        int godRodjena=scanne.nextInt();
        int trenutnoGodina=2023-godRodjena;

        if (trenutnoGodina>150 || trenutnoGodina<0){
            System.out.println("Nemoguce");
        } else{
            System.out.println("Imate "+trenutnoGodina+" god");
        }
        }
}
