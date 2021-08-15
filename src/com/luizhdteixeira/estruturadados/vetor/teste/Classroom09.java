package com.luizhdteixeira.estruturadados.vetor.teste;

import com.luizhdteixeira.estruturadados.vetor.Array;

public class Classroom09 {

    public static void main(String[] args) {

        Array a = new Array(4);

        a.add("B");
        a.add("G");
        a.add("D");
        a.add("E");
        a.add("F");

        System.out.println(a);

        a.remove(1);

        System.out.println(a);

        int pos = a.find("E");
        if (pos >= 0 ) {
            a.remove(pos);
        }

        System.out.println(a);

    }
}
