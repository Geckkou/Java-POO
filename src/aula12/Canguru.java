package aula12;

public class Canguru extends Mamifero {
	//M�todos
	public void usarBolsa() {
		System.out.println("Usando bolsa");
	}
	
	@Override
	public void locomover() {
		System.out.println("Saltando");
	}
	
}
