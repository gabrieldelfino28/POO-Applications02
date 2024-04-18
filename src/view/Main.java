package view;

import controller.ContratacaoController;

public class Main {

    public static void main(String[] args) {

        ContratacaoController control = new ContratacaoController();

        System.out.println(control.contratoIntegral());
        System.out.println(control.contratoParcial());
        System.out.println(control.contratoTemporario());

    }
}
