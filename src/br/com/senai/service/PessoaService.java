package br.com.senai.service;

import br.com.senai.entity.EnderecoEntity;
import br.com.senai.entity.PessoaEntity;

import java.util.List;
import java.util.Scanner;

public class PessoaService {

    Scanner tec = new Scanner(System.in);

    public PessoaEntity cadastrarPessoa(String nome, String cpf, String email, int idade, double altura){
        //Instânciando objeto PessoaEntity
        PessoaEntity pessoaEntity = new PessoaEntity();

        //pessoaEntity.nome = Pedro;
        pessoaEntity.setNome(nome);
        pessoaEntity.setCpf(cpf);
        pessoaEntity.setEmail(email);
        pessoaEntity.setIdade(idade);
        pessoaEntity.setAltura(altura);
        return pessoaEntity;

//        System.out.println("Nome: " + pessoaEntity.nome);
//        System.out.println("CPF: " + pessoaEntity.cpf);
//        System.out.println("E-Mail: " + pessoaEntity.email);
//        System.out.println("Idade: " + pessoaEntity.idade);
//        System.out.println("Altura: " + pessoaEntity.altura);
//
//        System.out.println("--------------------");
//        //Instânciando novo objeto PessoaEntity
//        PessoaEntity pessoaEntityLuiz = new PessoaEntity();
//        pessoaEntityLuiz.nome = "Luiz";
//        pessoaEntityLuiz.cpf = "98745632104";
//        pessoaEntityLuiz.email = "luiz@email.com";
//        pessoaEntityLuiz.idade = 52;
//        pessoaEntityLuiz.altura = 1.70;
//
//        System.out.println("Nome: " + pessoaEntityLuiz.nome);
//        System.out.println("CPF: " + pessoaEntityLuiz.cpf);
//        System.out.println("E-Mail: " + pessoaEntityLuiz.email);
//        System.out.println("Idade: " + pessoaEntityLuiz.idade);
//        System.out.println("Altura: " + pessoaEntityLuiz.altura);
//
//        PessoaEntity pessoaEntityJohnatan2 = pessoaEntity;
//
//        System.out.println("-------------");
//        System.out.println("Objeto PessoaEntity");
//        System.out.println(pessoaEntity);
//        System.out.println("Objeto PessoaEntityLuiz");
//        System.out.println(pessoaEntityLuiz);
//        System.out.println("Objeto PessoaEntityJohnatan");
//        System.out.println(pessoaEntityJohnatan2);
//
//        System.out.println("--------------");
//        pessoaEntityJohnatan2.nome = "Johnatan Luiz";
//        System.out.println("Nome: " + pessoaEntityJohnatan2.nome);
//        System.out.println("Nome: " + pessoaEntity.nome);


    }

    public PessoaEntity cadastrarPessoa(String nome, String cpf, String email, int idade, double altura, EnderecoEntity endereco) {
        PessoaEntity pessoaEntity = new PessoaEntity();

        pessoaEntity.setNome(nome);
        pessoaEntity.setCpf(cpf);
        pessoaEntity.setEmail(email);
        pessoaEntity.setIdade(idade);
        pessoaEntity.setAltura(altura);
        pessoaEntity.setEndereco(endereco);
        return pessoaEntity;
    }

    public void listarPessoas(List<PessoaEntity> pessoas){
//        for
//        foreach
//        while
//        do while
//        stream
//        for(PessoaEntity pessoa : pessoas){
//
//        }
        System.out.println("Pessoas cadastradas");
        pessoas.forEach(pessoa -> {
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("CPF: " + pessoa.getCpf());
            System.out.println("E-Mail: " + pessoa.getEmail());
            System.out.println("Idade: " + pessoa.getIdade());
            System.out.println("Altura: " + pessoa.getAltura());
            System.out.println("--- ENDEREÇO ---");
            System.out.println("Pais: " + pessoa.getEndereco().getPais());
            System.out.println("Estado: " + pessoa.getEndereco().getEstado());
            System.out.println("Bairro: " + pessoa.getEndereco().getBairro());
            System.out.println("Cidade: " + pessoa.getEndereco().getCidade());
            System.out.println("------------------");
        });
    }

    public void buscarPessoa(){
    }

    public PessoaEntity editarPessoa(PessoaEntity pessoaEntity){
        System.out.print("Informe o novo nome: ");
        String nome = tec.nextLine();
        pessoaEntity.setNome(nome);
        return pessoaEntity;
    }

    public void removerPessoa(){

    }
}
