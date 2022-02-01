package com.company.lab7.pl.imiajd.nazwisko;

public class Nauczyciel extends Osoba{
    private double pensja;

    public Nauczyciel(String nazwisko, int rokUrodzenia, double pensja) {
        super(nazwisko, rokUrodzenia);
        this.pensja = pensja;
    }
    public double getPensja(){
        return pensja;
    }
    @Override
    public String toString(){
        return getNazwisko() + ", rok urodzenia - " + getRokUrodzenia() + ", pensja - " + pensja;
    }
}
