/*
implemente uma classe lista com alocação dinâmica de memória que possibilite 
apenas inserir elementos em ordem crescente. O método remove deve receber por 
parâmetro o elemento que será excluído e retornar True se o elemento foi 
encontrado e excluido, caso o elemento não exista na lista, retorne false. O 
método construtor inicializa a lista e o metodo toString gera uma String com os
elementos da lista.
 */

/**
 *
 * @author augusto
 */
public class ListaLigadaCrescente {
    private No inicio;
    public void adicionaElemento(int novoElemento) {
        No novo = new No(novoElemento);
        if (inicio==null) {
            novo.prox = null;
            inicio = novo;
        }
        else {
            if (inicio.dado > novo.dado) {
                novo.prox = inicio;
                inicio = novo;
            }
            else {
                No aux = inicio;
                while (aux.prox!=null) {
                    if (aux.prox.dado > novo.dado) {
                        break;
                    }
                    aux = aux.prox;
                }
                if ( aux.prox != null) {
                    novo.prox = aux.prox;
                }
                aux.prox = novo;
                
            }
        }
    }

    /**
     *
     * @return 
     */
    public boolean removeElemento(int deleteElemento){
        if (inicio==null) {
            System.out.println("Lista Vazia");
        }
        else {
            No aux1 = inicio;
            if (aux1.prox == null) {
                if (aux1.dado == deleteElemento) {
                    inicio = null;
                    return true;
                }
            }
            else {
                No aux2 = aux1.prox;
                while (aux2.prox!=null) {
                    if (aux2.dado == deleteElemento) {
                        if (aux == inicio) {
                            inicio = aux.prox;
                        }
                        else {
                            ant = aux.prox;
                        }
                        return true;
                    }
                    ant = aux;
                    aux = aux.prox;
                }
                
            }
            return false;
        }
        return false;
    }
    public String toString(){
        No aux = inicio;
        String s = "";
        while (aux!=null) {
            s = s + " " + aux.dado;
            aux = aux.prox;
        }
        return s;
    }
}
