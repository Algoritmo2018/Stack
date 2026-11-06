import java.util.ArrayDeque;
import  java.util.Deque;
import java.util.EmptyStackException;

public class StackDeque<E> implements Stack<E> {
	private final Deque<E> deque;

	public StackDeque() {
		// TODO Auto-generated constructor stub
		this.deque=new ArrayDeque<>();
	}
	@Override
	public void push(E element) {
		deque.push(element);
	}
	@Override
	public E pop() {
		if(isEmpty()) {
			throw new  EmptyStackException();
		}
		return deque.pop();
	}
	@Override
	public E top() {
		if(isEmpty()) {
			throw new  EmptyStackException();
		}
		return deque.peek();
	}
	@Override
	public boolean isEmpty() { 
		return deque.isEmpty();
	}
	@Override
	public int size() { 
		return deque.size();
	}
	@Override
	public String toString() { 
		return deque.toString();
	}
 

}
