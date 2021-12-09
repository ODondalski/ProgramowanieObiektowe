package com.company.lab8.pl.imiajd.Dondalski;

public class TestOsoba
{
    public static void main(String[] args)
    {
        Osoba[] ludzie = new Osoba[2];
        ludzie[0] = new Pracownik("Kowalski", new String[]{"Jan"}, "2000-02-04", true, 2000.01, "2021-04-23");
        ludzie[1] = new Student("Nowak", new String[]{"Edmund"}, "1995-06-06", true, "informatyka", 3.7);
        // ludzie[2] = new Osoba("Dyl Sowizdrzał");

        for (Osoba p : ludzie) {
            System.out.println(p.getNazwisko() + ": " + p.getOpis());
        }
    }
}