package arvore;

public class Menu {
	public static void main(String args[]) {
		Arvore arvore = new Arvore();
		arvore.adicionaElemento(10);
		arvore.adicionaElemento(15);
		arvore.adicionaElemento(7);
		arvore.adicionaElemento(9);
		arvore.adicionaElemento(11);
		System.out.println("em ordem");
		arvore.emOrdem(arvore.raiz);
	}
}
