package auto_atendimento;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Lista implements List<Produto>{
	public int tamanho = 0;
	private Produto elementos[];
	private int quantidade[] = new int[100];
	
	public Lista() {
		this.elementos = new Produto[100];
	}

	@Override
	public boolean add(Produto produto) {
		// TODO Auto-generated method stub
		
		this.elementos[this.tamanho] = produto;	
		this.tamanho++;
		
		return true;
	}

	@Override
	public void add(int qtd, Produto produto) {
		// TODO Auto-generated method stub
		this.elementos[this.tamanho] = produto;
		this.quantidade[this.tamanho] = qtd;	
		this.tamanho++;
	}

	@Override
	public boolean addAll(Collection<? extends Produto> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends Produto> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		this.elementos = new Produto[100];
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Produto get(int index) {
		// TODO Auto-generated method stub
		return this.elementos[index];
	}
	
	public int getQuantidade(int index) {
		// TODO Auto-generated method stub
		return this.quantidade[index];
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(this.tamanho == 0){
			return true;
		} else{
			return false;
		}
	}

	@Override
	public Iterator<Produto> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<Produto> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<Produto> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		boolean achou = false;
		
		Produto auxProduto[] = new Produto[100];
		int auxQuantidade[] = new int[100];
		int index = 0;
		
		//POPULANDO OS ARRAYS
		for(int i = 0; i < this.tamanho; i++){
			if(o.equals(this.elementos[i])){
				this.tamanho -= 1;
				achou = true;
				
				for(int j = i ; j<this.tamanho ; j++){
					this.elementos[j] = this.elementos[j+1];
					this.quantidade[j] = this.quantidade[j+1];
				}    
			} 
		}
		
		return achou;
	}

	@Override
	public Produto remove(int index) {	
		return null;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Produto set(int index, Produto element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.tamanho;
	}

	@Override
	public List<Produto> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

}
