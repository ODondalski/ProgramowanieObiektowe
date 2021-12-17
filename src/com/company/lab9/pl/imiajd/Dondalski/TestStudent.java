package com.company.lab9.pl.imiajd.Dondalski;

import java.util.ArrayList;

public class TestStudent {
    public static void main(String[] args) {
        ArrayList<Student> grupa = new ArrayList<>();
        grupa.add(new Student("Kowalski", "1990-02-02", 4.5));
        grupa.add(new Student("Kowalski", "1965-12-06", 2.3));
        grupa.add(new Student("Nowak", "1990-02-02", 5.0));
        grupa.add(new Student("Dondalski", "2000-02-01", 2.3));
        grupa.add(new Student("Mak", "1991-04-22", 4.4));
        for (Student i : grupa){
            System.out.println(i);
        }
        grupa.sort(Student::compareTo);
        for (Student i : grupa){
            System.out.println(i);
        }
    }
}
