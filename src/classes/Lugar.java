package classes;

public class Lugar {
	private String cidade;
    private String pais;
    private String moeda;
    private int orcamento;
    private float distancia;
	
    
    public Lugar(String cidade, String pais, String moeda, int orcamento) {
		this.setCidade(cidade);
		this.setPais(pais);
		this.setMoeda(moeda);
		this.setOrcamento(orcamento);
	}

    //getters
	public String getCidade() {	return cidade;}
	public String getPais() { return pais;}
	public String getMoeda() { return moeda;}
	public int getOrcamento() {	return orcamento;}
	public float getDistancia() { return distancia;	}

	//setters
	public void setCidade(String cidade) { this.cidade = cidade;}
	public void setPais(String pais) { this.pais = pais;}
	public void setMoeda(String moeda) { this.moeda = moeda;}
	public void setOrcamento(int orcamento) { this.orcamento = orcamento;}
	public void setDistancia(float distancia) {	this.distancia = distancia;	}
    
    
	// metodos de classe: viajar, morar, retornar
    public void viajar() {
        System.out.println("Vamos viajar!");
    }
    
    public void retornar() {
        System.out.println("Hora de voltar pra casa");
    }
    
    public void morar() {
        System.out.println("Talvez seja um bom lugar para morar");
    }
	

}
