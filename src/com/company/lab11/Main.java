package com.company.lab11;

import java.util.LinkedList;

public class Main {
    public static void redukuj(LinkedList<String> pracownicy, int n){
        for(int i = 0; i < n; i ++){
            if(i % n == 0){
                pracownicy.remove(i);
            }
        }
    }
    public static void main(String[] args) {

    }
}