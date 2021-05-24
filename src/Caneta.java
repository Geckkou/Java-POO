
public class Caneta {
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	void status() {
		System.out.print("Uma caneta " + this.cor);
		System.out.println(" está tampada ? " + this.tampada);
		System.out.println("Caneta do modelo: " + this.modelo);
		System.out.println("Caneta com ponta tipo: " + this.ponta);
		System.out.println("caneta com carga de tamanho: " + this.carga);
	}
	
	void rabiscar() {
		if(this.tampada == true) {
			System.out.println("Erro ! Não posso rabiscar.");
		}else {
			System.out.println("Posso rabiscar.");
		}
	}
	
	void tampar() {
		this.tampada = true;
	}
	
	void destampar() {
		this.tampada = false;
	}

}
