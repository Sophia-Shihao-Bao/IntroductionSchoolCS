import java.util.Scanner;
public class WhatAlien {
    public static void main(String[] args){
        Scanner antennas = new Scanner(System.in);
        System.out.println("How many antennas?");
        int antennasI = antennas.nextInt();
        Scanner eyes  = new Scanner(System.in);
        System.out.println("How many eyes?");
        int eyesI = eyes.nextInt();
        if((antennasI>3) && (eyesI<=4)) {
            System.out.println("TroyMartian");
        }
        if ((antennasI<=6)&&(eyesI>=2)) {
            System.out.println("VladSaturnian");
        }
        if ((antennasI<=2)&&(eyesI<=3)) {
            System.out.println("GraemeMercurian");
        } else {
            System.out.println(" ");
        }
    }
}
