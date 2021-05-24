package aula13;

public class Cachorro extends Lobo {
	//M�todos 
	@Override
	public void emitirSom() {
		System.out.println(" AU ! AU ! AU !");
	}
	
	public void reagir(String frase) {
		if(frase.equals("Toma comida") || frase.equals("�la")) {
			System.out.println("Cachorro est� abanando o rabo e latindo.");
		}else {
			System.out.println("Cachorro est� Rosnando para voc�.");
		}
	}
	
	public void reagir(int hora, int min) {
		if(hora < 12) {
			System.out.println("Cachorro abanando rabo.");
		}else if(hora >= 18) {
			System.out.println("Cachorro ignorou voc�.");
		}else {
			System.out.println("Cachorro abanou e latiu para voc�.");
		}
	}
	
	public void reagir(boolean dono) {
		if(dono) {
			System.out.println("Abanar.");
		}else {
			System.out.print("Rosnar e latir.");
			this.emitirSom();
		}
	}
	
	public void reagir(int idade, float peso) {
		if(idade < 5) {
			if(peso < 10) {
				System.out.println("Abanar");
			}else {
				System.out.println("Latir");
			}
		}else if (peso < 10) {
			System.out.println("Rosnar");
		}else {
			System.out.println("Ignorar");
		}
	}
}
