package com.luizhdteixeira.estruturadados.vetor.teste;

import java.util.ArrayList;

public class Classroom12 {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("A");
        arrayList.add("C");

        System.out.println(arrayList);

        arrayList.add(1, "B");

        System.out.println(arrayList);

        var exist = arrayList.contains("A");

        if (exist) {
            System.out.println("Elemento existe no Array");
        } else {
            System.out.println("Elemento não existe no Array");
        }

        int pos = arrayList.indexOf("D");
        if (pos >= 0) {
            System.out.println("Elemento existe no Array " + pos);
        } else {
            System.out.println("Elemento não existe no Array " + pos);
        }

        System.out.println(arrayList.get(2));

        arrayList.remove(0);
        arrayList.remove("B");

        System.out.println(arrayList);
    }
}
