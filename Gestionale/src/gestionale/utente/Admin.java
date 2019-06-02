package gestionale.utente;

public class Admin extends abstractUtente{
	
	public Admin(String nome, String cognome, String username, String password) {
		super(nome, cognome, username, password);
	}
	
	@Override
	public boolean equals(Object o) {
		
		if(o==this)
			return true;
		
		if(o==null || o.getClass()!=this.getClass())
			return false;
		
		Admin a = (Admin)o;
		return a.getNome()==this.getNome() && a.getCognome()==this.getCognome() && a.getUsername()==this.getUsername();
		
		
	}
	
	@Override
	public int hashCode() {
		
		return this.getNome().hashCode() + this.getCognome().hashCode() + this.getUsername().hashCode();
		
	}
	
	@Override
	public String toString() {
		
		return super.toString();
		
	}
	
	

}
