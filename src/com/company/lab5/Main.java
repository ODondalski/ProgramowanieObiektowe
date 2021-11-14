package com.company.lab5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> al= new ArrayList<Integer>();
        al.addAll(a);
        al.addAll(b);
        return al;
    }
    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> al= new ArrayList<Integer>();
        for(int i = 0; i < a.size(); i ++){
            al.add(a.get(i));
            if(b.size() > i){
                al.add(b.get(i));
            }
        }
        if(b.size() > a.size()){
            for(int i = a.size(); i < b.size(); i ++){
                al.add(b.get(i));
            }
        }
        return al;
    }
    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> al= new ArrayList<Integer>();
        for(int i = 0; i < a.size(); i ++){
            al.add(a.get(i));
            if(b.size() > i){
                al.add(b.get(i));
            }
        }
        if(b.size() > a.size()){
            for(int i = a.size(); i < b.size(); i ++){
                al.add(b.get(i));
            }
        }
        Collections.sort(al);
        return al;
    }
    public static ArrayList<Integer> reversed(ArrayList<Integer> a){
        ArrayList<Integer> al= new ArrayList<>();
        for(int i = a.size() - 1; i >= 0; i --){
            al.add(a.get(i));
        }
        return al;
    }
    public static void reverse(ArrayList<Integer> a){
        int temp;
        for(int i = 0; i < a.size() / 2; i ++){
            temp =  a.get(i);
            a.set(i, a.get(a.size() - i - 1));
            a.set(a.size() - i - 1, temp);
        }
        System.out.println("Reverse method: " + a);
    }
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 6, 4, 3, 6, 2));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(2, 2, 2, 5, 5, 5, 8, 2, 2));
        System.out.println("First list: " + a);
        System.out.println("Second list: " + b);
        System.out.println("Append method: " + append(a, b));
        System.out.println("Merge method: " + merge(a, b));
        System.out.println("MergeSorted method: " + mergeSorted(a, b));
        System.out.println("Reversed method: " + reversed(a));
        reverse(a);
    }
}
