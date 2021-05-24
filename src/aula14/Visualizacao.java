package aula14;

public class Visualizacao{

	//Atributos
	private Gafanhoto espectador;
	private Video filme;
	
	//Construtor 
	public Visualizacao(Gafanhoto espectador, Video filme) {
		setEspectador(espectador);
		setFilme(filme);
		this.espectador.setTotAssistindo(this.espectador.getTotAssistindo() + 1);
		this.filme.setViews(this.filme.getViews() + 1);
	}
	
	//Tostring
	@Override
	public String toString() {
		return "Visualizacao [espectador = " + espectador + 
				"\nfilme = " + filme + "]";
	}

	
	//Métodos
	public void avaliar() {
		this.filme.setAvaliacao(5);
	}
	
	public void avaliar(int nota) {
		this.filme.setAvaliacao(nota);
	}
	
	public void avaliar(float porc) {
		int tot =0;
		if(porc <= 20) {
			tot = 3;
		}else if(porc <= 50) {
			tot = 5;
		}else if(porc <= 90) {
			tot = 8;
		}else {
			tot = 10;
		}
			this.filme.setAvaliacao(tot);
	}
	
	//Métodos especiais
	public Gafanhoto getEspectador() {
		return this.espectador;
	}
	public void setEspectador(Gafanhoto espc) {
		this.espectador = espc;
	}
	
	
	public Video getFilme() {
		return this.filme;
	}
	public void setFilme(Video fil) {
		this.filme = fil;
	}
	
}
