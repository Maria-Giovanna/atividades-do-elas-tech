package org.example.aula13;

import org.example.aula13.interfaces.Pagamento;

public class Flora implements Pagamento {

    @Override
    public void diminuirSaldo() {
        System.out.println("Saldo de flora não diminuiu");
    }

    @Override
    public void gastar() {
        System.out.println("Flora gastou 1 milhão de reais");
    }


}
