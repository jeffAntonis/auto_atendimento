package auto_atendimento;

public class CarrinhoCompras extends Lista{
	private double total = 0;
	
	public void adicionar(Produto produto, int qtd){
		
		add(qtd, produto);		
		this.total += produto.getValor() * qtd;
		System.out.println("Produto adicionado ao carrinho");
	}
	
	public double getValorToal(){
		return this.total;
	}

}
