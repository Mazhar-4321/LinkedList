package com.company;

public class List<T> {
    private INode<T> head;
    private INode<T> tail;
    private int size;

    public List() {
        head = null;
        tail = null;
        size = 0;
    }

    public void add(T item) {
        size++;
        INode<T> newNode = new MyNode<>(item);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.setNext(head);
        head = newNode;
    }

    public void remove(T item) {
        INode<T> tempNode = head;
        while (tempNode != null) {
            if (tempNode.getNext().getKey().equals(item)) {
                tempNode.setNext(tempNode.getNext().getNext());
                size--;
                return;
            }
            tempNode = tempNode.getNext();
        }
    }

    public boolean search(T item) {
        INode<T> tempNode = head;
        while (tempNode != null) {
            if (tempNode.getKey().equals(item)) {
                return true;
            }
            tempNode = tempNode.getNext();
        }
        return false;
    }

    public int size() {
        return size;
    }

    public int index(T item) {
        INode<T> tempNode = head;
        int index = -1;
        while (tempNode != null) {
            index++;
            if (tempNode.getKey().equals(item)) {
                return index;
            }
            tempNode = tempNode.getNext();
        }
        return index;
    }

    public void insert(int pos, T item) {
        if (pos > size) {
            return;
        }
        if (pos == 0) {
            add(item);
            return;
        }
        INode<T> tempNode = head;
        INode<T> newNode = new MyNode<>(item);
        while (pos > 0 && tempNode != null) {
            pos--;
            tempNode = tempNode.getNext();
        }
        if (pos == 0) {
            newNode.setNext(tempNode.getNext());
            tempNode.setNext(newNode);
        }
    }

    public T pop() {
        INode<T> poppedNode = null;
        poppedNode = head;
        head = head.getNext();
        return poppedNode.getKey();
    }

    @Override
    public String toString() {
        String data="[";
        if(head==null){
            return "[]";
        }
        INode<T> tempNode = head;
        while (tempNode.getNext() != null) {
             data+=tempNode.getKey()+",";
            tempNode = tempNode.getNext();
        }
        data+=tempNode.getKey()+"]";
        return data;
    }
}