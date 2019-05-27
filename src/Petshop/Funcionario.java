package Petshop;

public class Funcionario {
    private String nome;
    private String CPF;
    private int matricula;

    public Funcionario(String nome, String CPF, int matricula) {
        this.nome = nome;
        this.CPF = CPF;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
