package espalhamento;

public class No {
    public Contato contato;
    public No prox;
    public No ant;
    public No(Contato contato_) {
        contato = contato_;
        prox = null;
        ant = null;
    }
}
