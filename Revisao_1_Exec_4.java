/*
 * Implemente uma aplicação Java que recebe a largura e a altura de um retângulo, 
    calcula e mostra sua área e seu perímetro.
 */
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
/**
 *
 * @author Lab 102
 */
public class Revisao_1_Exec_4 {
    public static void main(String args[]) throws IOException {
        int b,h,P;
        double A;
        
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        
        System.out.printf("Digite a base do triângulo\n");
        b = Integer.parseInt(in.readLine());
        System.out.printf("Digite a altura do triângulo\n");
        h = Integer.parseInt(in.readLine());
        
        A = b * h / 2;
        System.out.printf("A área do triãgulo é: %.2f\n", A);
        
        P = (b * 2) + (h*2);
        System.out.printf("O perímetro do triãngulo é: %d\n", P);        
        
    }
}
