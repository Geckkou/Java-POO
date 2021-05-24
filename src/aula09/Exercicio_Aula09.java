package aula09;

public class Exercicio_Aula09 {

	public static void main(String[] args) {
		Pessoa [] p = new Pessoa[2];
		Livro [] l = new Livro[3];

		p[0] = new Pessoa ("Alexandre", 19, "M");
		p[1] = new Pessoa ("Gecko", 18, "M");
		
		l[0] = new Livro ("The Witcher: A espada do destino.", "Andrzej Sapkowski", 380, p[0]);
		l[1] = new Livro("O Hobbit", "J.R.R Tolkien", 398, p[1]);
		l[2] = new Livro("O ladr�o de raios", "Rick Riordan", 387, p[1]);
		
		l[0].abrir();
		l[0].folhear(45);
		l[0].avançarPag();
		
		l[1].abrir();
		l[1].avançarPag();
		
		System.out.println(l[1].detalhes());
		System.out.println(l[0].detalhes());
		p[0].resumoPessoa();
	}

}
