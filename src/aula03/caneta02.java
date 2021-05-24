package aula03;

public class caneta02 {
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;
	
	public void status () {
		System.out.println("O modelo é: " + this.modelo);
		System.out.println("A cor é: " + this.cor);
		System.out.println("O tamanho da ponta é: " + this.ponta);
		System.out.println("o tipo de carga é: " + this.carga);
		System.out.println("Está tampada? " + this.tampada);
		
	}
	
	public void rabiscar(){
		if(this.tampada == false) {
			System.out.println("Posso rabiscar.");
		}else {
			System.out.println("Não posso rabiscar.");
		}
			
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}

}
