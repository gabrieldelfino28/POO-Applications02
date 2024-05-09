package controller;

import model.Funcionario;
import model.FuncionarioIntegral;

public class ContrataIntegral implements IContratacao{
    @Override
    public Funcionario contratarFunc() {
        FuncionarioIntegral f = new FuncionarioIntegral();
        f.setNomeFunc("Paula");
        f.setCodFunc(1236);
        f.setSalarioFunc(4300);
        f.setBancoHoras(40);
        return f;
    }
}
