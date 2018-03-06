
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
public class TesteMenu {
    public static void main (String args[]) {
        ListaDeInteiros lista1 = new ListaDeInteiros(4);
        int op = 0, x;
        String str;
        
        while (op != 99) {
            str = JOptionPane.showInputDialog("Menu\n"+
                    "1-Adiciona Inicio\n"+
                    "2-Remove Inicio\n"+
//                    "3-Adiciona Inicio\n"+
//                    "4-Adiciona Inicio\n"+
//                    "5-Adiciona Inicio\n"+
//                    "6-Adiciona Inicio\n"+
//                    "7-Adiciona Inicio\n"+
//                    "8-Adiciona Inicio\n"+
                    "9-Imprime Lista\n"+
                    "99-Sair\n"
            );
            op = Integer.parseInt(str);
            switch (op) {
                case 1:
                    x = Integer.parseInt(
                            JOptionPane.showInputDialog(
                                    "Adicione novo elemento"
                            )
                        );
                    lista1.adicionaInicio(x);
                    break;
                case 2:
                    lista1.removeInicio();
                    System.out.println(lista1.toString());
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    System.out.println("Em implementação");
                    break;
                case 9:
                    System.out.println(lista1.toString());
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
