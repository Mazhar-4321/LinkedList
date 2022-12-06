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
        List<Integer> list4= new List<>();
        list4.add(70);
        list4.add(56);
        list4.insertBetWeenNodes(56,70,30);
        System.out.println(list4);
        list4.deleteFirstElement();
        System.out.println(list4);
        list4.deleteLastElement();
        System.out.println(list4);
        System.out.println(list4.search(30));
        list3.insertAfter(30,40);
        System.out.println(list3);
        list3.delete(40);
    }
}
