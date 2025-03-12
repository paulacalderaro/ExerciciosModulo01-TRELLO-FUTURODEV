package somaVetor;

public class SomaVetor {
    public static void main(String[] args) {

        int[] numeros = {1,2,3,4,5,6};
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

              System.out.println("Soma de todos os elementos:" + soma);
       }
    }
