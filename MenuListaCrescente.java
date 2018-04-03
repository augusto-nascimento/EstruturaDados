
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
public class MenuListaCrescente {
    public static void main (String args[]) {
        ListaLigadaCrescente lista1 = new ListaLigadaCrescente();
        int op = 0, x, n;
        String str;
        while (op != 99) {
            str = JOptionPane.showInputDialog(
                    "CONTEUDO DA LISTA: \n" + 
                    lista1.toString() + 
                    "\n\nMenu\n"+
                    "1-Adiciona Elemento\n"+
                    "2-Remove Elemento\n"+
                    "99-Sair\n\n"
            );
            op = Integer.parseInt(str);
            switch (op) {
                case 1:
                    x = Integer.parseInt(
                            JOptionPane.showInputDialog(
                                    "Adicione novo elemento"
                            )
                        );
                    lista1.adicionaElemento(x);
                    break;
                case 2:
                    x = Integer.parseInt(
                            JOptionPane.showInputDialog(
                                    "Indique o elemento a ser removido"
                            )
                        );                    
                    lista1.removeElemento(x);
                    break;
                case 99:
                    System.out.println("Encerrando");
                    break;
                default:
                    System.out.println("Opção Invalida");
                    break;
            }
        }
    }
}
