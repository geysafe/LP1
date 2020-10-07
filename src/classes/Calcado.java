package classes;

public class Calcado {
	private String modelo;
    private String marca;
    private int numeracao;
    private String composicao;
    private String finalidade; //esporte, social, segurança (EPI), casual
	    
    //construtor
    public Calcado(String modelo, String marca, int numeracao) {
		this.setModelo(modelo);
		this.setMarca(marca);
		this.setNumeracao(numeracao);
	}
    
    //getters
	public String getModelo() {	return modelo;}
	public String getMarca() { return marca;}
	public int getNumeracao() { return numeracao;}
	public String getComposicao() {	return composicao;}
	public String getFinalidade() {	return finalidade;}

	//setters
	public void setModelo(String modelo) { this.modelo = modelo;}
	public void setMarca(String marca) { this.marca = marca;}
	public void setNumeracao(int numeracao) { this.numeracao = numeracao;}
	public void setComposicao(String composicao) { this.composicao = composicao;}
	public void setFinalidade(String finalidade) { this.finalidade = finalidade;}
    
    
	public void proteger() {
        System.out.println("fornecem proteção e segurança");
    }
    
    public void vestir() {
        System.out.println("são confortáveis");
    }
    
    public void aquecer() {
        System.out.println("mantem os pés aquecidos");
    }

}
