package aula14;

public class Gafanhoto extends Pessoa {
	
	//Atributos
	private String login;
	private int totAssistindo;
	
	//Construtor
	public Gafanhoto(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo);
		setLogin(login);
		this.totAssistindo = 0;
	}
	
	//Métodos 
	public void viuMaisUm() {
		
	}

	//Métodos especiais
	public String getLogin() {
		return this.login;
	}
	public void setLogin(String login) {
		this.login = login;
	}

	
	public int getTotAssistindo() {
		return this.totAssistindo;
	}

	public void setTotAssistindo(int totAssistindo) {
		this.totAssistindo = totAssistindo;
	}

	//Tostring
	@Override
	public String toString() {
		return "Gafanhoto:" +"\n"+ super.toString()+
				"\n[login = "  + this.login + 
				"\ntotAssistindo = " + this.totAssistindo + "]" +
				"\n---------------------------------------------";
	}
	
	
	
	
}
