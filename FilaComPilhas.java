package atividade03;

public class FilaComPilhas implements Fila_IF{

	 PilhaComLista p1 = new PilhaComLista();
	 PilhaComLista p2 = new PilhaComLista();
	 @Override
	    public void enqueue(Integer element) throws Exception {
	        while(!p1.isEmpty()) {
	            p2.push(p1.pop());

	        }
	        p2.push(element);
	        while(!p2.isEmpty()) {
	            p1.push(p2.pop());
	        }

	    }

	 @Override
	    public int dequeue() throws Exception{
	        return p1.pop();
	    }
	 @Override
	    public int head() throws Exception{
	        if(isEmpty()) {
	            return 0;
	        }
	        return p1.top();
	    }

	 @Override
	    public boolean isEmpty() {
	        return p1.isEmpty();
	    }
	 @Override
	    public boolean isFull() {
	        return p1.isFull();
	    }
	}
