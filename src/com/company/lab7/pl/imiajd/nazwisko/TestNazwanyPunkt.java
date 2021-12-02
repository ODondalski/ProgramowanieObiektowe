package com.company.lab7.pl.imiajd.nazwisko;

public class TestNazwanyPunkt {
    public TestNazwanyPunkt() {
    }

    public static void main(String[] var0) {
        NazwanyPunkt var1 = new NazwanyPunkt(3, 5, "port");
        var1.show();
        Punkt var2 = new Punkt(3, 5);
        var2.show();
        NazwanyPunkt var3 = new NazwanyPunkt(3, 6, "tawerna");
        var3.show();
        var1 = (NazwanyPunkt)var2;
        var1 = (NazwanyPunkt)var3;
        var1.show();
    }
}
