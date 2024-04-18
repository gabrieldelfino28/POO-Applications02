package model;

public final class FuncionarioParcial extends Funcionario {
    private int horaEntrada;
    private int horaSaida;

    public FuncionarioParcial() {
        super();
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public int getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(int horaSaida) {
        this.horaSaida = horaSaida;
    }

    @Override
    public String toString() {
        return "FuncionarioParcial -> {" +
                "nomeFunc=" + getNomeFunc() +
                ", codFunc=" + getCodFunc() +
                ", salarioFunc=" + getSalarioFunc() +
                ", horaEntrada=" + horaEntrada +
                ", horaSaida=" + horaSaida +
                '}';
    }
}
