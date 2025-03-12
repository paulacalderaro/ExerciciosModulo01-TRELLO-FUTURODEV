package InverterValor;

public class InverterValor {
    public static void main(String[] args) {

        char[] vetor = {'a', 'b', 'c', 'd'};

        System.out.println("Primeiro vetor: ");
        for (char c : vetor) {
            System.out.print(c + " ");
        }
        System.out.println();

        int inicio = 0;
        int fim = vetor.length - 1;
        while (inicio < fim) {
            char temp = vetor[inicio];
            vetor[fim] = temp;
            inicio++;
            fim--;

        }
        System.out.println("\nVetor invertido: ");
        for (char c : vetor) {
            System.out.println(c + " ");
        }
        System.out.println();
    }

}
