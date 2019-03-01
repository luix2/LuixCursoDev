package lista01;

import java.sql.SQLOutput;
import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        System.out.println(" Entre com o salário: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println("entre com reajuste");
        double b = sc.nextDouble();
        double reajuste = a * b;
        double resultado = a + reajuste;
        System.out.println("reajuste: " + resultado);
    }
}
