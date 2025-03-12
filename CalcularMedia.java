package CalcularMedia;

public class CalcularMedia {

    public static void main(String[] args) {

    }

    public static double calcularMedia(double[] vetor) {
        if (vetor == null || vetor.length == 0) {
            return 0.0;
        }
        double soma = 0;
        for (double valor : vetor) {
            soma += valor;
        }
        return soma / vetor.length;
    }

}






