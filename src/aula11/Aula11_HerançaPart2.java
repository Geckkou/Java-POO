package aula11;

public class Aula11_HerançaPart2 {

	public static void main(String[] args) {
		//Pessoa p1 = new Pessoa(); (classe abstrata n�o pode ser instanciada)
		Visitante v1 = new Visitante();
		Aluno a1 = new Aluno();
		Bolsista b1 = new Bolsista();
		
		v1.setNome("Gecko");
		v1.setIdade(20);
		v1.setSexo("M");
		System.out.println(v1.toString());
		
		a1.setNome("Twig");
		a1.setMatricula(1111);
		a1.setCurso("An�lise e desenvolvimento de sistema");
		a1.setIdade(21);
		a1.setSexo("M");
		a1.pagarMensalidade();
		System.out.println(a1.toString());
		
		b1.setMatricula(1112);
		b1.setNome("Hilda");
		b1.setCurso("Ci�ncias da computa��o");
		b1.setBolsa(12.5f);
		b1.setSexo("F");
		b1.setIdade(16);
		b1.pagarMensalidade();
		System.out.println(b1.toString());
		
	}

}
