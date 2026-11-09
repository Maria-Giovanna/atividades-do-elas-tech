package org.example.aula11.hashMap;

import java.util.HashMap;

public class HashmapDaAula {

    static void main() {

        HashMap<String, String> emails = new HashMap<>();

        emails.put("Maria Giovanna", "magi@gmail.com");
        System.out.println("Aqui ele imprime o valor da chave >MARIA GIOVANNA< : \n"+emails.get("Maria Giovanna"));

        emails.put("posição 2", "Teste com acento");
        System.out.println("Aqui ele imprime o valor da chave >posição 2< : \n"+emails.get("posição 2"));

        emails.put("Herbert","herbert@gmail.com");
        System.out.println("Aqui ele imprime o valor da chave >Herbert< : \n"+emails.get("Herbert"));

        System.out.println(emails.getOrDefault("olá", "\nNão existe no nosso banco de dados essa informação. Tente novamente!"));

        System.out.println("\n================================\n");

        System.out.println("Lista de chaves: "+ emails.keySet());
        System.out.println("Lista dos valores: "+ emails.values());

        System.out.println("\n"+ emails.containsKey("java"));
    }
}
