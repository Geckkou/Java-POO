package aula10;

public class Aula10_Herança {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Cadastro p1 = new Cadastro();
	Aluno p2 = new Aluno();
	Professor p3 = new Professor();
	Funcionario p4 = new Funcionario();
	
	p1.setNome("Alexandre");
	p2.setNome("Maria");
	p3.setNome("Roberto");
	p4.setNome("Fabiana");
	
	p1.setSexo("M");
	p4.setSexo("F");
	p2.setIdade(18);
	
	
	p2.setCurso("Inform�tica");
	p3.setSalario(2500.75f);
	p4.setSetor("Estoque");
	
	p3.receberAum(550.20f);
	p4.setTrabalhando(false);
	p4.mudarTrabalho();
	p2.cancelarMatr();
	
	System.out.println(p1.toString());
	System.out.println(p2.toString());
	System.out.println(p3.toString());
	System.out.println(p4.toString());
	
	}

}
