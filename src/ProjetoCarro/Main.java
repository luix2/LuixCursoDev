package ProjetoCarro;

public class Main {
    public static void main(String args[]){
        Proprietario proprietario = new Proprietario();
        proprietario.nome = "Luix";
        proprietario.bairro = "Jurunas";
        proprietario.Cep = "660033";
        proprietario.cidade = "Belém";
        proprietario.CPF = "0245525525";
        proprietario.DataDeNascimento = "01/04/1991";
        proprietario.estado = "Pará";
        proprietario.RG = "25458454";
        proprietario.complemento = "casa";

        Carro carro = new Carro();
        carro.NrDePortas = 5;
        carro.NrMarchas = 5;
        carro.MarchaAtual = 1;
        carro.proprietario = proprietario;
        carro.VelocidadeAtual = 10;
        System.out.println(carro.VelocidadeAtual);
        carro.acelera();
        System.out.println(carro.VelocidadeAtual);

        System.out.println(carro.MarchaAtual);
        carro.trocaMarcha(4);
    }
}
