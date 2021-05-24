
public class Aula02_Classes_Objetos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caneta c1 = new Caneta();
		
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.modelo = "Bic";
		c1.carga = 90;
		c1.tampar();
		c1.status();
		c1.rabiscar();
		
		System.out.println("");
		
		Caneta c2 = new Caneta();
		c2.modelo = "Hostnet";
		c2.cor = "Preta";
		c2.destampar();
		c2.rabiscar();
		c2.status();
		
		System.out.println("");
		
		Mouse m1 = new Mouse();
		m1.marca = "Redragon - king cobra";
		m1.dpi = 1600;
		m1.rbg = true;
		m1.desligado();
		m1.estatus();
		m1.uso();

	}

}
