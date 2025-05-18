package construtores;

public class Pessoa {
    //atributos da classe
    //atributos são as coisas que a classe tem
    //ex: a pessoa tem nome idade e altura;
    private String nome;
    private int idade;
    private float altura;


    //construtor


    public Pessoa(float altura, int idade, String nome) {
        this.altura = altura;
        this.idade = idade;
        this.nome = nome;
    }

    public void imprimirDados(){
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(altura);
    }



    //metodo getter and setter
    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
