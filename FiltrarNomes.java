package FiltrarNomes;

import java.util.ArrayList;

public class FiltrarNomes {

    public static ArrayList<String> filtrarNomes(ArrayList<String> nomes, char C) {

        ArrayList<String> nomesFiltrados = new ArrayList<>();

        for (String nome : nomes) {
            if (!nome.isEmpty() && nome.charAt(0) == C) {
                nomesFiltrados.add(nome);
            }
        }
        return nomesFiltrados;
    }

    public static void main(String[] args) {

        ArrayList<String> filtro = new ArrayList<>();
        filtro.add("Paula");
        filtro.add("Rodolfo");
        filtro.add("Lucas");
        filtro.add("Carlos");
        filtro.add("Carolina");

        char filtrar = 'C';

        ArrayList<String> nomesFiltrados = filtrarNomes(filtro, filtrar);

        System.out.println("Nomes filtrados:");
        for (String nome : nomesFiltrados) {
            System.out.println(nome);

        }
    }
}





