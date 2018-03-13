
import com.sun.org.glassfish.gmbal.ParameterNames;

/**
 * Classe que mantem dados e operações para Alunos
 * @author Augusto Rocha Nascimento
 */
public class Aluno {
    private String nome;
    private String ra;

    /**
     * 
     * @param nome é o nome completo do aluno
     * @param ra  é o ra do aluno
     */
    
    public Aluno(String nome, String ra) {
        this.nome = nome;
        this.ra = ra;
    }
    
    /**
     * Método que concatena o valor dos atributos
     * @return é uma String com o Valor dos atributos
     */
    @Override
    public String toString() {
        return "Nome=" + nome + " RA=" + ra + "\n";
    }
    /**
     * Metodo de acesso ao valor do atributo Nome
     * @return 
     */
    public String getNome() {
        return nome;
    }

    /**
     * Metodo de acesso ao valor do atributo RA
     * @return 
     */
    public String getRa() {
        return ra;
    }

    /**
     * Metodo modificador para o atributo nome
     * @param nome é um novo nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Metodo modificador para o atributo ra
     * @param ra é um novo registro academico do aluno
     */
    public void setRa(String ra) {
        this.ra = ra;
    }
    
    
}
