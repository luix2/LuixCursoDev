package lista02;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        System.out.println(" Entre com o tamanho: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("entre com a velocidade de conexao : ");
        int b = sc.nextInt();
        int resultado = a/b;

        System.out.println("Download " + resultado);
    }
}

