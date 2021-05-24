package aula13;

public class Cachorro extends Lobo {
	//Métodos 
	@Override
	public void emitirSom() {
		System.out.println(" AU ! AU ! AU !");
	}
	
	public void reagir(String frase) {
		if(frase.equals("Toma comida") || frase.equals("Óla")) {
			System.out.println("Cachorro está abanando o rabo e latindo.");
		}else {
			System.out.println("Cachorro está Rosnando para você.");
		}
	}
	
	public void reagir(int hora, int min) {
		if(hora < 12) {
			System.out.println("Cachorro abanando rabo.");
		}else if(hora >= 18) {
			System.out.println("Cachorro ignorou você.");
		}else {
			System.out.println("Cachorro abanou e latiu para você.");
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
