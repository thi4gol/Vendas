package model;

public class Produto implements Comparable<Produto>{
    private int codigo;
    private String nome;
    private double valor;
    private int qtdEstoque;
    public int setQtdEstoque;

    public Produto(int codigo, String nome, double valor, int qtdEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.qtdEstoque = qtdEstoque;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    @Override
    public String toString() {
        return String.format("| Código do produto: %d | Nome Do Produto: %s | Valor do produto: %.2f | Quantidade de Estoque: %d |", getCodigo(), getNome(), getValor(), getQtdEstoque());
    }

    public int compareTo(Produto o) {
        return getNome().compareToIgnoreCase(o.getNome());
    }
}