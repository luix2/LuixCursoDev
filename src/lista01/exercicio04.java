package lista01;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        double Resultado;
        System.out.println("Informe o número de folhas: ");
        Scanner sc = new Scanner(System.in);
        int totalFolha = sc.nextInt();
        if (totalFolha <= 100) {
            Resultado = totalFolha * 0.25;
        } else {
            Resultado = totalFolha * 0.20;

        }
        System.out.println ( Resultado );
    }
}
