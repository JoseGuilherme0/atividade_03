package atividade03;
import java.util.Arrays;

public class ListaEncadeada implements ListaEncadeada_IF {
	
	protected Integer data;
	protected ListaEncadeada next;
	
	
	public ListaEncadeada(Integer data2) {
		this.data=data2;
		this.next=null;
	}
	public ListaEncadeada() {
		this.data=data;
		this.next=null;
	}
	public Integer getData() {
		return data;
	}
	public void setData(Integer data) {
		this.data = data;
	}
	public ListaEncadeada getNext() {
		return next;
	}
	public void setNext(ListaEncadeada next) {
		this.next = next;
	}

	@Override
	public boolean isEmpty() {
		if (data == null) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public Integer size() {
		if(isEmpty()) {
			return 0;
		}else {
			return 1 + next.size();
		}
		
	}

	@Override
	public Integer search(Integer element) throws Exception {
		if(isEmpty()) {
			return 0;
		}else {
			if(data.equals(element)) {
				return data;
			}else {
				return next.search(element);
			}
		}
	}

	@Override
	public void insert(Integer element) {
		if(isEmpty()) {
			data = element;
			next = new ListaEncadeada();
		}else {
			ListaEncadeada newNode = new ListaEncadeada();
            newNode.setData(data);
            newNode.setNext(next);
            data = element;
            next = newNode;
		}
		
	}

	@Override
	public void remove(Integer element) {
		if(isEmpty()) {
			
		}else {
			if (data.equals(element)) {
				data = next.data;
				next = next.next;
			}else {
				next.remove(element);
			}
		}
		
	}

	@Override
	public Integer[] toArray() {
		 Integer[] result = new Integer[size()];
	     toArrayAux(result, this, 0);
	     return result;
	}

	private int toArrayAux(Integer[] result, ListaEncadeada listaEncadeada, int index) {
	     if (!listaEncadeada.isEmpty()) {
	          result[index] = listaEncadeada.data;
	          index++;
	          toArrayAux(result, listaEncadeada.next, index);
	       }
        return index;	 
        }

}
