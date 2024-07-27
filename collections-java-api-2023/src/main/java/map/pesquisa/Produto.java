package main.java.map.pesquisa;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;
    private long cod;

    public Produto(String nome, double preco, int quantidade, long cod) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public long getCod() {
        return cod;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                ", cod=" + cod +
                '}';
    }
}
