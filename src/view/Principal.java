package view;

import model.Pilha;

public class Principal{

	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		pilha.push(1);
		pilha.push(2);
		pilha.push(5);
		pilha.push(8);
		
//		try {
//			int valor = pilha.pop();
//			System.out.println(valor);
//			valor = pilha.pop();
//			System.out.println(valor);
//			
//			while (!pilha.isEmpty()) {
//				valor = pilha.pop();
//				System.out.println(valor);
//			}
//			pilha.pop();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		try {
			int a = pilha.pop();
			int b = pilha.pop();
			int res = a + b;
			pilha.push(res);
			int topo = pilha.top();
			System.out.println("Topo ==> " + topo);
			int tamanho = pilha.size();
			System.out.println("Tamanho ==> " + tamanho);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}

