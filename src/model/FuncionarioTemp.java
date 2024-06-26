package model;

public final class FuncionarioTemp extends Funcionario {
    private int diaTemp;
    private int mesTemp;
    private int anoTemp;

    public FuncionarioTemp() {
        super();
    }

    public int getDiaTemp() {
        return diaTemp;
    }

    public void setDiaTemp(int diaTemp) {
        this.diaTemp = diaTemp;
    }

    public int getMesTemp() {
        return mesTemp;
    }

    public void setMesTemp(int mesTemp) {
        if (mesTemp < 1) {
            this.mesTemp = 1;
        } else this.mesTemp = Math.min(mesTemp, 12);
    }

    public int getAnoTemp() {
        return anoTemp;
    }

    public void setAnoTemp(int anoTemp) {
        this.anoTemp = anoTemp;
    }

    @Override
    public String toString() {
        return "FuncionarioTemp -> {" +
                "nomeFunc=" + getNomeFunc() +
                ", codFunc=" + getCodFunc() +
                ", salarioFunc=" + getSalarioFunc() +
                ", diaTemp=" + diaTemp +
                ", mesTemp=" + mesTemp +
                ", anoTemp=" + anoTemp +
                '}';
    }
}
