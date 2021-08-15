package com.luizhdteixeira.estruturadados.vetor;

import java.lang.reflect.Array;

public class ArrayGeneric<T> {

    private T[] elements;
    private int size;

    public ArrayGeneric(int capacity) {
        this.elements = (T[]) new Object[capacity];
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    // Efficient method
    public boolean add(T element) {
        addSize();
        if (this.size < this.elements.length) {
            this.elements[this.size] = element;
            this.size++;
            return true;
        }
        return false;
    }

    public boolean add(int position, T element) {
        addSize();
        verifyPosition(position, elements.length);

        // move all elements
        for (int i = size-1; i >= position ; i--) {
            elements[i+1] = elements[i];
        }

        // add element in position
        elements[position] = element;
        size++;
        return true;
    }

    private void addSize() {
        if (size == elements.length) {
            T[] newElements = (T[]) new Object[elements.length * 2];
            for (int i = 0; i < elements.length; i++) {
                newElements[i] = elements[i];
            }
            elements = newElements;
        }
    }

    public void remove(int position) {
        verifyPosition(position, size);

        // move all elements
        for (int i = position; i < size-1 ; i++) {
            elements[i] = elements[i+1];
        }
        size--;
        elements[size+1] = null;
    }

    private void verifyPosition(int position, int length) {
        if (!(position >= 0 && position < length)) {
            throw new IllegalArgumentException("Position invalid");
        }
    }

    public T find(int position) {
        verifyPosition(position, size);
        return this.elements[position];
    }

    public int find(T element) {
        // Sequential search
        for (int i = 0; i < this.size; i++) {
            if (this.elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < this.size - 1; i++) {
            s.append(this.elements[i]);
            s.append(", ");
        }
        if (this.size > 0) {
            s.append(this.elements[this.size-1]);
        }
        s.append("]");
        return s.toString();
    }
}
