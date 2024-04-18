package model;

public abstract class Funcionario {
    private String nomeFunc;
    private int codFunc;
    private float salarioFunc;

    public Funcionario() {
        super();
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public final void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public int getCodFunc() {
        return codFunc;
    }

    public final void setCodFunc(int codFunc) {
        this.codFunc = codFunc;
    }

    public float getSalarioFunc() {
        return salarioFunc;
    }

    public final void setSalarioFunc(float salarioFunc) {
        this.salarioFunc = salarioFunc;
    }
}
