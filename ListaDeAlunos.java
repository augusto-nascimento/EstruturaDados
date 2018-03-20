
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laboratorios
 */
public class ListaDeAlunos {
    private Aluno[] dados;
    private int tamanho;
    public ListaDeAlunos (int capMax) {
        dados = new Aluno[capMax];
        tamanho = 0;
    }
    /**
     * Adiciona elemento ao inicio da lista
     * @param e é o novo elemento
     */
    public void adicionaInicio(Aluno aluno){
        if (cheia()) {
            JOptionPane.showMessageDialog(null, "ERRO:\n A lista está cheia!\n");
        } else {
            for (int i = tamanho;i>0;i=i-1) {
                dados[i] = dados[i-1];
            }
            dados[0] = aluno;
            tamanho++;
        }
    }
    public void adicionaFinal(Aluno aluno){
        if (cheia()) {
            JOptionPane.showMessageDialog(null, "ERRO:\n A lista está cheia!");
        } else {
            dados[tamanho] = aluno;
            tamanho++;
        }
    }    
    public void removeInicio(){
        if (vazia()) {
            JOptionPane.showMessageDialog(null, "ERRO: Lista vazia");
        } else {
            Aluno aluno = dados[0];
            for (int i = 0;i<tamanho-1;i++) {
                dados[i] = dados[i+1];
            }
            tamanho--;
            dados[tamanho] = new Aluno("","") ;
        }
    }
    public void removeFinal(){
        if (vazia()) {
            JOptionPane.showMessageDialog(null, "ERRO: Lista vazia");
        } else {
            tamanho--;
            dados[tamanho] = new Aluno("","");
        }
    }
    public Aluno obtemPrimeiro(){
        if (vazia()) {
            JOptionPane.showMessageDialog(null, "ERRO: Lista vazia");
            return new Aluno("","");
        }
        return dados[0];
    }
    public Aluno obtemUltimo(){
        if (vazia()) {
            JOptionPane.showMessageDialog(null, "ERRO: Lista vazia");
            return new Aluno("","");
        }
        return dados[tamanho-1];
    }
    public void removePosicao(int n){
        int e;
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
            dados[tamanho] = 0;
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
