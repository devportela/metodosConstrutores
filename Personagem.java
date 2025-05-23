package construtores;

public class Personagem {
    //atributos da classe

    private String nome;
    private int nivel;
    private int forca;
    private int vida;
    private String classe;


    //metodo construtor

    public Personagem(String nome, String classe) {
        this.nome = nome;
        this.classe = classe;
        nivel = 10;
        vida = nivel * 5000;

        if (classe.equals("guerreiro")) {
            forca = nivel * 2;
        } else {
            forca = nivel * 1;
        }

    }


    //metodos especificos
    public void mostrarStatus() {
        System.out.println("Nome:" + nome);
        System.out.println("nivel:" + nivel);
        System.out.println("vida:" + vida);
        System.out.println("classe:" + classe
        );
    }


    //metodos getter e setters


    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}
