/*
 * Implemente uma aplicação Java que recebe o raio da base e a 
    altura de um cilindro, calcula e mostra seu volume.
    Volume de um cilindro=altura .π . raio2
 */
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author Lab 102
 */
public class Revisao_1_Exec_7 {
    public static void main(String args[]) throws IOException{
        double h,r, V;

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        System.out.printf("Digite a altura do cilindro\n");
        h = Double.parseDouble(in.readLine());
        
        System.out.printf("Digite o raio da base do cilindro\n");
        r = Double.parseDouble(in.readLine());      
        
        V = h * Math.PI * Math.pow(r, 2);
        
        System.out.printf("O volume do cilindro é %.2f\n", V);   
    }
}
