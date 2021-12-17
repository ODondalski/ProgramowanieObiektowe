package com.company.lab9.pl.imiajd.Dondalski;
import java.time.LocalDate;

public class Osoba implements Cloneable, Comparable<Osoba> {
    private String nazwisko;
    private LocalDate dataUrodzenia;
    public Osoba(String nazwisko, String dataUrodzenia){
        this.nazwisko = nazwisko;
        this.dataUrodzenia = LocalDate.parse(dataUrodzenia);
    }
    @Override
    public String toString(){
        return getClass().getName() + "[" + this.nazwisko + " " + this.dataUrodzenia + "]";
    }
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Osoba)) {
            return false;
        }
        Osoba c = (Osoba) o;
        return nazwisko.equals(c.nazwisko) && dataUrodzenia.equals(c.dataUrodzenia);
    }
    @Override
    public int compareTo(Osoba other){
        int last = this.nazwisko.compareTo(other.nazwisko);
        return last == 0 ? this.dataUrodzenia.compareTo(other.dataUrodzenia) : last;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(LocalDate dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
}