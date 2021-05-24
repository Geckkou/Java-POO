
public class Mouse {

	String marca;
	boolean estado;
	int dpi;
	boolean rbg;
	
	void estatus() {
		System.out.println("A marca do mouse é: " + this.marca);
		System.out.println("O mouse está ligado ? " + this.estado);
		System.out.println("O dpi do mouse é: " + this.dpi);
		System.out.println("o mouse tem rgb ? " + this.rbg);		
	}
	
	void uso() {
		if(this.estado == true) {
			System.out.println("O mouse esta pronto.");
		}else {
			System.out.println("O mouse não está pronto para uso. ");
		}
	}
	
	void ligado() {
		this.estado = true;
	}
	
	void desligado() {
		this.estado = false;
	}
}
