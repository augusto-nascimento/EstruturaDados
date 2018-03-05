/*
 * Implemente uma aplicação Java que recebe a largura de uma parede quadrada 
    e a largura de um azulejo quadrado, calcula e mostra quantos azulejos são 
    necessários para preencher completamente a parede.
 */
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


/**
 *
 * @author Augusto
 */
public class Revisao_1_Exec_6 {
    public static void main(String args[]) throws IOException{
        double larguraParede, larguraAzulejo, areaParede, areaAzulejo;
        double quantidadeAzulejo;

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        System.out.printf("Digite a largura da parede\n");
        larguraParede = Double.parseDouble(in.readLine());
        
        System.out.printf("Digite a largura do azulejo\n");
        larguraAzulejo = Double.parseDouble(in.readLine());        
        
        areaParede = Math.pow(larguraParede, 2);
        areaAzulejo = Math.pow(larguraAzulejo, 2);
        
        quantidadeAzulejo = Math.ceil(areaParede / areaAzulejo);
        
        System.out.printf("Serão necessários %.1f azulejos\n", quantidadeAzulejo);
        

        
    }
}
