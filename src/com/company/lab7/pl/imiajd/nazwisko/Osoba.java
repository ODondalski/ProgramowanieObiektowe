package com.company.lab7.pl.imiajd.nazwisko;

public class Osoba {
    private String nazwisko;
    private int rokUrodzenia;
    public Osoba(String nazwisko, int rokUrodzenia){
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }
    public String getNazwisko(){
        return nazwisko;
    }
    public int getRokUrodzenia(){
        return rokUrodzenia;
    }
}
