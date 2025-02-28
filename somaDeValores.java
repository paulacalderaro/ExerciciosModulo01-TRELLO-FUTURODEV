package exercicios02;

import java.util.Scanner;

public class somaDeValores {

    public static void main(String[] args) {

        System.out.println(System.in);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para a soma: ");

        int A = scanner.nextInt();

        System.out.println("Digite um número para a soma: ");

        int B = scanner.nextInt();

        int SOMA = A + B;


        System.out.println("RESULTADO = " + SOMA);

        scanner.close();
    }
}

/* ENTRADA DE DADOS - PROCESSAMENTO - SAÍDA DE DADOS

 */
/*
Scanner scan = new Scanner(System.in);
*/

//Strings
/* scan.next();
scan.nextLine();
//Inteiros
scan.nextInt();
//Decimais
scan.nextDouble();
scan.nextFloat();
//Logico
scan.nextBoolean();

 */
