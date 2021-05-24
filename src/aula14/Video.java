package aula14;

public class Video implements AcoesVideo{
	//Atributos
	private String titulo;
	private int avaliacao;
	private int views;
	private int curtidas;
	private boolean reproduzindo;
	
	//Construtor
	public Video(String titulo) {
		setTitulo(titulo);
		this.avaliacao = 1;
		this.views = 0;
		this.curtidas = 0;
		this.reproduzindo = false;
	}
	
	//ToString
	@Override
	public String toString() {
		return "Video: \n[titulo = " + this.titulo + 
				"\navaliacao = " + this.avaliacao + 
				"\nviews = " + this.views + 
				"\ncurtidas = " + this.curtidas +
				"\nreproduzindo = " + this.reproduzindo + "]" +
				"\n---------------------------------------------";
	}

	//Métodos
	@Override
	public void play() {
		this.reproduzindo = true;
	}

	@Override
	public void pause() {
		this.reproduzindo = false;
	}

	@Override
	public void like() {
		this.curtidas++;
	}
	
	//Métodos especiais 
	public String getTitulo() {
		return this.titulo;
	}
	public void setTitulo(String ti) {
		this.titulo = ti;
	}
	
	
	public int getAvaliacao() {
		return this.avaliacao;
	}
	public void setAvaliacao(int av) {
		float nova;
		nova = (this.avaliacao + av) / this.views;
		this.avaliacao = (int)nova;
	}
	
	
	public int getViews() {
		return this.views;
	}
	public void setViews(int vi) {
		this.views = vi;
	}
	
	
	public int getCurtidas() {
		return this.curtidas;
	}
	public void setCurtidas(int cu) {
		this.curtidas = cu;
	}
	
	
	public boolean getReproduzindo() {
		return this.reproduzindo;
	}
	public void setReproduzindo(boolean rp) {
		this.reproduzindo = rp;
	}
	
	

}
