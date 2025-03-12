package exercicio03;

import java.util.Scanner;

public class AreaDoCirculo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double raio = scan.nextDouble();
        final double PI = 3.14159;


        double area = PI * Math.pow(raio, 2);

        System.out.println("Valor de Area =" + area);


    }

}
