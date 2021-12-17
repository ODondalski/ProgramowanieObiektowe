package com.company.lab9.pl.imiajd.Dondalski;

class Student extends Osoba {
    private double sredniaOcen;
    public Student(String nazwisko, String dataUrodzenia, double sredniaOcen){
        super(nazwisko, dataUrodzenia);
        this.sredniaOcen = sredniaOcen;
    }

    public int compareTo(Student other) {
        if (super.compareTo(other) == 0){
            if (this.sredniaOcen < other.sredniaOcen){
                return - 1;
            }
            else if(this.sredniaOcen > other.sredniaOcen){
                return 1;
            }
            return 0;
        }
        return super.compareTo(other);
    }

    public double getSredniaOcen() {
        return sredniaOcen;
    }

    public void setSredniaOcen(double sredniaOcen) {
        this.sredniaOcen = sredniaOcen;
    }
}