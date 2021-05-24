package aula13;

public class Mamifero extends Animal{
	//Atributos
	protected String CorPelo;
	
	//Métodos
	@Override
	public void emitirSom() {
		System.out.println("Som de animal");
	}
	
	//Métodos especiais
	public String getCorPelo() {
		return this.CorPelo;
	}
	public void setCorPelo(String cp) {
		this.CorPelo = cp;
	}
	
}
