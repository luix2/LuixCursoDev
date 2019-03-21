package ProjetoCarro;

public class Carro {
        String Modelo, Cor, Marca, Chassi;
        boolean TetoSolar, CambioAutomatico;
        int Ano, NrDePortas, NrMarchas, MarchaAtual;
        double VolumeDeCombustivel, VelocidadeMaxima, VelocidadeAtual;
        Proprietario proprietario;

        void acelera(){
            VelocidadeAtual = VelocidadeAtual + 1;
        }

        void freia(){
            VelocidadeAtual = 0;
        }

        void trocaMarcha(int TrocarMarchas){
            MarchaAtual = TrocarMarchas;

        }

        void reduzMarcha(){
            MarchaAtual = MarchaAtual -1;
        }


}
