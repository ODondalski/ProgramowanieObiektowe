package com.company.lab6;

public class RachunekBankowy {
    static double rocznaStopaProcentowa;
    private double saldo;
    public void obliczMiesieczneOdsetki(){
        double temp = (saldo * rocznaStopaProcentowa) / 12;
        saldo += temp;
    }
    public static void setRocznaStopaProcentowa(double nowaStopa){
        rocznaStopaProcentowa = nowaStopa;
    }

    public static void main(String[] args){
        RachunekBankowy saver1 = new RachunekBankowy();
        RachunekBankowy saver2 = new RachunekBankowy();
        saver1.saldo = 2000;
        saver2.saldo = 3000;
        setRocznaStopaProcentowa(0.04);
        System.out.println(saver1.saldo);
        System.out.println(saver2.saldo);
        saver1.obliczMiesieczneOdsetki();
        saver2.obliczMiesieczneOdsetki();
        System.out.println(saver1.saldo);
        System.out.println(saver2.saldo);
        setRocznaStopaProcentowa(0.05);
        saver1.obliczMiesieczneOdsetki();
        saver2.obliczMiesieczneOdsetki();
        System.out.println(saver1.saldo);
        System.out.println(saver2.saldo);

    }
}
