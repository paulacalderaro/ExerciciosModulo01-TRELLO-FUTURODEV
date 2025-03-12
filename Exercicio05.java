package Eexercicio05;

import javax.print.attribute.standard.Media;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double A;
        double B;
        double media;

        System.out.println("Digite a 1° nota do aluno:  ");
        A = scan.nextDouble();

        System.out.println("Digite a 2° nota do aluno:  ");
        B = scan.nextDouble();

        media = (A + B)/2;

        System.out.println("A média do aluno é: " + media);
        System.out.printf("MÉDIA = %.2f%n", media);

        scan.close();


    }
}