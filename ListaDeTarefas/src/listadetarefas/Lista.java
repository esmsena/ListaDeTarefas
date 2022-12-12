package listadetarefas;

import java.util.ArrayList;

public class Lista {

		private String nome;
		private int quantidade;
		private ArrayList<Tarefa> tarefas;


		public Lista (String nome, int quantidade){
			this.nome = nome;
			this.quantidade = quantidade;
			this.tarefas = new ArrayList<>();

		}

		//gets sets

		public String getNome() {
			return nome;

		}

		public void setNome(String nome) {
			this.nome = nome;

		}

		public int getQuantidade() {
			return quantidade;

		}

		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;

		}

		public ArrayList <Tarefa> getTarefas() {
			return tarefas;

		}

		public void setTarefa (ArrayList <Tarefa> tarefas) {
			this.tarefas = tarefas;

		}
		

}

