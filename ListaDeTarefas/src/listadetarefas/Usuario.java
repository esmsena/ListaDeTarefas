package listadetarefas;

import java.util.ArrayList;

public class Usuario {

	private String nome;
	private String email;
	private ArrayList<Lista>listas;


	public Usuario (String nome, String email){
		this.nome = nome;
		this.email = email;
		this.listas = new ArrayList<>();

	}

	//gets sets

	public String getEmail() {
		return email;

	}

	public void setEmail(String email) {
		this.email = email;

	}

	public String getNome() {
		return nome;

	}

	public void setNome(String nome) {
		this.nome = nome;

	}

	public ArrayList <Lista> getlistas() {
		return listas;

	}

	public void setLista (ArrayList <Lista> listas) {
		this.listas = listas;

	}
	

}
