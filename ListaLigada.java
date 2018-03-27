/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author augusto
 */
public class ListaLigada {
    private No inicio;
    public void adicionaInicio(int novoElemento) {
        No novo = new No(novoElemento);
        novo.prox = inicio;
        inicio = novo;
    }
    public void adicionaFinal(int novoElemento) {
        No novo = new No(novoElemento);
        if (inicio==null){
            novo.prox = inicio;
            inicio = novo;
        }
        else {
            No aux = inicio;
            while (aux.prox!=null) {
                aux = aux.prox;
            }
            aux.prox = novo;
        }
    }    
    public int removeInicio(){
        int r = -1;
        if (inicio==null) {
            System.out.println("Lista Vazia");
        }
        else {
            r = inicio.dado;
            inicio = inicio.prox;
        }
        return r;
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
