package controller;

import model.FuncionarioIntegral;
import model.FuncionarioParcial;
import model.FuncionarioTemp;

public class ContratacaoController {
    //Dependencia Não estrutural -> Variável Local

    public FuncionarioParcial contratoParcial() {
        FuncionarioParcial fp = new FuncionarioParcial();

        fp.setNomeFunc("João");
        fp.setCodFunc(1234);
        fp.setSalarioFunc(1700);
        fp.setHoraEntrada(10);
        fp.setHoraSaida(16);

        return fp;
    }

    public FuncionarioIntegral contratoIntegral() {
        FuncionarioIntegral fi = new FuncionarioIntegral();

        fi.setNomeFunc("Paula");
        fi.setCodFunc(1236);
        fi.setSalarioFunc(4300);
        fi.setBancoHoras(40);

        return fi;
    }

    public FuncionarioTemp contratoTemporario() {
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
