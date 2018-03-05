/*
 * Implemente uma aplicação Java que recebe o raio de uma circunferência, 
    calcula e mostra sua área e seu perímetro.
 */
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author Lab 102
 */
public class Revisao_1_Exec_5 {
  public static void main (String args[])  throws Exception{
    int r;
    Double P, A;
    InputStreamReader ir = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(ir);

    
    System.out.printf("Digite o raio da circunferência\n");
    r = Integer.parseInt(in.readLine());

    A = Math.PI * Math.pow(r,2);
    System.out.printf("A área da circunferência é: %.2f\n", A);

    P = 2 * Math.PI * r;
    System.out.printf("O perímetro da circunferência é: %.2f\n", P);        
        
      
  }
}
