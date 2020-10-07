package classes;

public class IntrumentoMusical {
	
	private String modelo;
    private String material;
    private String grupo; //metais, madeiras, cordas, percussão
    private String alturaSom; // soprano, alto, tenor, baritonos, baixos
    private int anoFabricacao;
	
    
    public IntrumentoMusical(String modelo, String grupo, String alturaSom) {
		this.setModelo(modelo);
		this.setGrupo(grupo);
		this.setAlturaSom(alturaSom);
	}

    //getters
	public String getModelo() {	return modelo;}
	public String getMaterial() { return material;}
	public String getGrupo() { return grupo;}
	public String getAlturaSom() { return alturaSom;}
	public int getAnoFabricacao() {	return anoFabricacao;}

	//setters
	public void setModelo(String modelo) { this.modelo = modelo;}
	public void setMaterial(String material) { this.material = material;}
	public void setGrupo(String grupo) { this.grupo = grupo;}
	public void setAlturaSom(String alturaSom) { this.alturaSom = alturaSom;}
	public void setAnoFabricacao(int anoFabricacao) { this.anoFabricacao = anoFabricacao;}
	
	
	// metodos de classe: soar, silenciar, tocar
    public void soar() {
        System.out.println("Que som maravilhoso");
    }
    
    public void silenciar() {
        System.out.println("Acho lindo quando não está fazendo som (risos)");
    }
    
    public void tocar() {
        System.out.println("Poderia aprender a tocar");
    }
    
    

}
