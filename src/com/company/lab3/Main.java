package com.company.lab3;

import java.util.ArrayList;
import java.util.Random;

public class Main {
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
    public static void main(String[] args){
        //LAB3
        //zad 2
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
        odwrocFragment(intArray, 3, 9);
        //zad 3
        matrix(3, 4, 5);
    }
}
