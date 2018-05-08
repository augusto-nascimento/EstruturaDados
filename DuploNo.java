/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author augusto
 */
public class DuploNo {
    public int dado;
    public DuploNo prox;
    public DuploNo ant;
    public DuploNo(int e) {
        dado = e;
        prox = null;
        ant = null;
    }
}
