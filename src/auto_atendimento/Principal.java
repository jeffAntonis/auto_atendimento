package auto_atendimento;

import java.util.Scanner;

public class Principal {
	public static Lista lista = new Lista();
	public static CarrinhoCompras carrinho = new CarrinhoCompras();
	public static Scanner scanner = new Scanner(System.in);
	public static PedidosRealizados pedidosRealizados = new PedidosRealizados();
	
	//FUNÇÃO MAIN
	public static void main(String[] args) {

		int opcao = 0;
		
		//CADASTRO AUTOMÁTICO PRA FACILITAR O TRABAHLO DO PROFESSOR
		lista.add(new Produto("Skate", 100000.00));
		lista.add(new Produto("BMX", 1000.00));
		lista.add(new Produto("Carroça", 1000.00));
		lista.add(new Produto("CarroPoular", 100.00));
		lista.add(new Produto("Ferrari", 10.00));
		
		
		do {
			
			System.out.println("Escolha uma opção! \n");
			
			System.out.println("1.Cadastrar produto");
			System.out.println("2.Listar produtos");
			System.out.println("3.Adicionar produto ao carrinho com sua quantidade");
			System.out.println("4.Visualizar o carrinho");
			System.out.println("5.Excluir produto do carrinho");
			System.out.println("6.Finalizar compra");
			System.out.println("7.Visualizar pedido");
			System.out.println("10.Sair");
			
			opcao = Integer.parseInt(scanner.next());
			
			//VERIFICAÇÃO
			switch (opcao) {
				case 1:
					cadastrarProduto();
					break;
				case 2:
					listarProdutos();
					break;
				case 3:
					adicionarProdutoCarrinho();
					break;
				case 4:
					visualizarCarrinho();
					break;
				case 5:
					excluirProdutoCarrinho();
					break;
				case 6:
					if(carrinho.tamanho > 0) {
						System.out.println("Finalizando pedido...");
						System.out.println("Pedido Finalizado");
						int codigoPedido = pedidosRealizados.salvarPedido(carrinho);
						System.out.println("O código do seu peido é: " + codigoPedido);
						carrinho.clear();
					} else {
						System.out.println("Não há produtos no carinho.");
					}
					break;
					
					
				case 7:
					System.out.println("Qual o numero do seu pedido?");
					pedidosRealizados.listarPedido(Integer.parseInt(scanner.next()));
					break;
					
				case 10:
					System.out.println("Saindo.....");
					break;
				default:
					System.out.println("Opção inválida!");
					break;
			}
			
		} while(opcao != 10);

		System.exit(1);
		
	}

	//EXCLUIR PRODUTO DO CARRINHO
	private static void excluirProdutoCarrinho() {
		System.out.println("Insira o código do produto que deseja excluir");
		int codigoProduto = Integer.parseInt(scanner.next());
		
		//VERIFICAÇÃO
		if(carrinho.remove(carrinho.get(codigoProduto-1))){
			System.out.println("Excluído com sucesso!");
		} else{
			System.out.println("Erro ao excluí do carrinho!");
		}
	}
	
	//VISUALIZAR CARRINHO DE COMPRAS
	private static void visualizarCarrinho() {
		
		limparTela();
		
		String formato = " %d        | %-15s                 |  %d             %n";
		System.out.format("----------+--------------CARRINHO-----------+------------------%n");
		System.out.format("----------+---------------------------------+------------------%n");
		System.out.format("  Código  | Produto                         |  Qtd             %n");
		System.out.format("----------+---------------------------------+------------------%n");
		
		//PERCORRENDO O ARRAY	
		for(int i=0 ; i<carrinho.tamanho ; i++) {
			System.out.format(formato, i+1, carrinho.get(i).getNome(), carrinho.getQuantidade(i));
		}
		
		if(carrinho.tamanho == 0){
			System.out.format("%-15s", "              NENHUM REGISTRO ENCONTRADO                   \n");
		} else{
			System.out.format("----------+---------------------------------+------------------%n");
			System.out.format(" VALOR-TOTAL %f \n", carrinho.getValorToal());
		}
			
		
		System.out.format("----------+---------------------------------+------------------%n");
	}
	
	//ADICIONAR PRODUTO AO CARRINHO
	private static void adicionarProdutoCarrinho() {
		System.out.println("Digite o código do produto e em seguida a quantidade");
		int codigoProduto = Integer.parseInt(scanner.next());
		int qtdProduto = Integer.parseInt(scanner.next());
				
		carrinho.adicionar(lista.get(codigoProduto-1), qtdProduto);
	}
	
	//CADASTRAR PRODUTO
	public static void cadastrarProduto() {
		
		System.out.println("Digite a senha:");		
		String senha = scanner.next().toString();
		
		//VERIFICA SE O USUARIO INSERIU A SENHA DE ADMINISTRADOR
		if(Integer.parseInt(senha) == 123) {
			System.out.println("Insira o nome do produto e em seguida o valor");		
			String nome = scanner.next().toString();
			
			double valor = Double.parseDouble(scanner.next());
			
			lista.add(new Produto(nome, valor));
			
			limparTela();
		} else {
			System.out.println("Acesso negado!");
		}
	}
	
	//LISTAR PRODUTOS CADASTRADOS
	public static void listarProdutos() {
		
		limparTela();
		
		String formato = " %d        | %-15s                 |  %.2f            %n";
		
		System.out.format("----------+---------------------------------+------------------%n");
		System.out.format("  Código  | Produto                         |  Valor           %n");
		System.out.format("----------+---------------------------------+------------------%n");
		
		//PERCORRENDO O ARRAY	
		for(int i=0 ; i<lista.tamanho ; i++) {			
			System.out.format(formato, i+1, lista.get(i).getNome(), lista.get(i).getValor());
		}
		
		System.out.format("----------+---------------------------------+------------------%n");
	}
	
	//LIMPAR TELA
	public static void limparTela() {
		for (int i = 0; i < 25; i++) {
			System.out.println("");	
		}
	}
}
