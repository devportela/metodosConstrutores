package construtores.produto;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto();
        produto.setNome(sc.next());
        produto.setPreco(sc.nextDouble());
        produto.setQuantidade(sc.nextInt());
        produto.imprimirDados();


    }
}
