package atividade03;

public interface Fila_IF {
	public void enqueue(Integer element) throws Exception;
	public int dequeue() throws Exception;
	public int head() throws Exception;
	public boolean isEmpty();
	public boolean isFull();
}
