package AreaVerde;

public class AreaVerde {

    //ATRIBUTOS

    private String nome;
    private String localizacao;
    private double tamanho;
    private String statusConservacao;
    private String responsavel;

    //----------- GETTERS/SETTERS--------------

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao() {
        this.localizacao = localizacao;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho() {
        this.tamanho = tamanho;
    }

    public String getStatusConservacao() {
        return statusConservacao;
    }

    public void setStatusConservacao() {
        this.statusConservacao = statusConservacao;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel() {
        this.responsavel = responsavel;
    }

    //MÉTODO

    public AreaVerde(String nome, String localizacao, double tamanho, String statusConservacao, String responsavel) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.tamanho = tamanho;
        this.statusConservacao = statusConservacao;
        this.responsavel = responsavel;
    }

    public AreaVerde(String parque, String joinville, String number) {
    }

//MÉTODO DOUBLE

    public double calcularTamanhoEmHectares() {
        return tamanho / 10000;
    }

    //ADICIONANDO CONSTRUTOR - fn+alt+ins

    public AreaVerde(String nome, String localizacao, double tamanho) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.tamanho = tamanho;
    }

    //MÉTODO EXIBIR INFORMAÇÕES
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Localização: " + localizacao);
        System.out.println("Tamanho: " + tamanho + " m² (" + calcularTamanhoEmHectares() + " hectares)");
        System.out.println("Status de Conservação: " + statusConservacao);
        System.out.println("Responsável: " + responsavel);

    }
}




