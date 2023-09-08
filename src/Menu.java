package src;

import java.util.Scanner;

import model.Produto;
import model.Venda;
import repository.*;

public class Menu {
    Scanner scan = new Scanner(System.in);
    private Repositorio repository = new Repositorio();
    private int opcao;

    public void loopPrincipal() {
        do {
            mostrarMenu();
            try {
                switch (opcao) {
                    case 1:
                        incluirProduto();
                        break;
                
                    case 2:
                        ConsultarProduto();
                        break;

                    case 3:
                        mostarProdutos();
                        break;
                    
                    case 4:
                        mostrarVendas();
                        break; 

                    case 5:
                        realizarVenda();
                        break;

                    case 0:
                        break;

                    default:
                        limpa();
                        System.out.println("Opção inválida!");
                        voltarMenu();
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                voltarMenu();
            }
        } while (opcao != 0);
    }

    public void mostrarMenu() {
        limpa();
        System.out.println("*** Menu de Vendas/Produtos ***");
        System.out.println("1- Incluir produto");
        System.out.println("2- Consultar produto");
        System.out.println("3- Listagem de produtos");
        System.out.println("4- Vendas por período - detalhado");
        System.out.println("5- Realizar venda");
        System.out.println("0- Sair");
        System.out.print("Opção: ");
        opcao = scan.nextInt(); scan.nextLine();
    }

    public void incluirProduto() {
        limpa();
        System.out.println("*** Incluir Produto ***");
        System.out.print("Digite o código do produto (Apenas números): ");
        int codigo = scan.nextInt(); scan.nextLine();
        System.out.print("Digite o nome do Produto: ");
        String nomeProduto = scan.nextLine();
        System.out.print("Digite o valor do produto: ");
        double valor = scan.nextDouble();
        System.out.print("Digite a quantidade do produto em estoque: ");
        int qtdEstoque = scan.nextInt(); scan.nextLine();
        repository.incluirProduto(new Produto(codigo, nomeProduto, valor, qtdEstoque));
        System.out.println("Produto registrado com sucesso!");
        voltarMenu();
    }

    public void ConsultarProduto() {
        limpa();
        System.out.println("*** Consultar Produto ***");
        System.out.print("Digite o nome do produto que deseja consultar: ");
        String consultarProduto = scan.nextLine();
        Produto produtoConsultado = repository.consultarProduto(consultarProduto);
        limpa();
        System.out.println("*** Produto Consultado ***");
        System.out.println(produtoConsultado);
        voltarMenu();
    }

    public void mostarProdutos() {
        limpa();
        System.out.println("*** Todos os Produtos ***");
        repository.mostarProdutos();
        voltarMenu();
    }

    public void mostrarVendas() {
        limpa();
        System.out.println("*** Vendas por período - detalhado ***");
        limpa(); 
        repository.mostarVendas();
        voltarMenu();
    }

    public void realizarVenda() {
        limpa();
        System.out.println("*** Realizar Venda ***");
        System.out.println("Digite o nome do produto que deseja vender: ");
        String produtoVendido = scan.nextLine();
        System.out.println("Digite a data: (dd/mm/aaaa)");
        String dataDeVenda = scan.nextLine();
        System.out.println("Digite a quantidade de venda: ");
        int qtdVendida = scan.nextInt();
        repository.realizarVenda(new Venda(dataDeVenda, produtoVendido, qtdVendida));
        System.out.println("Venda realizada com sucesso!");
        voltarMenu();
    }

    public void limpa(){
        System.out.print("Everything on the console will cleared");
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void voltarMenu(){
        System.out.println("Digite [ENTER] para voltar ao menu");
        scan.nextLine();
        scan.nextLine();
    }
}