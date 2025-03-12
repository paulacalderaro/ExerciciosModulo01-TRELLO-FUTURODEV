package produtoSimples;

import java.util.Scanner;

public class ProdutoSimples {
    public static void main(String[] args) {

        System.out.println(System.in);
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        int valor1 = scan.nextInt();

        System.out.println("Digite o segundo valor:");
        int valor2 = scan.nextInt();

        int multiplicacao= valor1*valor2;

        System.out.println("Produto=" + multiplicacao);
        scan.close();

    }
}
