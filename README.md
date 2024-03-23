# Projeto de Vendas em Java 17

Este é um projeto em Java 17 desenvolvido para gerenciar vendas de produtos. Ele oferece funcionalidades como inclusão de produtos, consulta de produtos, listagem de produtos, vendas por período e realização de vendas.

## Estrutura do Projeto

O projeto está estruturado da seguinte forma:

- **aplicacao**: Contém a classe principal `App` que inicia a aplicação.
- **model**: Contém as classes `Produto` e `Venda`, que representam os objetos do domínio.
- **repository**: Contém a classe `Repositorio` responsável pelo armazenamento e manipulação dos dados.
- **src**: Contém a classe `Menu` que gerencia a interface com o usuário.

## Classes Principais

### `Produto`

Representa um produto disponível para venda. Possui os seguintes atributos:

- `codigo`: Código do produto.
- `nome`: Nome do produto.
- `valor`: Valor do produto.
- `qtdEstoque`: Quantidade em estoque do produto.

### `Venda`

Representa uma transação de venda. Possui os seguintes atributos:

- `dataDeVenda`: Data da venda.
- `produtoVendido`: Nome do produto vendido.
- `qtdVendida`: Quantidade vendida.

### `Repositorio`

Gerencia o armazenamento e manipulação dos dados de produtos e vendas. Possui métodos para inclusão de produtos, consulta de produtos, listagem de produtos, vendas por período e realização de vendas.

### `Menu`

Gerencia a interação com o usuário, exibindo um menu de opções e chamando os métodos correspondentes de acordo com a escolha do usuário.

## Executando o Projeto

Para executar o projeto:

1. Certifique-se de ter o Java 17 instalado.
2. Compile os arquivos do projeto.
3. Execute o arquivo `App.class`.

## Uso

Ao iniciar o programa, você será apresentado com um menu contendo diversas opções para gerenciar produtos e vendas. Escolha uma opção digitando o número correspondente e siga as instruções exibidas na tela.

## Contribuindo

Se desejar contribuir com este projeto, siga estas etapas:

1. Faça um fork do projeto.
2. Implemente suas alterações.
3. Envie um pull request.

## Autor

Este projeto foi desenvolvido por Thiago Siqueira.

## Licença

Este projeto está licenciado sob a [Licença MIT](https://opensource.org/licenses/MIT).
