import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		int x = 0;
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        
        Lista lista = new Lista(5);
        
        while(x!=-1) {
        	System.out.println(x);
            x = Integer.parseInt(in.readLine());
            lista.adicionaInicio(x);
        }
//        lista.imprime_lista();
	}
}