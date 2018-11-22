package auto_atendimento;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class PedidosRealizados implements List<CarrinhoCompras> {
	
	//Variáveis de armazenamento de pedido 
	private int quantidadePedidos = 0;
	private CarrinhoCompras arrayPedidos[] = new CarrinhoCompras[100];
	
	
	
	public PedidosRealizados() {
		// TODO Auto-generated constructor stub
	}
	
	public void mostrar() {
		
		for(int i=0 ; i<this.quantidadePedidos ; i++) {
			System.out.println(this.arrayPedidos[i]);
		}
	}
	
	public int salvarPedido(CarrinhoCompras carrinho) {
		
		//arrayPedidos[arrayPedidos.length +1] = carrinho;
		
		add(carrinho);
		
		return this.quantidadePedidos;		
	}
	
	public void listarPedido(int nrPedido) {
		
		String formato = " %d        | %-15s                 |  %d             %n";
		System.out.format("----------+---------------PEDIDOS-----------+------------------%n");
		System.out.format("----------+---------------------------------+------------------%n");
		System.out.format("  Código  | Produto                         |  Qtd             %n");
		System.out.format("----------+---------------------------------+------------------%n");
		
		for (int i = 0; i < arrayPedidos[nrPedido].tamanho; i++) {
			System.out.format("-------Pedido-"+i+"----------------------------------------%n");
			System.out.format(formato, i+1, arrayPedidos[nrPedido].get(i).getNome(), arrayPedidos[nrPedido].getQuantidade(i));
		}
		System.out.format("----------+---------------------------------+------------------%n");
		
	}

	@Override
	public boolean add(CarrinhoCompras carrinho) {
		// TODO Auto-generated method stub
		this.quantidadePedidos+=1;
		this.arrayPedidos[this.quantidadePedidos] = carrinho;
		return false;
	}

	@Override
	public void add(int arg0, CarrinhoCompras arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean addAll(Collection<? extends CarrinhoCompras> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int arg0, Collection<? extends CarrinhoCompras> arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public CarrinhoCompras get(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<CarrinhoCompras> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int lastIndexOf(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<CarrinhoCompras> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<CarrinhoCompras> listIterator(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public CarrinhoCompras remove(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public CarrinhoCompras set(int arg0, CarrinhoCompras arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<CarrinhoCompras> subList(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	
}