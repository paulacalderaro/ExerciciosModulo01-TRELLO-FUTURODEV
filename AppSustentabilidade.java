package AreaVerde;

import java.util.Scanner;

public class AppSustentabilidade {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Olá, seja bem vindo(a) ao Joinville+Verde!");

        System.out.println("Digite uma opção:\n" + "1- Area Verde\n" + "2- Monitoramento de Resíduos");

        int opcao = scan.nextInt();

        if (opcao == 1) {
            System.out.println("1- Parque ZoobotÂnico\n" + "2- Parque dos Hemerocallis\n" +
                    "3- Parque Municipal do Morro do Finder\n");
            int opcaoEscolhida = scan.nextInt();

            switch (opcaoEscolhida) {
                case 1:
                    System.out.println("Parque ZoobotÂnico\n" +
                            "Este conteúdo orienta sobre como visitar Parque Zoobotânico, unidade do Município de " +
                            "Joinville (SC), localizada na Área de Relevante Interesse Ecológico (ARIE) do Morro da " +
                            "Boa Vista, que abriga animais da fauna silvestre brasileira e permite visitação e prática " +
                            "de atividades de lazer.");
                    break;
                case 2:
                    System.out.println("Parque dos Hemerocallis\n" +
                            "Somos Hemero, jardins como arte. Somos joinvilenses. Por: Prefeitura Municipal " +
                            "de Joinville. " + "Uma das maiores agências de viagens da América Latina, a Decolar, " +
                            "analisou os destinos preferidos " + "nas férias de janeiro de 2024, com base na procura " +
                            "de passagens aéreas no site e no aplicativo. " + "Joinville aparece em 14º lugar dos " +
                            "destinos entre cidades do […]");
                    break;
                case 3:
                    System.out.println("Parque Municipal do Morro do Finder\n" +
                            "PARQUE MUNICIPAL DO MORRO DO FINDER . Na recepção há banheiros e água para tomar,Possui " +
                            "trechos para mountain bike,  Bela vista da cidade do mirante. Ao lado há uma pedra para " +
                            "rapel.");
                    break;
                default:
                    System.out.println("Opção inválida");

            }
        } else if (opcao == 2) {
            System.out.println("1- Monitoramento topográfico mensal de resíduos\n" +
                    "2- Monitoramento mensal de águas superficiais dos rios próximos ao aterro\n" +
                    "3- Monitoramento trimestral da qualidade da água subterrânea\n");

            int escolhas = scan.nextInt();
            switch (escolhas) {
                case 1:
                    System.out.println("Monitoramento topográfico mensal de resíduos\n" +
                            "Todos nós já estivemos em alguma situação em que não sabíamos o que dizer, o que escrever " +
                            "ou como responder.");
                    break;
                case 2:
                    System.out.println("Monitoramento mensal de águas superficiais dos rios próximos ao aterro\n" +
                            "Aqui fornecemos exemplos de textos prontos [perguntas, respostas\n");

                    break;
                case 3:
                    System.out.println("Monitoramento trimestral da qualidade da água subterrânea\n" +
                            "comentários, status, inspirações, frases, micro-minutas] para uma variedade de situações \n" +
                            "do dia a dia.");
                    break;

                default:
                    System.out.println("Opção Inválida!");
            }

        }
    }

}






