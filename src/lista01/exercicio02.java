package lista01;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args){
        System.out.println(" Entre com o total de vendas: ");
        Scanner sc = new Scanner(System.in);
        double tVendas = sc.nextDouble();
        double comissao = tVendas * 0.1;
        System.out.println(comissao);

    }
}
