package br.com.senai.entity;

public class PessoaEntity {
    private String nome;        //atributo nome
    private String cpf;         //atributo cpf
    private String email;       //atributo e-mail
    private int idade;          //atributo idade
    private double altura;      //atributo altura

    private EnderecoEntity endereco;

    public PessoaEntity(){

    }

    public PessoaEntity(String nome, String cpf, String email, int idade, double altura, EnderecoEntity endereco){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.idade = idade;
        this.altura = altura;
        this.endereco = endereco;
    }

    public PessoaEntity(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf(){
        return cpf;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return idade;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getAltura(){
        return altura;
    }

    public void setEndereco(EnderecoEntity endereco){
        this.endereco = endereco;
    }

    public EnderecoEntity getEndereco(){
        return endereco;
    }



//    public void endereco(){
//        EnderecoEntity endereco = new EnderecoEntity();
//        endereco.estado = "SC";
//        endereco.pais = "Brasil";
//        endereco.numero = 18;
//    }
}
