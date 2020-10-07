package classes;

public class Planeta {
	private String nome;
	private double diametro;
	private double distancia;
	private String curiosidades;
	private int luas;
	
	
	public Planeta(String nome) {
		this.setNome(nome);	}
	
	//getters and setters
	public String getNome() {		return nome;	}
	public double getDiametro() {	return diametro;	}
	public double getDistancia() {	return distancia;	}
	public String getCuriosidades() {	return curiosidades;	}
	public int getLuas() {	return luas;	}
	public void setNome(String nome) {	this.nome = nome;	}
	public void setDiametro(double diametro) {	this.diametro = diametro;	}
	public void setDistancia(double distancia) {	this.distancia = distancia; }
	public void setCuriosidades(String curiosidades) {	this.curiosidades = curiosidades;}
	public void setLuas(int luas) {	this.luas = luas;}
	
	

}
