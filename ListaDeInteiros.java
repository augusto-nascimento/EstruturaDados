
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laboratorios
 */
public class ListaDeInteiros {
    private int[] dados;
    private int tamanho;
    public ListaDeInteiros (int capMax) {
        dados = new int[capMax];
        tamanho = 0;
    }
    /**
     * Adiciona elemento ao inicio da lista
     * @param e é o novo elemento
     */
    public void adicionaInicio(int e){
        if (tamanho == dados.length) {
            System.out.printf("ERRO: Lista Cheia!");
        } else {
            for (int i = tamanho;i>0;i=i-1) {
                dados[i] = dados[i-1];
            }
            dados[0]=e;
            tamanho++;
        }
    }
    public void removeInicio(){
        if (tamanho==0) {
            System.out.println("ERRO: Lista vazia");
        } else {
            for (int i = 0;i<tamanho;i++) {
                dados[i] = dados[i+1];
            }
            dados[tamanho] = 0;
            tamanho--;
        }
    }
    public String toString() {
        String s = "";
        for (int i = 0; i < tamanho;i++) {
            s = s + " " + dados[i];
        }
        return s;
    }
}
