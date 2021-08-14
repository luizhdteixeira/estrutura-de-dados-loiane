package com.luizhdteixeira.estruturadados.vetor;

public class Array {

    private final String[] elements;
    private int size;

    public Array(int capacity) {
        this.elements = new String[capacity];
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    /*
    Inefficient add method
    public void add(String element) {
        for (int i=0; i<elements.length; i++) {
            if (elements[i] == null) {
                elements[i] = element;
                break;
            }
        }
    }*/

    // Efficient method
    public void add(String element) {
        if (this.size < this.elements.length) {
            this.elements[this.size] = element;
            this.size++;
        }
    }

    public void add(int position, String element) {
        if (!(position >= 0 && position < elements.length)) {
            throw new IllegalArgumentException("Position invalid");
        }

        // move all elements
        for (int i = size-1; i >= position ; i--) {
            elements[i+1] = elements[i];
        }

        // add element in position
        elements[position] = element;
        size++;
    }

    public void remove(int position) {}

    public String find(int position) {
        if (!(position >= 0 && position < size)) {
            throw new IllegalArgumentException("Position invalid");
        }
        return this.elements[position];
    }

    public int find(String element) {
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
