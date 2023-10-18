package atividade03;

public class PilhaComLista implements Pilha_IF{
	public ListaEncadeada pilha = new ListaEncadeada();
    int posPilha;
    
    
	@Override
	public void push(Integer element) throws Exception {
		 if(pilha.size()<=10) {
	            pilha.insert(element);
	        }	
	}

	@Override
	public int pop() throws Exception {
		int pilhatopvalor = pilha.data;
        if(isEmpty()) {
            return 0;
        }
        pilha.remove(pilhatopvalor);
        return pilhatopvalor;
	}

	@Override
	public int top() throws Exception {
		 if(isEmpty()) {
             return 0;
         }
         return pilha.data;
	}

	@Override
	public boolean isEmpty() {
		 return pilha.isEmpty();
	}

	@Override
	public boolean isFull() {
		 if(pilha.size() == 10) {
             return true;
         }
         return false;
	}

}
