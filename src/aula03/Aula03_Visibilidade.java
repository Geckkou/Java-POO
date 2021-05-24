package aula03;

public class Aula03_Visibilidade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		caneta02 c1 = new caneta02();
		
		c1.modelo="Bic Cristal";
		c1.cor = "Azul";
		//c1.ponta = 0.5f;
		c1.carga = 80;
		//c1.tampada = true;
		c1.tampar();
		c1.status();
		c1.rabiscar();

	}

}
