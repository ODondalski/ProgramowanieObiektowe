package com.company.lab4;

import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Arrays;

public class Main {
    public static int countChar(String str, char c){
        int count = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == c){
                count ++;
            }
        }
        return count;
    }
    public static int countSubStr(String str, String subStr){
        int lastIndex = 0;
        int count = 0;

        while(lastIndex != -1){

            lastIndex = str.indexOf(subStr,lastIndex);

            if(lastIndex != -1){
                count ++;
                lastIndex += subStr.length();
            }
        }
        return count;
    }
    public static String Middle(String str){
        String new_string = "";
        if(str.length() % 2 == 0){
            new_string = new_string + str.charAt((str.length() / 2) - 1);
            new_string = new_string + str.charAt(str.length() / 2);
        }
        else{
            new_string = new_string + str.charAt(str.length() / 2);
        }
        return new_string;
    }
    public static String repeat(String str, int n){
        String copy_str = str;
        for(int i = 1; i < n; i ++){
            copy_str = copy_str + str;
        }
        return copy_str;
    }
    public static int[] where(String str, String subStr){
        int lastIndex = 0;
        int count = 0;
        int[] tab = new int[2];

        while(lastIndex != -1){
            lastIndex = str.indexOf(subStr,lastIndex);

            if(lastIndex != -1){
                tab[count] = lastIndex;
                count ++;
                lastIndex += subStr.length();
            }
        }
        return tab;
    }
    public static String change(String str) {
        var new_string = new StringBuffer();
        for(int i = 0; i < str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                new_string.append(Character.toString(str.charAt(i)).toLowerCase());
            }
            else{
                new_string.append(Character.toString(str.charAt(i)).toUpperCase());
            }
        }
        String wynik = new_string.toString();
        return wynik;
    }
    public static String nice1(String str){
        var new_string = new StringBuffer();
        for(int i = str.length(); i > 0; i --){
            new_string.append(Character.toString(str.charAt(str.length() - i)));
            if(i % 3 == 0){
                new_string.append("\"");
            }
        }
        String wynik = new_string.toString();
        return wynik;
    }
    public static String nice2(String str, int n, String separator){
        var new_string = new StringBuffer();
        for(int i = str.length(); i > 0; i --){
            new_string.append(Character.toString(str.charAt(str.length() - i)));
            if(i % n == 0){
                new_string.append(separator);
            }
        }
        String wynik = new_string.toString();
        return wynik;
    }
    public static int countCharFile(String file, char c) throws IOException {
        FileReader fr = new FileReader(file);
        int count = 0;
        int i;
        while ((i = fr.read()) != -1)
            if((char)i == c){
                count ++;
            }
        return count;
    }
    public static int countSubStrFile(String file, String subStr) throws IOException {
        FileReader fr = new FileReader(file);
        int count = 0;
        int i;
        int counter = 0;
        String str = "";
        while((i = fr.read()) != -1){
            if((char)i == ' '){
                counter ++;
                if(counter > 1) {
                    str = str.substring(1, str.length());
                }
                System.out.println(str);
                if(str.equals(subStr)) {
                    System.out.println("...");
                    count ++;
                }
                str = "";
            }
            str = str + (char)i;
        }
        return count;
    }
    public static BigInteger szachownica(int n){
        BigInteger sum = new BigInteger("0");
        BigInteger c = new BigInteger("1");
        for(int i = 0; i < n; i ++) {
            for(int j = 0; j < n; j ++){
                sum = sum.add(c);
                c = c.multiply(BigInteger.valueOf(2));
            }
        }
        return sum;
    }
    public static BigDecimal kapital(double k, double p, int n){
        BigDecimal sum = new BigDecimal("0.0");
        sum = sum.add(BigDecimal.valueOf(k));
        for(int i = 0; i < n; i ++){
            sum = sum.add(sum.multiply(BigDecimal.valueOf(p / 100)));
        }
        sum = sum.setScale(2, RoundingMode.CEILING);
        return sum;
    }
    public static void main(String[] args) throws IOException {
        //zad 1
        System.out.println(countChar("kajak", 'k'));
        System.out.println(countSubStr("hellohrfdfdfhdfhhello", "hello"));
        System.out.println(Middle("samochod"));
        System.out.println(repeat("ho", 3));
        System.out.println(Arrays.toString(where("hellohrfdfdfhdfhhello", "hello")));
        System.out.println(change("OsKar"));
        System.out.println(nice2("83295723678923903", 4, "["));
        //zad 2
        System.out.println(countCharFile("C:\\Users\\Oskar\\Desktop\\plik.txt", 'k'));
        //zad 3
        System.out.println(countSubStrFile("C:\\Users\\Oskar\\Desktop\\plik.txt", "fsd"));
        //zad 4
        System.out.println(szachownica(3));
        //zad 5
        System.out.println(kapital(1333, 4.5, 7));
    }
}
