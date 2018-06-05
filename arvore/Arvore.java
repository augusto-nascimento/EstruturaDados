package arvore;

public class Arvore {
	public No raiz;
	public Arvore () {
		raiz = null;
	}
	public void adicionaElemento(int e) {
		No novo = new No(e);
		if (raiz == null) {
			raiz = novo;
		} else {
			novoElemento(novo, raiz);
		}
	}
	public void novoElemento(No novo, No aux) {
		if (novo.elemento <= aux.elemento) {
			if (aux.esquerda == null) {
				aux.esquerda = novo;
			} else {
				novoElemento(novo, aux.esquerda);
			}
		} else {
			if (aux.direita == null) {
				aux.direita = novo;
			}else {
				novoElemento(novo, aux.direita);
			}
		}
	}
	public void emOrdem(No n) {
		if (n!=null) {
			System.out.println(n.elemento);
			emOrdem(n.esquerda);
			emOrdem(n.direita);
		}
	}
	public void posOrdem(No n) {
		if (n!=null) {
			posOrdem(n.esquerda);
			posOrdem(n.direita);
			System.out.println(n.elemento);
		}
	}	
}
