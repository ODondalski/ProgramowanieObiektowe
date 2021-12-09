package com.company.lab8.pl.imiajd.Dondalski;

import java.time.LocalDate;

class Pracownik extends Osoba
        {
private LocalDate dataZatrudnienia;
public Pracownik(String nazwisko, String[] imiona, String dataUrodzenia, boolean plec, double pobory, String dataZatrudnienia)
        {
        super(nazwisko, imiona, dataUrodzenia, plec);
        this.pobory = pobory;
        this.dataZatrudnienia = LocalDate.parse(dataZatrudnienia);
        }

public LocalDate getDataZatrudnienia(){
        return dataZatrudnienia;
        }
public double getPobory()
        {
        return pobory;
        }

public String getOpis()
        {
        return String.format("pracownik z pensją %.2f zł", pobory);
        }

private double pobory;
        }