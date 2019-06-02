package gestionale.utente;

import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class Client extends abstractUtente{
	
	private int credito;

	Date data;

	public Client(String nome, String cognome, String username, String password, Date data) {
		super(username, password, nome, cognome);
		this.data = data;
	}
	
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	public int getCredito() {
		return credito;
	}

	public void setCredito(int credito) {
		this.credito = credito;
	}
	
	@Override
	public boolean equals(Object o) {
		
		if(o==this)
			return true;
		
		if(o==null || o.getClass()!=this.getClass())
			return false;
		
		Client a = (Client)o;
		return a.getNome()==this.getNome() && a.getCognome()==this.getCognome() && a.getUsername()==this.getUsername();
		
		
	}
	
	@Override
	public int hashCode() {
		
		return this.getNome().hashCode() + this.getCognome().hashCode() + this.getUsername().hashCode() + this.getData().hashCode();
		
	}
	
	@Override
	public String toString() {
		
		return super.toString() + "\nGiorno:" + this.getData().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getDayOfMonth() + "\nMese: " + this.getData().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getMonth()+ "\nAnno:" + this.getData().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear();

		
	}
	

}
