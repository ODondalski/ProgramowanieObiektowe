package com.company.lab2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
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
    public static void main(String[] args){
        javaz011(); //zad1.1a
        javaz012(); //zad1.1b
        javaz013(); //zad1.1c
        javaz014(); //zad1.1d
        javaz015(); //zad1.1e
        javaz016(); //zad1.1f
        javaz017(); //zad1.1g
        javaz018(); //zad1.1h
        javaz019(); //zad1.1i
        javaz02(); //zad1.2
        javaz12(); //zad2.2
        javaz13(); //zad2.3
        javaz14(); //zad2.4
        javaz15(); //zad2.5
    }
}
