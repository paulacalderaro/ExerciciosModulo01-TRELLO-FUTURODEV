package AreaVerde;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        // -------------------------- AREA VERDE -----------------------------//
//INSTANCIANDO/CRIANDO OBJETOS

        AreaVerde area = new AreaVerde("Parque Zoobotânico", "Saguaçu, Joinville SC", 85000,
                "Bem conservado", "Prefeitura de Joinville");

        area.setNome("Zoobotânico");
        area.setLocalizacao();
        area.setTamanho();
        area.setStatusConservacao();
        area.setResponsavel();

        System.out.println("Nome: " + area.getNome());
        System.out.println("Localização: " + area.getLocalizacao());
        System.out.println("Tamanho: " + area.getTamanho());
        System.out.println("Status de Conservação: " + area.getStatusConservacao());
        System.out.println("Responsável: " + area.getResponsavel());

        area.setNome("Zoo");

        System.out.println("--- Informações da Área Verde ---");
        area.exibirInformacoes();

        System.out.println();

        //NOVO CONSTRUTOR
        AreaVerde area01 = new AreaVerde("Parque", "Joinville", "85000");
        System.out.println("Nome: Parque");
        System.out.println("Localização: Joinville");
        System.out.println("Tamanho: 85000m²");
        System.out.println();

        System.out.println("------Informações de Monitoramento de Resíduos------");
        System.out.println();

//INSTANCIANDO/CRIANDO OBJETOS
        double[] residuosPorMes = {30.000};

        MonitoramentoResiduos residuos = new MonitoramentoResiduos("Lixo orgânico", residuosPorMes,
                "18-02-2025", "Concluído", "Prefeitura de Joinville", "30 toneladas");

        residuos.setTipoResiduo();
        residuos.getResiduosPorMes();
        residuos.setDataColeta();
        residuos.setStatusColeta();
        residuos.setResponsavelColeta();
        residuos.setQuantidade();

        System.out.println("Tipo de Resíduo: " + residuos.getTipoResiduo());
        System.out.println("Resíduos por mês: " + residuos.getResiduosPorMes());
        System.out.println("Data da Coleta: " + residuos.getDataColeta());
        System.out.println("Responsável: " + residuos.getResponsavelColeta());
        System.out.println("Quantidade:" + residuos.getQuantidade());

        System.out.println();
        //novo construtor
        MonitoramentoResiduos residuos01 = new MonitoramentoResiduos("Orgânico", "2 toneladas", "18-02-2025");
        System.out.println("Tipo Resíduo: Orgânico");
        System.out.println("Quantidade: 2 toneladas");
        System.out.println("Data Coleta: 18-02-2025");


    }
}

