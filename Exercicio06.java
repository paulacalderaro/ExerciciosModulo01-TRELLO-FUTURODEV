package exercicio06;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        System.out.println("Digite o nome do funcionário:\n");
        String nomeFuncionario = scan.next();

        System.out.printf("Digite as horas trabalhadas:\n");
        int horasTrabalhadas = scan.nextInt();

        System.out.printf("Digite o salário por hora:\n");
        double valorPorHora = scan.nextDouble();

        double salario = horasTrabalhadas*valorPorHora;

               System.out.printf("O funcionario receberá R$:" + salario);
        scan.close();

    }
}
