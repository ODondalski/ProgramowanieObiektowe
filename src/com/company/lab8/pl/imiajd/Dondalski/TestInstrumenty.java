package com.company.lab8.pl.imiajd.Dondalski;
import java.util.ArrayList;

public class TestInstrumenty {
    public static void main(String[] args) {
        ArrayList<Instrument> orkiestra = new ArrayList<>();
        orkiestra.add(new Fortepian());
        orkiestra.add(new Flet());
        orkiestra.add(new Skrzypce());
        orkiestra.add(new Flet());
        orkiestra.add(new Flet());
        for (Instrument i : orkiestra){
            System.out.println(i.dzwiek());
        }
    }
}