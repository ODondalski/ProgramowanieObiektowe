package com.company.lab7.pl.imiajd.nazwisko;

import java.awt.*;

public class TestBetterRectangle {
    public static void main(String[] args){
        Dimension dim = new Dimension(300, 350);
        Point pnt = new Point(0, 0);
        BetterRectangle Prostokat1 = new BetterRectangle(dim, pnt);
        System.out.println("Powierzchina prostokata: " + Prostokat1.getArea());
        System.out.println("Obwod prostokata: " + Prostokat1.getPerimeter());
    }
}
