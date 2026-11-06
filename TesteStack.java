
public class TesteStack {

	public TesteStack() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Stack<Integer> pilha = new StackDeque<>();
		System.out.println("Vazia? "+ pilha.isEmpty());

		pilha.push(10);
		pilha.push(20);
		pilha.push(30);

		System.out.println("Pilha: "+pilha);
		System.out.println("Tamanho: "+pilha.size());
		System.out.println("Topo: "+pilha.top());
		
		System.out.println("Pop: "+pilha.pop());
		System.out.println("Pop: "+pilha.pop());
		System.out.println("Pilha agora: "+pilha);
		
		for(int i=0;i<1000;i++) {
			pilha.push(i);
		}
		System.out.println("Depois de 1000 pushes, tamanho: "+pilha.size());
		System.out.println("Vazia? "+pilha.isEmpty());
		// TODO Auto-generated method stub

	}

}
