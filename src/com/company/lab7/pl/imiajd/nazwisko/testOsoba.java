package com.company.lab7.pl.imiajd.nazwisko;

public class testOsoba {
    public static void main(String[] args){
        Student Student1 = new Student("Dondalski", 2000, "informatyka");
        Nauczyciel Nauczyciel1 = new Nauczyciel("Kowalski", 1977, 4300.50);
        System.out.println(Student1.toString());
        System.out.println(Nauczyciel1.toString());
    }
}
