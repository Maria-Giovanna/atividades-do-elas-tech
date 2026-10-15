package org.example.aula11;

import java.util.ArrayList;
import java.util.List;

public class AulaArrayList {
    static void main() {
        ArrayList<Integer> lista= new ArrayList<>();

        lista.add(1);
        lista.add(10);
        lista.add(100);

        System.out.println(lista);

        lista.addAll(List.of(1,2,4,5,6,234,9));
        System.out.println(lista);

        lista.remove(0);
        System.out.println(lista);

        System.out.println(lista.get(4));
        System.out.println(lista.get(7));

        lista.set(0,98);
        System.out.println(lista);

        System.out.println(lista.size());

        System.out.println(lista.contains(7));
        System.out.println(lista.contains(98));

    }
}
