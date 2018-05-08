package espalhamento;


public class ListaDeContatos {
	private No inicio,fim;
	public ListaDeContatos(){
		inicio = null;
		fim = null;
	}
	public boolean vazia(){
		return inicio==null;
	}
	public void adicionaItem(Contato c){
		if (vazia()) { 
			inicio = new No(c);
			fim = inicio;
		} else {
			No aux1 = inicio, aux2=null;
			while (aux1!=null && aux1.contato.getNome().compareTo(c.getNome()) <0) {
				aux2=aux1;
			}
			No novo = new No(c);
			if (aux2 != null) {
				if (aux1 != null) {
					aux1.ant = novo;
				}
				aux2.prox=novo;
			} else {
				inicio = novo;
				fim = novo;
			}
		}
	}
}
