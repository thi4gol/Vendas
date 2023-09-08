package repository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.InputMismatchException;
import java.util.List;
import java.util.stream.Collectors;

import model.Produto;
import model.Venda;

public class Repositorio {
    List<Produto> produtos = new ArrayList<>();
    List<Venda> vendas = new ArrayList<>();
    List<Venda> produtosFiltro = new ArrayList<>();

    public void incluirProduto(Produto produto) {
        if (produtos.contains(produto)) {
            throw new InputMismatchException("Já existe um produto cadastrado com esse produto.");
        }
        produtos.add(produto);
    }

    public Produto consultarProduto(String nome) {
        verificarProdutosIncluidos();
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                return produto;
            }
        }
        throw new NullPointerException("Não existe um produto com esse nome!"); 
    }

    public void mostarProdutos() {
        produtos.stream()
        .sorted(Comparator.comparing(Produto::getCodigo))
        .forEach(System.out::println);
        relatorioProdutos(produtos);
    }
    public void relatorioProdutos(List<Produto> produtosRelatorio) {
        DoubleSummaryStatistics valor = produtosRelatorio.stream()
        .collect(Collectors.summarizingDouble((Produto::getValor)));
        System.out.printf("| Maior valor: %.2f    | Valor médio: %.2f   | Menor valor: %.2f |\n", valor.getMax(), valor.getAverage(), valor.getMin());
    }

    public void mostarVendas() {
        verificarVendasIncluidas();
        vendas.forEach(System.out::println);
        relatorioVendas(produtos);
    }

    public void relatorioVendas(List<Produto> vendasRelatorio) {
        DoubleSummaryStatistics valor = vendasRelatorio.stream()
        .collect(Collectors.summarizingDouble((Produto::getValor)));
        System.out.printf("| Valor médio: %.2f ", valor.getAverage());
    }

    public Produto realizarVenda(Venda venda) {
        verificarProdutosIncluidos();
        for (Produto produto : produtos) {
            if (produto.getNome().equals(vendas)) {
                vendas.add(venda);
                produto.setQtdEstoque(produto.getQtdEstoque() - venda.getQtdVendida());
                return produto;
            }
        };
        throw new NullPointerException("Não existe um produto com esse nome: ");
    } 

    public void verificarProdutosIncluidos() {
        if (produtos.isEmpty()) {
            throw new NullPointerException("Não contém produtos cadastrados!");
        }
    }

    public void verificarVendasIncluidas() {
        if (produtos.isEmpty()) {
            throw new NullPointerException("Não contém vendas cadastrados!");
        }
    }
}