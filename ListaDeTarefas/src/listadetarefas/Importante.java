package listadetarefas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Importante extends  Tarefa {
	
	private String caracteristica;
	private Date data;
	private boolean fixarAcima;

	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	public Importante (String titulo, boolean status, String caracteristica, String data, boolean b) throws ParseException{
		super(titulo, status);
		this.caracteristica = caracteristica;
		this.data = formatter.parse(data);
		this.fixarAcima = b;

	}

	//gets sets

	public String getCaracteristica() {
		return caracteristica;

	}
	
	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}


	public String getData(String data){
		return data;

	}

	public void setData(String data) throws ParseException {
		this.data = formatter.parse(data);
	}
		
	public boolean getFixarAcima() {
			return fixarAcima;

	}

	public void setFixarAcima(boolean fixarAcima) {
		this.fixarAcima = fixarAcima;
	}

	

}
