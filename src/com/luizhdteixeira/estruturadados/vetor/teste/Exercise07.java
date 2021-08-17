package com.luizhdteixeira.estruturadados.vetor.teste;

import java.util.ArrayList;

public class Exercise07 {

    public static void main(String[] args) {

        var list = new ArrayList<String>(20);

        for (int i = 0; i < 20; i++) {
            list.add("1234-5678");
        }

        System.out.println(list.size());
        System.out.println(list.remove(8));
        list.add(8, "2345-6789");
        System.out.println(list.get(8));
        System.out.println(list.remove("1234-5678"));
        System.out.println(list.contains("1234-5678"));
        System.out.println(list.lastIndexOf("1234-5678"));
        System.out.println(list);
        list.clear();
        System.out.println(list);



    }
}
