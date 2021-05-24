package aula14;

public class Aula14_Exercicio {

	public static void main(String[] args) {
		Video [] v = new Video[3];
		Gafanhoto [] g = new Gafanhoto[2];
		
		
		v[0] = new Video("Aula 1 POO");
		v[1] = new Video("Aula 12 PHP");
		v[2] = new Video("Aula 10 HTML5");
		
		g[0] = new Gafanhoto("Alexandre", 19, "M", "Gecko");
		g[1] = new Gafanhoto("Holland", 13, "M", "Spidey");
		
		Visualizacao [] vis = new Visualizacao[5];
		vis[0] = new Visualizacao(g[0],v[2]);
		vis[0].avaliar();
		System.out.println(vis[0].toString());
		
		vis[1] = new Visualizacao(g[0], v[1]);
		vis[0].avaliar(87.0f);
		System.out.println(vis[1].toString());
		
	/*	System.out.println(v[0].toString());
		System.out.println(g[0].toString()); */
		
		
	}

}
