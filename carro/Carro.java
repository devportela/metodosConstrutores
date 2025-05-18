package construtores.carro;

public class Carro {
    //atributos
    private String modelo;
    private int ano;
    private String cor;
    //construtor





    public Carro(){

    }

    public Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }


    //metodo especifico
    public void mostrarDados(){
        System.out.println(modelo);
        System.out.println(ano);
        System.out.println(cor);
    }


    //getter e setters


    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
