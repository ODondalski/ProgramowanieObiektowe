package com.company;

public class Main {

    public static void main(String[] args) {
        // zad1
        System.out.println(31 + 29 + 31);
        // zad2
        int sumx = 0;
        for(int i = 1; i <= 10; i ++) {
            sumx += i;
        }
        System.out.println(sumx);
        // zad3
        int multiplyx = 1;
        for(int i = 1; i <= 10; i ++){
            multiplyx *= i;
        }
        System.out.println(multiplyx);
        // zad4
        float saldo = 1000;
        for(int i = 0; i < 3; i ++){
            saldo += saldo * 0.06;
        }
        System.out.println(saldo);
        // zad5
        String symbol = "\u2202";
        System.out.println("+------+");
        System.out.println("| Java |");
        System.out.println("+------+\n");
        // zad6
        System.out.println("  ////// ");
        System.out.println(" +\"\"\"\"\"+");
        System.out.println("(| " + symbol + " " + symbol + " |)");
        System.out.println("  | ^ |");
        System.out.println(" | `-` |");
        System.out.println(" +-----+");
        // zad10
        System.out.println("Terminator\nRambo\nJames Bond\n");
        // zad11
        System.out.println("""
                Istnieli albo nie istnieli.

                Na wyspie albo nie na wyspie.

                Ocean albo nie ocean

                połknął ich albo nie.

                \s

                Czy było komu kogoś słuchać kogo?

                Czy było komu walczyć z kim?

                Działo się wszystko albo nic

                tam albo nie tam.

                \s

                Miast siedem stało.

                Czy na pewno?

                Stać wiecznie chciało.

                Gdzie dowody?

                \s

                Nie wymyślili prochu, nie.

                \s

                Proch wymyślili, tak.

                Przypuszczalni. Wątpliwi.

                \s

                Nie wyjęci z powietrza,

                z ognia, z wody, z ziemi.

                \s

                Nie zawarci w kamieniu

                ani w kropli deszczu.

                \s

                Nie mogący na serio

                pozować do przestróg.

                \s

                Meteor spadł.

                To nie meteor.

                Wulkan wybuchnął.

                To nie wulkan.

                Ktoś wołał coś.

                Niczego nikt.

                \s

                Na tej plus minus Atlantydzie.""");
    }
}
