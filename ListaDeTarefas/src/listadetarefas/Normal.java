package listadetarefas;

public class Normal extends Tarefa {
	
	private String ordemCriacao;



	public Normal (String titulo, boolean status, String ordemCriacao){
		super(titulo, status);
		this.ordemCriacao = ordemCriacao;

	}

	//gets sets

	public String getOrdemCriacao() {
		return ordemCriacao;

	}
	
	public void setOrdemCriacao(String ordemCriacao) {
		this.ordemCriacao = ordemCriacao;
	}
	
}
