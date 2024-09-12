package br.com.ads;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Pessoa pessoa = new Pessoa();

        cliente.setNome("José");
        cliente.setAtivo(true);

        Cliente clientePessoa = new Cliente(
                "123abc",
                125.83,
                true,
                "Pedro Rodolfo",
                "01234567891",
                43,
                "pedro.rodolfo@email.com"
        );

        Funcao funcaoMaria = new Funcao("Compras");
        Funcionario funcionarioMaria = new Funcionario(
                "987",
                "maria.tereza@empresa.com",
                3535.95,
                funcaoMaria,
                "Maria Tereza",
                "9874561234",
                38,
                "maria.terezinha@email.com"
        );

        Funcionario funcionarioLuiz = new Funcionario(
                "986",
                "luiz.ricardo@empresa.com",
                3535.95,
                new Funcao("Vendas"),
                "Luiz Ricardo",
                "9874561238",
                29,
                "ric.luiz@email.com"
        );

        System.out.println("teste");
    }
}
