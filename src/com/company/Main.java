package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Linked OrderedList Program");
        OrderedList<Integer> orderedList = new OrderedList<>();
        orderedList.add(56);
        orderedList.add(30);
        orderedList.add(70);
        System.out.println(orderedList);
        OrderedList<Integer> orderedList1 = new OrderedList<>();
        orderedList1.add(70);
        orderedList1.add(30);
        orderedList1.add(56);
        System.out.println(orderedList1);
        OrderedList<Integer> orderedList3 = new OrderedList<>();
        orderedList3.add(56);
        orderedList3.append(30);
        orderedList3.append(70);
        System.out.println(orderedList3);
        OrderedList<Integer> orderedList4 = new OrderedList<>();
        orderedList4.add(70);
        orderedList4.add(56);
        orderedList4.insertBetWeenNodes(56,70,30);
        System.out.println(orderedList4);
        orderedList4.deleteFirstElement();
        System.out.println(orderedList4);
        orderedList4.deleteLastElement();
        System.out.println(orderedList4);
        System.out.println(orderedList4.search(30));
        orderedList3.insertAfter(30,40);
        System.out.println(orderedList3);
        orderedList3.delete(40);
    }
}
