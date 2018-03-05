/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
/**
 *
 * @author Laboratorios
 */
public class Matematica {
    public static void main (String args[]) throws IOException {
//        int v[]={2,-4,7,0,-1,4};
        int v[] = {};
        System.out.println(fibonacciV(4,v));
    }
    public static int mdc(int a, int b){
        if (a % b == 0 ) {
            return b;
        }
        return  mdc (b, a % b);
    }
    public static int f ( int v[], int n){
        if(n == 0)
            return 0;
        else {
            int s;
            s = f (v, n-1);
            if (v[n-1] > 0) s = s + v [n-1];
        return s;
        }
    }
    
    public static int metodoA(int n){
        if (n == 1){
            return 1;
        }
        return metodoA(n-1)+n;
    }
    
    public static int metodoB(int n, int m){
        if (m>n){
            return 0;
        }
        if (m==n){
            return n;
        }
        return (metodoB(n-1,m+1)+(n+m));
    }    
    public static void fibonacci_teste() throws IOException{
        double f;
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        System.out.printf("Digite um numero maior que zero para calcular "
                + "o termo fibonacci \n");
        f = Integer.parseInt(in.readLine());
        double t = System.nanoTime();
        System.out.printf("o fibonacci de %2f é %2f\n", f, fibonacci(f));
        System.out.printf("tempo %f\n", (System.nanoTime() - t) / Math.pow(10,9));
        
    }
    public static void fatorial_teste() throws IOException{
        double f;
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        System.out.printf("Digite um numero maior que zero para calcular "
                + "o fatorial \n");
        f = Integer.parseInt(in.readLine());
        double t = System.nanoTime();
        System.out.printf("o fatorial de %2f é %2f\n", f, fatorial(f));
        System.out.printf("tempo %f\n", (System.nanoTime() - t) / Math.pow(10,9));
        t = System.nanoTime();
        System.out.printf("o fatorial de %2f é %2f\n", f, fatorialR(f));
        System.out.printf("tempo %f\n", (System.nanoTime() - t) / Math.pow(10,9));        
    }
    public static double fibonacci (double n) {
        if ( n == 0 ) {
            return 0;
        }
        if ( n == 1 ) {
            return 1;
        }
        return fibonacci (n-1) + fibonacci (n-2);
    }
    public static double fibonacciV (int n, int v[]) {
        if ( v.length == 0 ) {
//            int v[] = {1};
            System.arraycopy(v, 0, v, 0, v.length);
            return fibonacciV(n,v);
        }
        if ( n == 1 ) {
            return 1;
        }
        return fibonacci (n-1) + fibonacci (n-2);
    }    
    public static double fatorial(double n) {
        double fat = 1;
        while (n > 1) {
            fat = fat * n;
            n = n - 1;
        }
        return fat;
    }
    public static double fatorialR(double n) {
        if (n > 1) {
            return fatorialR(n-1) * n;
        }
        return 1;
    }
}
