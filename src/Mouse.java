
public class Mouse {

	String marca;
	boolean estado;
	int dpi;
	boolean rbg;
	
	void estatus() {
		System.out.println("A marca do mouse �: " + this.marca);
		System.out.println("O mouse est� ligado ? " + this.estado);
		System.out.println("O dpi do mouse �: " + this.dpi);
		System.out.println("o mouse tem rgb ? " + this.rbg);		
	}
	
	void uso() {
		if(this.estado == true) {
			System.out.println("O mouse esta pronto.");
		}else {
			System.out.println("O mouse n�o est� pronto para uso. ");
		}
	}
	
	void ligado() {
		this.estado = true;
	}
	
	void desligado() {
		this.estado = false;
	}
}
