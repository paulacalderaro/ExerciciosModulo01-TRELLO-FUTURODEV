package exercicioAulaMatriz;

public class ExercicioAulaMatriz {
    public static void main(String[] args) {

        int[][] matriz = {
                {32, 13, 14},
                {15, 76, 17},
                {28, 19, 20}
        };

        System.out.println("Matriz: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        int maiorValor = matriz[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (matriz[i][j] > maiorValor){
                    maiorValor = matriz[i][j];
                }
            }
        }
        System.out.println("O maior valor da Matriz é: " + maiorValor);
    }
}

