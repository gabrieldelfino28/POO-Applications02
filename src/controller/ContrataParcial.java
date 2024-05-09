package controller;

import model.Funcionario;
import model.FuncionarioParcial;

public class ContrataParcial implements IContratacao{
    @Override
    public Funcionario contratarFunc() {
        FuncionarioParcial fp = new FuncionarioParcial();
        fp.setNomeFunc("João");
        fp.setCodFunc(1234);
        fp.setSalarioFunc(1700);
        fp.setHoraEntrada(10);
        fp.setHoraSaida(16);
        return fp;
    }
}
