package com.company;

import java.util.Iterator;

public class Main {


    public static <E extends Iterable<E>> void wypiszCoDrugi(E a){
        a.forEach(System.out::println);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Andrzej", 22);
        Person person2 = new Person("Mariusz", 39);
    }
}

class Person{
    private String name;
    private int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class IteratPerson implements Iterable<Person>{

    @Override
    public Iterator<Person> iterator() {
        return null;
    }
}
