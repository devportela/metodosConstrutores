package construtores.carro;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carro carro = new Carro();
        carro.setAno(sc.nextInt());
        carro.setCor(sc.next());
        carro.setModelo(sc.next());
        carro.mostrarDados();


    }
}
