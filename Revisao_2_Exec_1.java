/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author augusto
 */
public class Revisao_2_Exec_1 {
    private InputStream in;
    
    public Revisao_2_Exec_1 (InputStream in){
        this.in = in;
    }
    
    public static void main(String args[]) throws IOException{
        int x,y,r;

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        System.out.printf("Digite um valor positivo\n");
        x = Integer.parseInt(in.readLine());

        System.out.printf("Digite um valor positivo\n");
        y = Integer.parseInt(in.readLine());

        if (x>0 & y>0) {
            if (x>y){
                r = x - y;
                System.out.printf("%d - %d = %d\n", x,y,r);   
            }
            else {
                r = y - x;
                System.out.printf("%d - %d = %d\n", y,x,r);                
            }
        }
        else {
            System.out.printf("Os dois valores devem ser positivos \n");
        }
    }
}
