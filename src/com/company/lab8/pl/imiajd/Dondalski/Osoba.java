package com.company.lab8.pl.imiajd.Dondalski;
import java.time.LocalDate;

abstract class Osoba
{
    private String[] imiona;
    private LocalDate dataUrodzenia;
    private String nazwisko;
    private boolean plec;
    public Osoba(String nazwisko, String[] imiona, String dataUrodzenia, boolean plec)
    {
        this.imiona = imiona;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = LocalDate.parse(dataUrodzenia);
        this.plec = plec;
    }
    public String[] getImiona(){
        return imiona;
    }
    public LocalDate getDataUrodzenia(){
        return dataUrodzenia;
    }
    public boolean getPlec(){
        return plec;
    }
    public String getNazwisko()
    {
        return nazwisko;
    }
    public abstract String getOpis();

}