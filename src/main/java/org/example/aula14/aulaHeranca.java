package org.example.aula14;

public class aulaHeranca {

    static void main() {
        Medicos mariaMedica = new Medicos();

        mariaMedica.baterPonto();
        mariaMedica.passarCracha();
        mariaMedica.fazerCirurgia();

        FuncionariosDoHospital joaoDoRh = new FuncionariosDoHospital();

        joaoDoRh.passarCracha();

        Oftalmologista alineOftalmo = new Oftalmologista();

        alineOftalmo.examinarOlho();
        alineOftalmo.passarOculos();
        alineOftalmo.consulta();
        alineOftalmo.fazerCirurgia();

    }
}
