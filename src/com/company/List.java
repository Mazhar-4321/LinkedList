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
     public void delete(T element){
        remove(element);
         System.out.println(size);
     }
    public void append(T item) {
        insert(size, item);
    }

    public void insertAfter(T item1, T item2) {
        INode<T> tempNode = head;
        INode<T> newNode = new MyNode<>(item2);
        while (tempNode != null){
            if (tempNode.getKey().equals(item1)) {
                newNode.setNext(tempNode.getNext());
                tempNode.setNext(newNode);
                if (tempNode == tail) {
                    tail = newNode;
                }
                size++;
                return;
            }
            tempNode = tempNode.getNext();
        }
    }

    public void insertBetWeenNodes(T item1, T item2, T item3) {
        INode<T> newNode = new MyNode<>(item3);
        INode<T> tempNode = head;
        while (tempNode.getNext() != null) {
            if (tempNode.getKey().equals(item1) && tempNode.getNext().getKey().equals(item2)) {
                newNode.setNext(tempNode.getNext());
                tempNode.setNext(newNode);
                size++;
            }
            tempNode = tempNode.getNext();
        }
    }

    public void deleteFirstElement() {
        head = head != null ? head.getNext() : null;
    }

    public void deleteLastElement() {
        INode<T> tempNode = head;
        if (tempNode == null) {
            return;
        }
        if (tempNode == tail) {
            head = null;
            tail = null;
            size--;
        }
        while (tempNode != null) {
            if (tempNode.getNext() == tail) {
                tail = tempNode;
                tempNode.setNext(null);
                size--;
                return;
            }
            tempNode = tempNode.getNext();
        }
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
        boolean isPositionLast = pos == size ? true : false;
        INode<T> tempNode = head;
        INode<T> newNode = new MyNode<>(item);
        while (pos > 1 && tempNode.getNext() != null) {
            pos--;
            tempNode = tempNode.getNext();
        }
        if (pos == 1) {
            newNode.setNext(tempNode != null ? tempNode.getNext() : null);
            tempNode.setNext(newNode);
            size++;
        }
        if (isPositionLast) {
            tail = newNode;
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
        String data = "[";
        if (head == null) {
            return "[]";
        }
        INode<T> tempNode = head;
        while (tempNode.getNext() != null) {
            data += tempNode.getKey() + ",";
            tempNode = tempNode.getNext();
        }
        data += tempNode.getKey() + "]";
        return data;
    }
}
