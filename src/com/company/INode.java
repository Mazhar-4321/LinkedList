package com.company;

public interface INode<T> {
    void setKey(T key);
    void setNext(INode<T> next);
    INode<T> getNext();
    T getKey();
}
