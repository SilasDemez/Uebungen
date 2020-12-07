package ue3;

import java.util.Scanner;

public class Main {

    public static double readDouble(String message){
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextDouble();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double laenge = readDouble("Bitte geben Sie die Kantenlänge ein!");
        double radius = readDouble("Bitte geben Sie den Radius ein!");
        Wuerfel w1 = new Wuerfel(laenge);
        Kugel k1 = new Kugel(radius);
        System.out.println("Volumen Würfel = " + w1.getVolumen());
        System.out.println("Volumen Kugel = " + k1.getVolumen());

        double inkrement = readDouble("Bitte gib den Inkrementwert ein");

        if (w1.getVolumen() >= k1.getVolumen()) {
            //Volumen Würfel ist größer als Kugel
            while (w1.getVolumen() >= k1.getVolumen()) {
                w1.veraendern(-inkrement);
                k1.veraendern(inkrement);
            }

        }else{
            //Volumen Kugel ist größer als Würfel
            while (w1.getVolumen() <= k1.getVolumen()) {
                k1.veraendern(-inkrement);
                w1.veraendern(inkrement);
            }
        }

        System.out.println("Volumen Würfel = " + w1.getVolumen());
        System.out.println("Volumen Kugel = " + k1.getVolumen());
        System.out.println("Oberfläche Würfel = " + w1.getOberflaeche());
        System.out.println("Oberfläche Kugel = " + k1.getOberflaeche());
    }
}
