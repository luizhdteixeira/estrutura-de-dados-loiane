package com.luizhdteixeira.estruturadados.vetor.teste;

import com.luizhdteixeira.estruturadados.vetor.Array;

public class Classroom05 {

    public static void main(String[] args) {

        Array a = new Array(10);

        a.add("element 1");
        a.add("element 2");
        a.add("element 3");

        System.out.println(a.find(0));
    }
}
