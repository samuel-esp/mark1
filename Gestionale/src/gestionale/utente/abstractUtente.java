package gestionale.utente;

public abstract class abstractUtente {
	
	private String nome;

	private String cognome;
	
	private String username;
	
	private String password;
	
	public abstractUtente(String nome, String cognome, String username, String password) {	
		this.nome = nome;
		this.cognome = cognome;
		this.username = username;	
		this.password = password;
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	private String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean checkPassword(String password) {
		
		if(password.equals(this.getPassword()))
			return true;
		
		return false;
		
	}
	
	@Override
	public String toString() {
		
		return "\nNome:" + this.getNome() +"\nCognome: " + this.getCognome() + "\nUsername: " + this.getUsername();
		
	}

}
