package Petshop;

public class Cliente {
    private String nome;
    private int RG;
    private String CPF;
    private String End;
    private String Tel;
    private Funcionario funcionario;

    public Cliente(String nome, int RG, String CPF, String end, String tel) {
        this.nome = nome;
        this.RG = RG;
        this.CPF = CPF;
        End = end;
        Tel = tel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRG() {
        return RG;
    }

    public void setRG(int RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEnd() {
        return End;
    }

    public void setEnd(String end) {
        End = end;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String tel) {
        Tel = tel;
    }

    public void cadastro_cliente(){

    }
}
