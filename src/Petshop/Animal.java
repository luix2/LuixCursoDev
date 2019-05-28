package Petshop;

public class Animal {
    private String nome;
    private String Data_Nasc;
    private String Apelido;
    private Funcionario funcionario;

    public Animal(String nome, String data_Nasc, String apelido) {
        this.nome = nome;
        Data_Nasc = data_Nasc;
        Apelido = apelido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_Nasc() {
        return Data_Nasc;
    }

    public void setData_Nasc(String data_Nasc) {
        Data_Nasc = data_Nasc;
    }

    public String getApelido() {
        return Apelido;
    }

    public void setApelido(String apelido) {
        Apelido = apelido;
    }

    public void cadastro_animal(){

    }
}
