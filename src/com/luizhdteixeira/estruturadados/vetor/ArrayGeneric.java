package com.luizhdteixeira.estruturadados.vetor;

public class ArrayGeneric<T> {

    private T[] elements;
    private int size;

    @SuppressWarnings("unchecked")
    public ArrayGeneric(int capacity) {
        this.elements = (T[]) new Object[capacity];
        this.size = 0;
    }

    private T elements(int position) {
        return elements[position];
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

    @SuppressWarnings("unchecked")
    private void addSize() {
        if (size == elements.length) {
            T[] newElements = (T[]) new Object[elements.length * 2];
            for (int i = 0; i < elements.length; i++) {
                newElements[i] = elements[i];
            }
            elements = newElements;
        }
    }

    public boolean remove(int position) {
        verifyPosition(position, size);

        // move all elements
        for (int i = position; i < size-1 ; i++) {
            elements[i] = elements[i+1];
        }
        size--;
        elements[size] = null;
        return true;
    }

    // Exercise 03
    public boolean remove(T element) {
        if (element == null) {
            for (int i = 0; i < size; i++) {
                if (elements[i] == null) {
                    return remove(i);
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (element.equals(elements[i])) {
                    return remove(i);
                }
            }
        }
        return false;
    }

    // Exercise 04
    public T get(int position) {
        verifyPosition(position, size);
        return elements(position);
    }

    // Exercise 05
    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
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

    // Exercise 01
    public int find(T element) {
        if (element == null) {
            for (int i = 0; i < size; i++) {
                if (elements[i] == null) {
                    return i;
                }
            }
        } else {
            // Sequential search
            for (int i = 0; i < this.size; i++) {
                if (this.elements[i].equals(element)) {
                    return i;
                }
            }
        }
        return -1;
    }

    // Exercise 02
    public int findLastIndexOf(T element) {
        if (element == null) {
            for (int i = size-1; i >= 0; i--) {
                if (elements[i] == null) {
                    return i;
                }
            }
        } else {
            // Sequential search
            for (int i = size-1; i >= 0; i--) {
                if (this.elements[i].equals(element)) {
                    return i;
                }
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
