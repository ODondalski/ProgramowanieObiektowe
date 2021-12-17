package com.company.lab9.pl.imiajd.Dondalski;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReadLines {
    public static ArrayList readLines(String plik) throws FileNotFoundException {
        Scanner s = new Scanner(new File(plik));
        ArrayList<String> list = new ArrayList<>();
        while (s.hasNextLine()){
            list.add(s.nextLine());
        }
        s.close();
        Collections.sort(list);
        return list;
    }
    public static void main(String[] args) throws FileNotFoundException {
        String plik = "C:\\Users\\local\\Desktop\\something\\file.txt";
        System.out.println(readLines(plik));
    }
}