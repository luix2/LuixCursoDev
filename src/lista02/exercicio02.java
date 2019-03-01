package lista02;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        System.out.println(" Entre com o peso: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println("entre com altura: ");
        double b = sc.nextDouble();
        double resultado = a * b / 2;

        System.out.println("IMC " + resultado);
    }
}

