package espalhamento;

public class Contato {
	private String nome;
	private String telefone;
	public Contato(String nome_, String telefone_) {
		nome = nome_;
		telefone = telefone_;
	}
	public String getNome() {
		return nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
