
public class Lista {

	private int[] dados;
	private int tamanho;
	public Lista (int capMax) {
	    dados = new int[capMax];
	    tamanho = 0;
	}
	/**
	 * Adiciona elemento ao inicio da lista
	 * @param é o novo elemento
	 */
	public void adicionaInicio(int e){
	    if (cheia()) {
	        System.out.println("ERRO:\n A lista está cheia!\n");
	    } else {
	        for (int i = tamanho;i>0;i=i-1) {
	            dados[i] = dados[i-1];
	        }
	        dados[0]=e;
	        tamanho++;
	    }
	}
    public boolean cheia() {
        return tamanho == dados.length;
    }
    public void ordena_crescente() {
    	int ordena = 0, x;
    	while (ordena == 1) {
    		ordena = 0;
        	for (int i=0;i<tamanho;i++) {
        		if (dados[i]>dados[i+1] ){
        			x = dados[i];
        			dados[i] = dados[i+1];
        			dados[i+1] = dados[i];
        			ordena = 1;
        		}
        	}
		}
    }
    public void ordena_decrescente() {
    	int ordena = 0, x;
    	while (ordena == 1) {
    		ordena = 0;
        	for (int i=0;i<tamanho;i++) {
        		if (dados[i]<dados[i+1] ){
        			x = dados[i];
        			dados[i] = dados[i+1];
        			dados[i+1] = dados[i];
        			ordena = 1;
        		}
        	}
		}
    }
    public void imprime_lista() {
    	for (int i=0;i<tamanho;i++) {
			System.out.println(dados[i]);
		}
    }
}
