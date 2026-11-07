package org.example.aula10.runtime.test;

import java.io.File;
import java.io.IOException;

public class RuntimeExceptionExercicio {
    //Checked e Unchecked

    static void main() {

    }

    private static void criarNovoArquivo(){
        File file=new File("arquivo\\teste.txt");

        try {
          boolean isCriado= file.createNewFile();
            System.out.println("Arquivo criado" + isCriado);
        }catch (IOException e){
            System.out.println("Não foi possivel cria o arquivo");
        }
    }

}
