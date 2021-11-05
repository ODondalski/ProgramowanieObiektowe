package com.company;

import java.lang.reflect.Array;
import java.util.Collections;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
    //LAB1
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
    //LAB2
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
                if(ile > dlugosc)
                {
                    dlugosc = ile;
                }
            }
            else{
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
    public static void odwrocFragment(int tab[], int lewy, int prawy) {
        int temp = 0;
        int j = 0;
        for(int i = lewy - 1; i <= prawy - 1; i ++) {
            temp = tab[i];
            tab[i] = tab[prawy - 1 - j];
            tab[prawy - 1 - j] = temp;
            if(i > prawy / 2)
            {
                break;
            }
            j ++;
        }
        for(int i = lewy - 1; i < prawy; i ++){
            System.out.println(tab[i]);
        }
    }
    public static void matrix(int m, int n, int k){
        Random random = new Random();
        int new_rand;
        int[][] a = new int[m][n];
        int[][] b = new int[n][k];
        int[][] c = new int[m][k];
        System.out.println("Macierz a: ");
        for(int i = 0; i < m; i ++){
            System.out.print("| ");
            for(int j = 0; j < n; j ++){
                new_rand = (random.nextInt(Math.abs(1) + 15) + 1);
                a[i][j] = new_rand;
                System.out.print(a[i][j] + " ");
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("Macierz b: ");
        for(int i = 0; i < n; i ++){
            System.out.print("| ");
            for(int j = 0; j < k; j ++){
                new_rand = (random.nextInt(Math.abs(1) + 15) + 1);
                b[i][j] = new_rand;
                System.out.print(b[i][j] + " ");
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("Macierz c: ");
        for(int i = 0; i < m; i ++){
            System.out.print("| ");
            for(int j = 0; j < k; j ++){
                c[i][j] = 0;
                for(int l = 0; l < n; l ++)
                {
                    c[i][j] += a[i][l] * b[l][j];
                }
                System.out.print(c[i][j] + " ");
            }
            System.out.print("|");
            System.out.println();
        }
    }
    //LAB4
    public static int countChar(String str, char c){
        int count = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == c){
                count ++;
            }
        }
        return count;
    }
    public static int countSubStr(String str, String subStr){
        int lastIndex = 0;
        int count = 0;

        while(lastIndex != -1){

            lastIndex = str.indexOf(subStr,lastIndex);

            if(lastIndex != -1){
                count ++;
                lastIndex += subStr.length();
            }
        }
        return count;
    }
    public static String Middle(String str){
        String new_string = "";
        if(str.length() % 2 == 0){
            new_string = new_string + str.charAt((str.length() / 2) - 1);
            new_string = new_string + str.charAt(str.length() / 2);
        }
        else{
            new_string = new_string + str.charAt(str.length() / 2);
        }
        return new_string;
    }
    public static String repeat(String str, int n){
        String copy_str = str;
        for(int i = 1; i < n; i ++){
            copy_str = copy_str + str;
        }
        return copy_str;
    }
    public static int[] where(String str, String subStr){
        int lastIndex = 0;
        int count = 0;
        int[] tab = new int[2];

        while(lastIndex != -1){
            lastIndex = str.indexOf(subStr,lastIndex);

            if(lastIndex != -1){
                tab[count] = lastIndex;
                count ++;
                lastIndex += subStr.length();
            }
        }
        return tab;
    }
    public static String change(String str) {
        var new_string = new StringBuffer();
        for(int i = 0; i < str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                new_string.append(Character.toString(str.charAt(i)).toLowerCase());
            }
            else{
                new_string.append(Character.toString(str.charAt(i)).toUpperCase());
            }
        }
        String wynik = new_string.toString();
        return wynik;
    }
    public static String nice1(String str){
        var new_string = new StringBuffer();
        for(int i = str.length(); i > 0; i --){
            new_string.append(Character.toString(str.charAt(str.length() - i)));
            if(i % 3 == 0){
                new_string.append("\"");
            }
        }
        String wynik = new_string.toString();
        return wynik;
    }
    public static String nice2(String str, int n, String separator){
        var new_string = new StringBuffer();
        for(int i = str.length(); i > 0; i --){
            new_string.append(Character.toString(str.charAt(str.length() - i)));
            if(i % n == 0){
                new_string.append(separator);
            }
        }
        String wynik = new_string.toString();
        return wynik;
    }
    public static int countCharFile(String file, char c) throws IOException {
        FileReader fr = new FileReader(file);
        int count = 0;
        int i;
        while ((i = fr.read()) != -1)
            if((char)i == c){
                count ++;
            }
        return count;
    }
    public static int countSubStrFile(String file, String subStr) throws IOException {
        FileReader fr = new FileReader(file);
        int count = 0;
        int i;
        int counter = 0;
        String str = "";
        while((i = fr.read()) != -1){
            if((char)i == ' '){
                counter ++;
                if(counter > 1) {
                    str = str.substring(1, str.length());
                }
                System.out.println(str);
                if(str.equals(subStr)) {
                    System.out.println("...");
                    count ++;
                }
                str = "";
            }
            str = str + (char)i;
        }
        return count;
    }
    public static BigInteger szachownica(int n){
        BigInteger sum = new BigInteger("0");
        BigInteger c = new BigInteger("1");
        for(int i = 0; i < n; i ++) {
            for(int j = 0; j < n; j ++){
                sum = sum.add(c);
                c = c.multiply(BigInteger.valueOf(2));
            }
        }
        return sum;
    }
    public static BigDecimal kapital(double k, double p, int n){
        BigDecimal sum = new BigDecimal("0.0");
        sum = sum.add(BigDecimal.valueOf(k));
        for(int i = 0; i < n; i ++){
            sum = sum.add(sum.multiply(BigDecimal.valueOf(p / 100)));
        }
        sum = sum.setScale(2, RoundingMode.CEILING);
        return sum;
    }
    //LAB5
    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> al= new ArrayList<Integer>();
        al.addAll(a);
        al.addAll(b);
        return al;
    }
    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> al= new ArrayList<Integer>();
        for(int i = 0; i < a.size(); i ++){
            al.add(a.get(i));
            if(b.size() > i){
                al.add(b.get(i));
            }
        }
        if(b.size() > a.size()){
            for(int i = a.size(); i < b.size(); i ++){
                al.add(b.get(i));
            }
        }
        return al;
    }
    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> al= new ArrayList<Integer>();
        for(int i = 0; i < a.size(); i ++){
            al.add(a.get(i));
            if(b.size() > i){
                al.add(b.get(i));
            }
        }
        if(b.size() > a.size()){
            for(int i = a.size(); i < b.size(); i ++){
                al.add(b.get(i));
            }
        }
        Collections.sort(al);
        return al;
    }
    public static ArrayList<Integer> reversed(ArrayList<Integer> a){
        ArrayList<Integer> al= new ArrayList<>();
        for(int i = a.size() - 1; i >= 0; i --){
            al.add(a.get(i));
        }
        return al;
    }
    public static void reverse(ArrayList<Integer> a){
        int temp;
        for(int i = 0; i < a.size() / 2; i ++){
            temp =  a.get(i);
            a.set(i, a.get(a.size() - i - 1));
            a.set(a.size() - i - 1, temp);
        }
        System.out.println("Reverse method" + a);
    }
    public static void main(String[] args) throws IOException {
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
        //zad 2
        //int[] intArray = new int[10];
        //generuj(intArray, 10, -999, 999);
        //System.out.println("Nieparzystych liczb jest: " + ileNieparzystych(intArray));
        //System.out.println("Parzystych liczb jest: " + ileParzystych(intArray));
        //System.out.println("Dodatnich liczb jest: " + ileDodatnich(intArray));
        //System.out.println("Ujemnych liczb jest: " + ileUjemnych(intArray));
        //System.out.println("Zer jest: " + ileZerowych(intArray));
        //System.out.println("Maksymalnych jest: " + ileMaksymalnych(intArray));
        //System.out.println("Suma dodatnich liczb: " + sumaDodatnich(intArray));
        //System.out.println("Suma ujemnych liczb: " + sumaUjemnych(intArray));
        //System.out.println("Dlugosc maksymalnego ciagu liczb dodatnich: " + dlugoscMaksymalnegoCiaguDodatnich(intArray));
        //signum(intArray);
        //odwrocFragment(intArray, 3, 9);
        //zad 3
        //matrix(3, 4, 5);

        //LAB4
        /*
        //zad 1
        System.out.println(countChar("kajak", 'k'));
        System.out.println(countSubStr("hellohrfdfdfhdfhhello", "hello"));
        System.out.println(Middle("samochod"));
        System.out.println(repeat("ho", 3));
        System.out.println(Arrays.toString(where("hellohrfdfdfhdfhhello", "hello")));
        System.out.println(change("OsKar"));
        System.out.println(nice2("83295723678923903", 4, "["));
        //zad 2
        System.out.println(countCharFile("C:\\Users\\Oskar\\Desktop\\plik.txt", 'k'));
        //zad 3
        System.out.println(countSubStrFile("C:\\Users\\Oskar\\Desktop\\plik.txt", "fsd"));
        //zad 4
        System.out.println(szachownica(3));
        //zad 5
        System.out.println(kapital(1333, 4.5, 7));
        */

        //LAB5
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 6, 4, 3, 6, 2));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(2, 2, 2, 5, 5, 5, 8, 2, 2));
        System.out.println("First list: " + a);
        System.out.println("Second list: " + b);
        System.out.println("Append method: " + append(a, b));
        System.out.println("Merge method: " + merge(a, b));
        System.out.println("MergeSorted method: " + mergeSorted(a, b));
        System.out.println("Reversed method: " + reversed(a));
        reverse(a);

    }

}
