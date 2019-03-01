package lista02;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args){
        int  Distancia;
        double combustivel, resultado;
        System.out.println("Informe a distância: ");
        Scanner sc = new Scanner(System.in);
        Distancia = sc.nextInt();
        System.out.println("Informe a quantidade de combustivel: ");
        combustivel = sc.nextDouble();
        resultado = Distancia/combustivel;
        System.out.println("consumo do veiculo: " + resultado);

    }
}
