package com.company.lab6;

public class RachunekBankowy {
    static double rocznaStopaProcentowa;
    private double saldo;
    public double obliczMiesieczneOdsetki(){
        double odsetki = (saldo * rocznaStopaProcentowa) / 12;
        odsetki = Math.round(odsetki * 100.0) / 100.0;
        saldo += odsetki;
        return odsetki;
    }
    public static void setRocznaStopaProcentowa(double nowaStopa){
        rocznaStopaProcentowa = nowaStopa * 0.01;
    }

    public static void main(String[] args){
        RachunekBankowy saver1 = new RachunekBankowy();
        RachunekBankowy saver2 = new RachunekBankowy();
        saver1.saldo = 2000;
        saver2.saldo = 3000;
        setRocznaStopaProcentowa(4);
        System.out.println("Saldo 1: " + saver1.saldo);
        System.out.println("Saldo 2: " + saver2.saldo);
        System.out.println("Odsetki 1: " + saver1.obliczMiesieczneOdsetki());
        System.out.println("Odsetki 2: " + saver2.obliczMiesieczneOdsetki());
        System.out.println("Saldo 1: " + saver1.saldo);
        System.out.println("Saldo 2: " + saver2.saldo);
        setRocznaStopaProcentowa(5);
        System.out.println("Odsetki 1: " + saver1.obliczMiesieczneOdsetki());
        System.out.println("Odsetki 2: " + saver2.obliczMiesieczneOdsetki());
        System.out.println("Saldo 1: " + saver1.saldo);
        System.out.println("Saldo 2: " + saver2.saldo);

    }
}
