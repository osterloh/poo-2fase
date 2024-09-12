package br.com.ads;

public class Funcionario extends Pessoa {

    private String matricula;
    private String email;
    private double salario;
    private Funcao funcao;

    public Funcionario(){}

    public Funcionario(String matricula, String email, double salario, Funcao funcao){
        this.matricula = matricula;
        this.email = email;
        this.salario = salario;
        this.funcao = funcao;
    }

    public Funcionario(String matricula, String email, double salario, Funcao funcao,
                       String nome, String cpf, int idade, String emailPessoa) {
        super(nome, cpf, idade, emailPessoa);
        this.matricula = matricula;
        this.email = email;
        this.salario = salario;
        this.funcao = funcao;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Funcao getFuncao() {
        return funcao;
    }

    public void setFuncao(Funcao funcao) {
        this.funcao = funcao;
    }
}
