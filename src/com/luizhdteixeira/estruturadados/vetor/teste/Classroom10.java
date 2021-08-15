package com.luizhdteixeira.estruturadados.vetor.teste;

import com.luizhdteixeira.estruturadados.vetor.ArrayObject;

public class Classroom10 {

    public static void main(String[] args) {

        ArrayObject arrayObject = new ArrayObject(1);

        arrayObject.add(3);
        arrayObject.add(4);
        arrayObject.add(5);

        System.out.println("Length: " + arrayObject.size());

        System.out.println(arrayObject);
    }
}
