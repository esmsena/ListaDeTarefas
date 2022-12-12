package listadetarefas;

import java.text.ParseException;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		//Usuario
		
		Usuario cadastro = new Usuario("Esther", "esther@gmail.com");
		System.out.println(cadastro.getNome());
		System.out.println(cadastro.getEmail());
		
		
		//lista
		
		Lista lista1 = new Lista("Faculdade", 2);
		System.out.println(lista1.getNome());
		System.out.println(lista1.getQuantidade());

		//importante
		
		Importante tarefa1 = new Importante("prova", true, "Azul", "21/10/2023", true);
		System.out.println(tarefa1.getTitulo());
		System.out.println(tarefa1.getStatus());
		System.out.println(tarefa1.getCaracteristica());
		System.out.println(tarefa1.getData("21/10/2023"));
		System.out.println(tarefa1.getFixarAcima());
		
		
		//normal
		
		Normal tarefas2 = new Normal ("limpar Casa", true, "2°lugar");
		System.out.println(tarefas2.getTitulo());
		System.out.println(tarefas2.getStatus());
		System.out.println(tarefas2.getOrdemCriacao());
	}
	
}
