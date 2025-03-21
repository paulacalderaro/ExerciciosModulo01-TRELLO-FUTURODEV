package AreaVerde;

import java.util.Arrays;

public class MonitoramentoResiduos {

//ATRIBUTOS

    private String tipoResiduo;
    private double[] residuosPorMes;
    private String dataColeta;
    private String statusColeta;
    private String responsavelColeta;
    private String quantidade;

//----------- GETTERS/SETTERS--------------

    public String getTipoResiduo() {
        return tipoResiduo;
    }

    public void setTipoResiduo() {
        this.tipoResiduo = tipoResiduo;
    }

    public double[] getResiduosPorMes() {
        return residuosPorMes;
    }

    public void setResiduosPorMes() {
        this.residuosPorMes = residuosPorMes;
    }


    public String getDataColeta() {
        return dataColeta;
    }

    public void setDataColeta() {
        this.dataColeta = dataColeta;
    }

    public String getStatusColeta() {
        return statusColeta;
    }

    public void setStatusColeta() {
        this.statusColeta = statusColeta;
    }


    public String getResponsavelColeta() {
        return responsavelColeta;
    }

    public void setResponsavelColeta() {
        this.responsavelColeta = responsavelColeta;
    }


    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade() {
        this.quantidade = quantidade;
    }

    //CONSTRUTOR ORIGINAL

    public MonitoramentoResiduos(String tipoResiduo, double[] residuosPorMes, String dataColeta,
                                 String statusColeta, String responsavelColeta, String quantidade) {
        this.tipoResiduo = tipoResiduo;
        this.residuosPorMes = residuosPorMes;
        this.dataColeta = dataColeta;
        this.statusColeta = statusColeta;
        this.responsavelColeta = responsavelColeta;
        this.quantidade = quantidade;

    }
    //NOVO CONSTRUTOR

    public MonitoramentoResiduos(String tipoResiduo, String quantidade, String dataColeta) {
        this.tipoResiduo = tipoResiduo;
        this.quantidade = quantidade;
        this.dataColeta = dataColeta;

    }


    //MÉTODO CALCULAR RESIDUOS POR MÊS

    public double calcularResiduosPorMes() {
        double total = 85000;
        for (double residuo : residuosPorMes) {
            total += residuo;
        }
        return total;
    }


    //MÉTODO EXIBIR INFORMAÇÕES
    public void exibirInformacoes() {
        System.out.println("Tipo Resíduo: " + tipoResiduo);
        System.out.println("Resíduos por Mês: " + Arrays.toString(residuosPorMes));
        System.out.println("Data Coleta: " + dataColeta);
        System.out.println("Status Coleta: " + statusColeta);
        System.out.println("Responsável Coleta: " + responsavelColeta);
        System.out.println("Quantidade: " + quantidade);

    }
}







