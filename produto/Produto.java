package construtores.produto;

public class Produto {
    private String nome;
    private Double preco;
    private int quantidade;

    public Produto(){

    }


    public void imprimirDados(){
        System.out.println(nome);
        System.out.println(preco);
        System.out.println(quantidade);

    }




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
