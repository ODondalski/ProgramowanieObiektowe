package com.company.lab7.pl.imiajd.nazwisko;

import java.awt.*;

public class BetterRectangle extends java.awt.Rectangle{
    public BetterRectangle(Dimension size, Point location){
        super();
        setLocation(location);
        setSize(size);
    }
    public double getArea(){
        return getHeight() * getWidth();
    }
    public double getPerimeter(){
        return getHeight() * 2 + getWidth() * 2;
    }
}
