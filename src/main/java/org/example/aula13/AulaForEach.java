package org.example.aula13;

import java.util.ArrayList;
import java.util.List;

public class AulaForEach {

    static void main() {

        ArrayList<String> animais = new ArrayList<>(List.of("Lontra", "Gato", "Chinchila"));

        for (int i = 0; i< animais.size(); i++){
            System.out.println(animais.get(i));
        }

        System.out.println("\n===========================");

        //ler as coisas
        for (String animal : animais){
            System.out.println(animal);
        }


    }

}
