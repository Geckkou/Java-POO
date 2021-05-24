package aula04;

public class Mouse02 {
	private String marca;
	private boolean estado;
	private int dpi;
	private boolean rgb;
	
	public Mouse02(String m, boolean e, int d, boolean r) {
		setMarca(m);
		setEstado(e);
		setDpi(d);
		setRgb(r);
		
	}
	
	public String getMarca() {
		return this.marca;
	}	
	public void setMarca(String m){
		this.marca = m;
	}
	
	
	public boolean getEstado() {
		return this.estado;
	}
	public void setEstado(boolean e) {
		this.estado =e;
	}
	
	
	public int getDpi() {
		return this.dpi;
	}
	public void setDpi(int d) {
		this.dpi=d;
	}
	
	
	public boolean getRgb() {
		return this.rgb;
	}
	public void setRgb(boolean r) {
		this.rgb = r;
	}
	
	
	public void status() {
		System.out.println("A marca do mouse é: " + getMarca());
		System.out.println("O mouse está ligado ? " + getEstado());
		System.out.println("O dpi do mouse é: " + getDpi());
		System.out.println("o mouse tem rgb ? " + getRgb());		
	}

}
