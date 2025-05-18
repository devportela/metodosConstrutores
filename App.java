package construtores;

import javax.swing.*;

public class App {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog(null,"nome do personagem");
        String classe= JOptionPane.showInputDialog(null,"classe do personagem" );




        Personagem guerreiro = new Personagem("nome","classe");
        guerreiro.mostrarStatus();

    }
}
