package com.company.lab6;

import java.util.Arrays;

public class IntegerSet {
    boolean[] tab = new boolean[100];
    public IntegerSet() {
        Arrays.fill(tab, false);
    }
    public static boolean[] union(boolean[] zbior1, boolean[] zbior2){
        boolean[] new_tab = new boolean[100];
        Arrays.fill(new_tab, false);
        for(int i = 0; i < zbior1.length; i ++){
            if(zbior1[i] || zbior2[i]){
                new_tab[i] = true;
            }
        }
        return new_tab;
    }
    public static boolean[] intersection(boolean[] zbior1, boolean[] zbior2){
        boolean[] new_tab = new boolean[100];
        Arrays.fill(new_tab, false);
        for(int i = 0; i < zbior1.length; i ++){
            if(zbior1[i] && zbior2[i]){
                new_tab[i] = true;
            }
        }
        return new_tab;
    }
    public void insertElement(int n){
        tab[n] = true;
    }
    public void deleteElement(int n){
        tab[n] = false;
    }
    public String toString(){
        String tabString = "";
        for (boolean b : tab) {
            if (b) {
                tabString += "true";
            } else {
                tabString += "false";
            }
            tabString += " ";
        }
        return tabString;
    }
    public boolean equals(boolean[] zbior){
        for(int i = 0; i < zbior.length; i ++){
            if(zbior[i] == tab[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        IntegerSet zbior1 = new IntegerSet();
        IntegerSet zbior2 = new IntegerSet();
        zbior1.tab[1] = true;
        zbior1.tab[2] = true;
        zbior1.tab[6] = true;
        zbior1.tab[8] = true;
        zbior2.tab[1] = true;
        zbior2.tab[22] = true;
        zbior2.tab[30] = true;
        zbior2.insertElement(3);
        zbior2.deleteElement(1);
        System.out.println("Pierwszy zbior: " + zbior1.toString());
        System.out.println("Drugi zbior: " + zbior2.toString());
        System.out.println("Suma: " + Arrays.toString(union(zbior1.tab, zbior2.tab)));
        System.out.println("Iloczyn: " + Arrays.toString(intersection(zbior1.tab, zbior2.tab)));
        System.out.println(zbior1.equals(zbior2));
    }

}
