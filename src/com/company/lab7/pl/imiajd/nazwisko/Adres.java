package com.company.lab7.pl.imiajd.nazwisko;

public class Adres {
    private String ulica;
    private int number_domu;
    private int number_mieszkania;
    private String miasto;
    private String kod_pocztowy;
    public Adres(String ulica, int number_domu, int number_mieszkania, String miasto, String kod_pocztowy){
        this.ulica = ulica;
        this.number_domu = number_domu;
        this.number_mieszkania = number_mieszkania;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }
    public Adres(String ulica, int number_domu, String miasto, String kod_pocztowy){
        this.ulica = ulica;
        this.number_domu = number_domu;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }
    public void pokaz(){
        System.out.println("Kod pocztowy - " + kod_pocztowy + ", miasto - " + miasto);
        System.out.println("Ulica - " + ulica + ", numer domu - " + number_domu + ", numer mieszkania - " + number_mieszkania);
    }
}
