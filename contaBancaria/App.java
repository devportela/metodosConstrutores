package construtores.contaBancaria;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        contaBanco conta = new contaBanco();


        conta.setNumeroConta(sc.next());
        conta.setTitular(sc.next());
        System.out.println("deseja depositar?? S/N");
        String resp = sc.next();

        if (resp.equalsIgnoreCase("S")) {
            do {
                System.out.println("Insira o valor para depósito abaixo:");
                conta.setSaldo(sc.nextDouble());
                System.out.println("Saldo atual: " + conta.getSaldo());

                System.out.println("Deseja depositar novamente? (S/N)");
                resp = sc.next();
            } while (resp.equalsIgnoreCase("S"));
        }




    }
}
