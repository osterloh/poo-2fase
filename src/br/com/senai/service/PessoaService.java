package br.com.senai.service;

import br.com.senai.entity.PessoaEntity;

import java.util.List;
import java.util.Scanner;

public class PessoaService {

    Scanner tec = new Scanner(System.in);

    public PessoaEntity cadastrarPessoa(String nome, String cpf, String email, int idade, double altura){
        //Instânciando objeto PessoaEntity
        PessoaEntity pessoaEntity = new PessoaEntity();

        //pessoaEntity.nome = Pedro;
        pessoaEntity.nome = nome;
        pessoaEntity.cpf = cpf;
        pessoaEntity.email = email;
        pessoaEntity.idade = idade;
        pessoaEntity.altura = altura;
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
            System.out.println("Nome: " + pessoa.nome);
            System.out.println("CPF: " + pessoa.cpf);
            System.out.println("E-Mail: " + pessoa.email);
            System.out.println("Idade: " + pessoa.idade);
            System.out.println("Altura: " + pessoa.altura);
            System.out.println("------------------");
        });
    }

    public void buscarPessoa(){
    }

    public PessoaEntity editarPessoa(PessoaEntity pessoaEntity){
        System.out.print("Informe o novo nome: ");
        String nome = tec.nextLine();
        pessoaEntity.nome = nome;
        return pessoaEntity;
    }

    public void removerPessoa(){

    }
}
