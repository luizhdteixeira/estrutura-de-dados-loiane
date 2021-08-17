package com.luizhdteixeira.estruturadados.vetor.teste;

import com.luizhdteixeira.estruturadados.vetor.ArrayGeneric;

public class Exercise06 {

    public static void main(String[] args) {

        ArrayGeneric<String> arrayGeneric = new ArrayGeneric<>(20);

        for (int i = 0; i < 20; i++) {
            arrayGeneric.add("1234-5678");
        }

        System.out.println(arrayGeneric.size());
        System.out.println(arrayGeneric.find(6));
        System.out.println(arrayGeneric.remove(8));
        System.out.println(arrayGeneric.add(8, "2345-6789"));
        System.out.println(arrayGeneric.remove("1234-5678"));
        System.out.println(arrayGeneric.find("1234-5678"));
        System.out.println(arrayGeneric.findLastIndexOf("1234-5678"));
        System.out.println(arrayGeneric.get(8));
        System.out.println(arrayGeneric);
        arrayGeneric.clear();
        System.out.println(arrayGeneric);



    }
}
