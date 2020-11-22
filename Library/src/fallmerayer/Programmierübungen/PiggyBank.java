package it.fallmerayer.Programmierübungen;
import java.util.Scanner;

public class PiggyBank {
    private int one_cent, ten_cent, fifty_cent, one_euro, max;
    boolean broken;

    public void init(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte gib die maximale Anzahl an Münzen ein");
        max = sc.nextInt();

    }

    public int getTotalCoins(){
        return one_cent + ten_cent + fifty_cent + one_euro;
    }

    public int add1cent(int numberOfCoins){
        int totalCoins = getTotalCoins();
        if (totalCoins + numberOfCoins > max) {
            one_cent = max;
            return (totalCoins + numberOfCoins) - max;
        }else {
            one_cent += numberOfCoins;
            return 0;
        }
    }

    public int add10cent(int numberOfCoins){
        int totalCoins = getTotalCoins();
        if (totalCoins + numberOfCoins > max) {
            ten_cent = max;
            return (totalCoins + numberOfCoins) - max;
        }else {
            ten_cent += numberOfCoins;
            return 0;
        }
    }

    public int add50cent(int numberOfCoins){
        int totalCoins = getTotalCoins();
        if (totalCoins + numberOfCoins > max) {
            fifty_cent = max;
            return (totalCoins + numberOfCoins) - max;
        }else {
            fifty_cent += numberOfCoins;
            return 0;
        }
    }

    public int add1euro(int numberOfCoins){
        int totalCoins = getTotalCoins();
        if (totalCoins + numberOfCoins > max) {
            one_euro = max;
            return (totalCoins + numberOfCoins) - max;
        }else {
            one_euro += numberOfCoins;
            return 0;
        }
    }


    public boolean isEmpty(){
        return getTotalCoins() == 0;
    }

    public boolean isFull(){
        return getTotalCoins() == max;
    }

    public boolean isBroken(){
        return broken;
    }

    public int breakInto(){
        broken = true;
        System.out.println("1Cent: " + one_cent + " 10Cent: " + ten_cent + " 50Cent: " + fifty_cent + " 1Euro: " + one_euro);
        int total = one_cent + ten_cent + fifty_cent + one_euro * 100;
        one_cent = 0; ten_cent = 0; fifty_cent = 0; one_euro = 0;
        return total;
    }

    public static void main(String[] args) {
        PiggyBank patzeSpart = new PiggyBank();
        patzeSpart.init();
        System.out.println("IsEmpty?: " + patzeSpart.isEmpty());
        System.out.println("IsFull?: " + patzeSpart.isFull());
        System.out.println("Adding 5 cents...");
        System.out.println("Number of coins that are too much: " + patzeSpart.add1cent(5));
        System.out.println("IsEmpty?: " + patzeSpart.isEmpty());
        System.out.println("IsFull?: " + patzeSpart.isFull());
        System.out.println("IsBroken?: " + patzeSpart.isBroken());
        System.out.println("Breaking the PiggyBank");
        System.out.println("Dein erspartes: " + patzeSpart.breakInto());
        System.out.println("IsBroken?: " + patzeSpart.isBroken());
    }
}
