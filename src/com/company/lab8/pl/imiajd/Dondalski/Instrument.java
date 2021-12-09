package com.company.lab8.pl.imiajd.Dondalski;

import java.time.LocalDate;

public abstract class Instrument {
    private String producent;
    private LocalDate rokProdukcji;

    public String getProducent(){
        return producent;
    }
    public LocalDate getRokProdukcji(){
        return rokProdukcji;
    }
    public abstract String dzwiek();
    public boolean equals(Object obj) {
        return (this == obj);
    }
    public String toString(){
        return producent + ", rok produkcji - " + rokProdukcji;
    }
}