package com.luizhdteixeira.estruturadados.vetor.teste;

import com.luizhdteixeira.estruturadados.vetor.Array;

public class Classroom07 {

    public static void main(String[] args) {

        Array a = new Array(10);

        a.add("B");
        a.add("C");
        a.add("E");
        a.add("F");
        a.add("G");

        System.out.println(a);

        a.add(0,"A");
        a.add(3,"D");
        a.add(7,"H");
        a.add(9,"J");

        System.out.println(a);
    }
}
