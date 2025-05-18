package pessoa;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa = new Pessoa("gustavo", 16, "922.323.323-44");

        System.out.println("nome: " + pessoa.getNome());
        System.out.println("idade: " + pessoa.getIdade());
        System.out.println("cpf: " + pessoa.getCpf());
        //valores passados pelo metodo construtor

        pessoa.setNome("portela");
        pessoa.setIdade(19);
        pessoa.setCpf("123.456.789.10"); //alteracao dos valores pelo metodo getter e setter

        System.out.println("nome: " + pessoa.getNome());
        System.out.println("idade: " + pessoa.getIdade());
        System.out.println("cpf: " + pessoa.getCpf()); //imprimindo os valores atualiados.


    }
}
