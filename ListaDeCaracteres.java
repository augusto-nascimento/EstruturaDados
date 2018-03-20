
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Augusto Rocha
 */
public class ListaDeCaracteres {
    private String[] dados;
    private int tamanho;
    public ListaDeCaracteres (int capMax) {
        dados = new String[capMax];
        tamanho = 0;
    }
    /**
     * Adiciona elemento ao inicio da lista
     * @param � o novo elemento
     */
    public void adicionaInicio(String e){
        if (cheia()) {
            JOptionPane.showMessageDialog(null, "ERRO:\n A lista está cheia!\n");
        } else {
            for (int i = tamanho;i>0;i=i-1) {
                dados[i] = dados[i-1];
            }
            dados[0]=e;
            tamanho++;
        }
    }
    public void adicionaFinal(String e){
        if (cheia()) {
            JOptionPane.showMessageDialog(null, "ERRO:\n A lista está cheia!");
        } else {
            dados[tamanho]=e;
            tamanho++;
        }
    }    
    public String removeInicio(){
        if (vazia()) {
            JOptionPane.showMessageDialog(null, "ERRO: Lista vazia");
            return "";
        } else {
            String e = dados[0];
            for (int i = 0;i<tamanho-1;i++) {
                dados[i] = dados[i+1];
            }
            tamanho--;
            dados[tamanho] = "";
            return e;
        }
    }
    public void removeFinal(){
        if (vazia()) {
            JOptionPane.showMessageDialog(null, "ERRO: Lista vazia");
        } else {
            tamanho--;
            dados[tamanho] = "";
        }
    }
    public String obtemPrimeiro(){
        if (vazia()) {
            JOptionPane.showMessageDialog(null, "ERRO: Lista vazia");
            return "";
        }
        return dados[0];
    }
    public String obtemUltimo(){
        if (vazia()) {
            JOptionPane.showMessageDialog(null, "ERRO: Lista vazia");
            return "";
        }
        return dados[tamanho-1];
    }
    public void removePosicao(int n){
        String e;
        if (vazia()){
            JOptionPane.showMessageDialog(null, "ERRO: Lista vazia");
        } else if (tamanho < n){
            JOptionPane.showMessageDialog(null, "ERRO: Não existem elementos "
                    + "na posição " + n);
        } else {
            for (int i = 0;i<tamanho;i++) {
                if (i == n - 1 ) {
                    e = dados[i];
                }
                if (i > n -1){
                    dados[i-1] = dados[i];
                }
            }
            tamanho--;
            dados[tamanho] = "";
        }
    }
    public boolean cheia() {
        return tamanho == dados.length;
    }
    public boolean vazia() {
        return tamanho == 0;
    }
    public String toString() {
        if (vazia()) {
            return "A lista está vazia";
        }
        String s = "";
        for (int i = 0; i < tamanho;i++) {
            s = s + "|" + dados[i];
        }
        return s;
    }
}
