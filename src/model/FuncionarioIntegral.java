package model;

public final class FuncionarioIntegral extends Funcionario {
    private int bancoHoras;

    public FuncionarioIntegral() {
        super();
    }

    public int getBancoHoras() {
        return bancoHoras;
    }

    public final void setBancoHoras(int bancoHoras) {
        this.bancoHoras = bancoHoras;
    }

    @Override
    public String toString() {
        return "FuncionarioIntegral -> {" +
                "nomeFunc=" + getNomeFunc() +
                ", codFunc=" + getCodFunc() +
                ", salarioFunc=" + getSalarioFunc() +
                ", bancoHoras=" + bancoHoras +
                '}';
    }
}
