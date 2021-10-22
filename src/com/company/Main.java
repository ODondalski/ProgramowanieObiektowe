package com.company;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    static void javaz00(){
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
        /*
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
        */
    }
    static void javaz011(){
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Podaj n");
        String output = scan1.nextLine();
        int out = Integer.parseInt(output);
        double sum = 0;
        for(int i = 1; i <= out; i ++){
            Scanner scan2 = new Scanner(System.in);
            System.out.println("Podaj liczbe");
            String outputi = scan2.nextLine();
            double outi = Integer.parseInt(outputi);
            sum += outi;
        }
        System.out.println(sum);
    }
    static void javaz012(){
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Podaj n");
        String output = scan1.nextLine();
        int out = Integer.parseInt(output);
        double multiply = 1;
        for(int i = 1; i <= out; i ++){
            Scanner scan2 = new Scanner(System.in);
            System.out.println("Podaj liczbe");
            String outputi = scan2.nextLine();
            double outi = Integer.parseInt(outputi);
            multiply *= outi;
        }
        System.out.println(multiply);
    }
    static void javaz013(){
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Podaj n");
        String output = scan1.nextLine();
        int out = Integer.parseInt(output);
        double sum_abs = 0;
        for(int i = 1; i <= out; i ++){
            Scanner scan2 = new Scanner(System.in);
            System.out.println("Podaj liczbe");
            String outputi = scan2.nextLine();
            double outi = Integer.parseInt(outputi);
            outi = Math.abs(outi);
            sum_abs += outi;
        }
        System.out.println(sum_abs);
    }
    static void javaz014(){
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Podaj n");
        String output = scan1.nextLine();
        int out = Integer.parseInt(output);
        double sum_abs_round = 0;
        for(int i = 1; i <= out; i ++){
            Scanner scan2 = new Scanner(System.in);
            System.out.println("Podaj liczbe");
            String outputi = scan2.nextLine();
            double outi = Double.parseDouble(outputi);
            outi = Math.abs(outi);
            outi = Math.sqrt(outi);
            sum_abs_round += outi;
        }
        System.out.println(sum_abs_round);
    }
    static void javaz015(){
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Podaj n");
        String output = scan1.nextLine();
        int out = Integer.parseInt(output);
        double multiply_abs = 1;
        for(int i = 1; i <= out; i ++){
            Scanner scan2 = new Scanner(System.in);
            System.out.println("Podaj liczbe");
            String outputi = scan2.nextLine();
            double outi = Double.parseDouble(outputi);
            outi = Math.abs(outi);
            multiply_abs *= outi;
        }
        System.out.println(multiply_abs);
    }
    static void javaz016(){
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Podaj n");
        String output = scan1.nextLine();
        int out = Integer.parseInt(output);
        double sum_pow = 0;
        for(int i = 1; i <= out; i ++){
            Scanner scan2 = new Scanner(System.in);
            System.out.println("Podaj liczbe");
            String outputi = scan2.nextLine();
            double outi = Double.parseDouble(outputi);
            outi = Math.pow(outi, 2);
            sum_pow += outi;
        }
        System.out.println(sum_pow);
    }
    static void javaz017(){
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Podaj n");
        String output = scan1.nextLine();
        int out = Integer.parseInt(output);
        double sum = 0;
        double multiply = 1;
        for(int i = 1; i <= out; i ++){
            Scanner scan2 = new Scanner(System.in);
            System.out.println("Podaj liczbe");
            String outputi = scan2.nextLine();
            double outi = Double.parseDouble(outputi);
            sum += outi;
            multiply *= outi;
        }
        System.out.println("Suma = " + sum);
        System.out.println("Mnozenie = " + multiply);
    }
    static void javaz018(){
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Podaj n");
        String output = scan1.nextLine();
        int out = Integer.parseInt(output);
        double sum = 0;
        for(int i = 1; i <= out; i ++){
            Scanner scan2 = new Scanner(System.in);
            System.out.println("Podaj liczbe");
            String outputi = scan2.nextLine();
            double outi = Double.parseDouble(outputi);
            if(i % 2 == 0){
                if(i == out){
                    double temp = Math.pow(-1, out + 1) * outi;
                    System.out.println(temp);
                    sum += temp;
                }
                else{
                    sum -= outi;
                }
            }
            else{
                if(i == out){
                    double temp = Math.pow(-1, out + 1) * outi;
                    System.out.println(temp);
                    sum += temp;
                }
                else{
                    sum += outi;
                }
            }
        }
        System.out.println(sum);
    }
    static void javaz019(){
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Podaj n");
        String output = scan1.nextLine();
        int out = Integer.parseInt(output);
        double sum = 0;
        int fact = 1;
        for(int i = 1; i <= out; i ++){
            fact *= i;
            Scanner scan2 = new Scanner(System.in);
            System.out.println("Podaj liczbe");
            String outputi = scan2.nextLine();
            double outi = Double.parseDouble(outputi);
            if(i % 2 != 0){
                if(i == out){
                    double temp2 = Math.pow(-1, out) * outi / fact;
                    sum += temp2;
                }
                else{
                    double temp = outi / fact;
                    sum -= temp;
                }
            }
            else{
                if(i == out){
                    double temp2 = Math.pow(-1, out) * outi / fact;
                    sum += temp2;
                }
                else{
                    double temp = outi / fact;
                    sum += temp;
                }
            }
        }
        System.out.println(sum);
    }
    static void javaz02(){
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Podaj n");
        String output = scan1.nextLine();
        ArrayList<String> nums = new ArrayList<>();
        String first_num = "";
        int out = Integer.parseInt(output);
        for(int i = 1; i <= out; i ++){
            Scanner scan2 = new Scanner(System.in);
            System.out.println("Podaj liczbe");
            String outputi = scan2.nextLine();
            if(i == 1){
                first_num = String.copyValueOf(outputi.toCharArray());
            }
            else if(i == out){
                nums.add(outputi);
                nums.add(first_num);
            }
            else{
                nums.add(outputi);
            }

        }
        System.out.println(nums);
    }
    static void javaz12(){
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Podaj n");
        String output = scan1.nextLine();
        double sum = 0;
        int out = Integer.parseInt(output);
        for(int i = 1; i <= out; i ++){
            Scanner scan2 = new Scanner(System.in);
            System.out.println("Podaj liczbe");
            String outputi = scan2.nextLine();
            double outi = Double.parseDouble(outputi);
            if(outi >= 0){
                sum += outi * 2;
            }
        }
        System.out.println(sum);
    }
    static void javaz13(){
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Podaj n");
        String output = scan1.nextLine();
        int zera = 0;
        int dodatnie = 0;
        int ujemne = 0;
        int out = Integer.parseInt(output);
        for(int i = 1; i <= out; i ++){
            Scanner scan2 = new Scanner(System.in);
            System.out.println("Podaj liczbe");
            String outputi = scan2.nextLine();
            double outi = Double.parseDouble(outputi);
            if(outi > 0){
                dodatnie += 1;
            }
            else if(outi < 0){
                ujemne += 1;
            }
            else{
                zera += 1;
            }
        }
        System.out.println("Ujemnych liczb - " + ujemne + "\n" + "Dodatnich - " + dodatnie + "\n" + "Zer - " + zera);
    }
    static void javaz14(){
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Podaj n");
        String output = scan1.nextLine();
        double najmniejsza = 0;
        double najwieksza = 0;
        int out = Integer.parseInt(output);
        for(int i = 1; i <= out; i ++){
            Scanner scan2 = new Scanner(System.in);
            System.out.println("Podaj liczbe");
            String outputi = scan2.nextLine();
            double outi = Double.parseDouble(outputi);
            if(i == 1){
                najmniejsza = outi;
                najwieksza = outi;
            }
            if(outi > najwieksza){
                najwieksza = outi;
            }
            if(outi < najmniejsza){
                najmniejsza = outi;
            }
        }
        System.out.println("Najwieksza liczba = " + najwieksza + "\n" + "Najmniejsza = " + najmniejsza);
    }
    static void javaz15(){
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Podaj n");
        String output = scan1.nextLine();
        ArrayList<Double> nums = new ArrayList<>();
        ArrayList<Double> nums_par = new ArrayList<>();
        double temp = 0;
        boolean flag = true;
        int out = Integer.parseInt(output);
        for(int i = 1; i <= out; i ++){
            Scanner scan2 = new Scanner(System.in);
            System.out.println("Podaj liczbe");
            String outputi = scan2.nextLine();
            double outi = Double.parseDouble(outputi);
            nums.add(outi);
        }
        for(int i = 0; i < out; i ++){
            if(nums.get(i) >= 0 && flag){
                flag = false;
                temp = nums.get(i);
            }
            else if(nums.get(i) < 0){
                flag = true;
            }
            else if(nums.get(i) >= 0){
                nums_par.add(temp);
                nums_par.add(nums.get(i));
                temp = nums.get(i);
            }
        }
        for(int i = 1; i <= out / 2; i ++){
            System.out.println("Para " + i + " - (" + nums_par.get((i - 1) * 2) + ", " + nums_par.get((i * 2) - 1) + ")");
        }
    }
    //LAB3
    public static void generuj(int tab[], int n, int minWartosc, int maxWartosc){
        Random random = new Random();
        int new_rand;
        for(int i = 0; i < n; i ++) {
            new_rand = (random.nextInt(Math.abs(minWartosc) + maxWartosc) + minWartosc);
            tab[i] = new_rand;
            System.out.println(tab[i]);
        }
    }
    public static int ileNieparzystych(int tab[]){
        int ile = 0;
        for(int i = 0; i < tab.length; i ++){
            if(tab[i] % 2 != 0){
                ile += 1;
            }
        }
        return ile;
    }
    public static int ileParzystych(int tab[]){
        int ile = 0;
        for(int i = 0; i < tab.length; i ++){
            if(tab[i] % 2 == 0){
                ile += 1;
            }
        }
        return ile;
    }
    public static int ileDodatnich(int tab[]){
        int ile = 0;
        for(int i = 0; i < tab.length; i ++){
            if(tab[i] > 0){
                ile += 1;
            }
        }
        return ile;
    }
    public static int ileUjemnych(int tab[]){
        int ile = 0;
        for(int i = 0; i < tab.length; i ++){
            if(tab[i] < 0){
                ile += 1;
            }
        }
        return ile;
    }
    public static int ileZerowych(int tab[]){
        int ile = 0;
        for(int i = 0; i < tab.length; i ++){
            if(tab[i] == 0){
                ile += 1;
            }
        }
        return ile;
    }
    public static int ileMaksymalnych(int tab[]){
        int ile = 0;
        int temp = -1000;
        for(int i = 0; i < tab.length; i ++){
            if(tab[i] > temp){
                ile = 1;
                temp = tab[i];
            }
            else if(temp == tab[i]){
                ile += 1;
            }
        }
        return ile;
    }
    public static int sumaDodatnich(int tab[]){
        int ile = 0;
        for(int i = 0; i < tab.length; i ++){
            if(tab[i] > 0){
                ile += tab[i];
            }
        }
        return ile;
    }
    public static int sumaUjemnych(int tab[]){
        int ile = 0;
        for(int i = 0; i < tab.length; i ++){
            if(tab[i] < 0){
                ile += tab[i];
            }
        }
        return ile;
    }
    public static int dlugoscMaksymalnegoCiaguDodatnich(int tab[]){
        int ile = 0;
        int dlugosc = 0;
        for(int i = 0; i < tab.length; i ++){
            if(tab[i] > 0){
                ile += 1;
            }
            else{
                if(ile > dlugosc)
                {
                    dlugosc = ile;
                }
                ile = 0;
            }
        }
        return dlugosc;
    }
    public static void signum(int tab[]){
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i = 0; i < tab.length; i ++){
            if(tab[i] >= 0){
                nums.add(1);
            }
            else{
                nums.add(-1);
            }
        }
        System.out.println(nums);
    }
    public static void odwrocFragment(int tab[], int lewy, int prawy){
        for(int i = lewy; i <= prawy; i ++){

        }
    }

    public static void main(String[] args) {
        //LAB1
        //javaz00();

        //LAB2
        //javaz011(); //zad1.1a
        //javaz012(); //zad1.1b
        //javaz013(); //zad1.1c
        //javaz014(); //zad1.1d
        //javaz015(); //zad1.1e
        //javaz016(); //zad1.1f
        //javaz017(); //zad1.1g
        //javaz018(); //zad1.1h
        //javaz019(); //zad1.1i
        //javaz02(); //zad1.2
        //javaz12(); //zad2.2
        //javaz13(); //zad2.3
        //javaz14(); //zad2.4
        //javaz15(); //zad2.5

        //LAB3
        //javaz021();
        int[] intArray = new int[10];
        generuj(intArray, 10, -999, 999);
        System.out.println("Nieparzystych liczb jest: " + ileNieparzystych(intArray));
        System.out.println("Parzystych liczb jest: " + ileParzystych(intArray));
        System.out.println("Dodatnich liczb jest: " + ileDodatnich(intArray));
        System.out.println("Ujemnych liczb jest: " + ileUjemnych(intArray));
        System.out.println("Zer jest: " + ileZerowych(intArray));
        System.out.println("Maksymalnych jest: " + ileMaksymalnych(intArray));
        System.out.println("Suma dodatnich liczb: " + sumaDodatnich(intArray));
        System.out.println("Suma ujemnych liczb: " + sumaUjemnych(intArray));
        System.out.println("Dlugosc maksymalnego ciagu liczb dodatnich: " + dlugoscMaksymalnegoCiaguDodatnich(intArray));
        signum(intArray);
        odwrocFragment(intArray, 2, 7);
    }

}
