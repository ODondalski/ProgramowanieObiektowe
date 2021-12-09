package com.company.lab8.pl.imiajd.Dondalski;

class Student extends Osoba
{
    private double sredniaOcen;
    private String kierunek;
    public Student(String nazwisko, String[] imiona, String dataUrodzenia, boolean plec, String kierunek, double sredniaOcen)
    {
        super(nazwisko, imiona, dataUrodzenia, plec);
        this.kierunek = kierunek;
        this.sredniaOcen = sredniaOcen;
    }

    public double getSredniaOcen(){
        return sredniaOcen;
    }
    public String getOpis()
    {
        return "kierunek studiów: " + kierunek;
    }

    public void setSredniaOcen(double sredniaOcen) {
        this.sredniaOcen = sredniaOcen;
    }

}
