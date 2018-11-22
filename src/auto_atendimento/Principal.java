package auto_atendimento;

import java.util.Scanner;

public class Principal {
	public static Lista lista = new Lista();
	public static Lista carrinho = new Lista();
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int opcao = 0;
		
		do {
			
			System.out.println("Escolha uma opção! \n");
			
			System.out.println("1.Cadastrar produto");
			System.out.println("2.Listar produtos");
			System.out.println("3.Adicionar produto ao carrinho com sua quantidade");
			System.out.println("4.Visualizar o carrinho");
			System.out.println("5.Excluir produto do carrinho");
			System.out.println("6.Finalizar compra");
			
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
				default:
					System.out.println("Opção inválida!");
					break;
			}
			
		} while(opcao != 10);

		System.exit(1);
		
	}
	
	private static void visualizarCarrinho() {
		
		
		
	}

	private static void adicionarProdutoCarrinho() {
		System.out.println("Digite o código do produto e em seguida a quantidade");
		int codigoProduto = Integer.parseInt(scanner.next());
		int qtdProduto = Integer.parseInt(scanner.next());
		
		carrinho.add(qtdProduto, lista.get(codigoProduto--));
	}

	public static void cadastrarProduto() {
		
		System.out.println("Digite a senha:");
		
		String senha = scanner.next().toString();
		
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
	
	public static void limparTela() {
		for(int i = 0; i < 8; ++i) {  
		   System.out.println();
		}
	}

}
