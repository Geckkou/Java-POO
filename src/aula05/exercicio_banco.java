package aula05;

public class exercicio_banco {

	public static void main(String[] args) {
		banco p1 = new banco();
		p1.setNumConta(11111);
		p1.setDono("Alexandre Augusto");
		p1.abrirConta("cc");
		
		
		banco p2 = new banco();
		p2.setNumConta(22222);
		p2.setDono("Gerald'd Rívia");
		p2.abrirConta("cp");
		
		
		p1.depositar(100);
		p2.depositar(500);
		
		p2.sacar(100);
		//p1.sacar(1000);
		
		p1.sacar(150);
		p1.fecharConta();
		
		p2.pagarMensal();
		
		p1.estadoAtual();
		p2.estadoAtual();

	}

}
