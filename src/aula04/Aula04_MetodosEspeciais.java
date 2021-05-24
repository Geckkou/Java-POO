package aula04;

public class Aula04_MetodosEspeciais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		caneta03 c1 = new caneta03("nic", 0.9f, "Vermelha", true);
		Mouse02 m1 = new Mouse02("Redragon",true, 1600,true);
		//c1.setModelo("Bic");
		//c1.setPonta(0.5f);
		
		
		//System.out.println("tenho uma caneta: " + c1.getModelo() +" de ponta "+ c1.getPonta() + " Com a cor " + c1.getCor());
		//System.out.println(c1.getTampada());
		
		c1.status();
		m1.status();

	}

}
