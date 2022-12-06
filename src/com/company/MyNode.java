package com.company;

public class MyNode<T> implements INode<T> {
    private INode<T> next;
    private T key;

    public MyNode(T key) {
        this.key = key;
    }

    @Override
    public INode<T> getNext() {
        return next;
    }

    @Override
    public void setNext(INode<T> next) {
        this.next = next;
    }

    @Override
    public T getKey() {
        return key;
    }

    @Override
    public void setKey(T key) {
        this.key = key;
    }
}
