package com.company.lab9.pl.imiajd.Dondalski;

import java.util.ArrayList;

public class TestOsoba {
    public static void main(String[] args) {
        ArrayList<Osoba> grupa = new ArrayList<>();
        grupa.add(new Osoba("Kowalski", "1990-02-02"));
        grupa.add(new Osoba("Kowalski", "1965-12-06"));
        grupa.add(new Osoba("Nowak", "1990-02-02"));
        grupa.add(new Osoba("Dondalski", "2000-02-01"));
        grupa.add(new Osoba("Mak", "1991-04-22"));
        for (Osoba i : grupa){
            System.out.println(i);
        }
        grupa.sort(Osoba::compareTo);
        for (Osoba i : grupa){
            System.out.println(i);
        }
    }
}