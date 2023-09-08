package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Venda {
    private LocalDate dataDeVenda;
    private String produtoVendido;
    private int qtdVendida;
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    public Venda(String dataDeVenda, String produtoVendido, int qtdVendida) {
        setDataDeVenda(dataDeVenda);
        this.produtoVendido = produtoVendido;
        this.qtdVendida = qtdVendida;
    }

    public LocalDate getDataDeVenda() {
        return dataDeVenda;
    }

    public void setDataDeVenda(String dataDeVenda) {
        this.dataDeVenda = LocalDate.parse(dataDeVenda, dtf);
    }

    public String getProdutoVendido() {
        return produtoVendido;
    }

    public void setProdutoVendido(String produtoVendido) {
        this.produtoVendido = produtoVendido;
    }

    public int getQtdVendida() {
        return qtdVendida;
    }

    public void setQtdVendida(int qtdVendida) {
        this.qtdVendida = qtdVendida;
    }

    @Override
    public String toString() {
        return String.format("| Produto Vendido: %s | Data da Venda: %s | Quantidade Vendida: %d |", getProdutoVendido(), getDataDeVenda().format(dtf), getQtdVendida());
    }
}