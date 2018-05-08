/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author augusto
 */
public class ListaDuplamenteLigada {
    private DuploNo inicio;
    private DuploNo fim;
    public void adicionaInicio(int novoElemento) {
        DuploNo novo = new DuploNo(novoElemento);
        novo.prox = inicio;
        inicio = novo;
        if (inicio.prox==null){
        	fim = inicio;
        } else {
        	inicio.prox.ant = inicio;
        }
    }
    public void removeInicio() {
    	int r = -1;
    	if (inicio==null) {
    		System.out.println("Lista vazia");
    	} else {
    		r = fim.dado;
    		inicio = inicio.prox;
    		if (inicio!=null){
    			inicio.ant = null;
//        		if (inicio.prox!=null) {
//        			inicio.prox.ant = inicio;
//        		}    			
    		} else {
    			fim = inicio;
    		}
    	}
    	return r;
    }
    public void adicionaFinal(int novoElemento) {
        DuploNo novo = new DuploNo(novoElemento);
        novo.ant = fim;
        fim = novo;
        if (fim.ant==null){
        	inicio = fim;
        } else {
        	fim.ant.prox = fim;
        }
    }
    public int removeFinal() {
    	int r = -1;
    	if (fim==null) {
    		System.out.println("Lista vazia");
    	} else {
    		r = fim.dado;
    		fim = fim.ant;
    		if (fim!=null) {
    			fim.prox = null;
//        		if (fim.ant!=null){
//        			fim.ant.prox = fim;
//        		}    			
    		} else {
    			inicio=fim;
    		}
    		
    	}
    	return r;
    }    
    public String toString(){
        DuploNo aux = inicio;
        String s = "";
        while (aux!=null) {
            s = s + " " + aux.dado;
            aux = aux.prox;
        }
        return s;
    }
}
