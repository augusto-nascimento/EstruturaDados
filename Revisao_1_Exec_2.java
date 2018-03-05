
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lab 102
 */
public class Revisao_1_Exec_2 {
    public static void main(String args[]) throws IOException {
        int a, b, x;
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir) ;
        
        a = Integer.parseInt(in.readLine());
        b = Integer.parseInt(in.readLine());
        
        x = a + b;
        System.out.printf(" a soma de %d e %d é igual à %d\n", a,b,x);
    }
}
