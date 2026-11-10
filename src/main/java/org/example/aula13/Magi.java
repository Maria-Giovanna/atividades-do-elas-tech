package org.example.aula13;

import org.example.aula13.interfaces.Pagamento;

public class Magi implements Pagamento {

    @Override
    public void diminuirSaldo() {
        System.out.println("O saldo não diminuiu");
    }

    @Override
    public void gastar() {
        System.out.println("Não houve gastos");
    }

}
