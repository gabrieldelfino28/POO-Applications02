package controller;

import model.Funcionario;
import model.FuncionarioTemp;

public class ContrataTemp implements IContratacao{
    @Override
    public Funcionario contratarFunc() {
        FuncionarioTemp ft = new FuncionarioTemp();
        ft.setNomeFunc("Carlos");
        ft.setCodFunc(4896);
        ft.setSalarioFunc(1500);
        ft.setDiaTemp(21);
        ft.setMesTemp(11);
        ft.setAnoTemp(2025);
        return ft;
    }
}
