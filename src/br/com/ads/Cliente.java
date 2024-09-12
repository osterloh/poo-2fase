package br.com.ads;

public class Cliente extends Pessoa {
    private String cadastro;
    private double limiteCredito;
    private boolean ativo;

    public Cliente(){}

    public Cliente(String cadastro, double limiteCredito, boolean ativo) {
        this.cadastro = cadastro;
        this.limiteCredito = limiteCredito;
        this.ativo = ativo;
    }

    public Cliente(String cadastro, double limiteCredito, boolean ativo,
                   String nome, String cpf, int idade, String email) {
        super(nome, cpf, idade, email);
        this.cadastro = cadastro;
        this.limiteCredito = limiteCredito;
        this.ativo = ativo;
    }

    public String getCadastro() {
        return cadastro;
    }

    public void setCadastro(String cadastro) {
        this.cadastro = cadastro;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
