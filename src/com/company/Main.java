package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Linked List Program");
        List<Integer> list= new List<>();
        list.add(56);
        list.add(30);
        list.add(70);
        System.out.println(list);
        List<Integer> list1= new List<>();
        list1.add(70);
        list1.add(30);
        list1.add(56);
        System.out.println(list1);
        List<Integer> list3= new List<>();
        list3.add(56);
        list3.append(30);
        list3.append(70);
        System.out.println(list3);
    }
}
