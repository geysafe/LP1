package classes;

public class Profissional {
	private String profissao;
    private boolean regulamentacao;
    private float salarioMinimo;
    private String areaAtuacao;
    private String escolaridade;
    
    
	public Profissional(String profissao, boolean regulamentacao, float salarioMinimo, String areaAtuacao,
			String escolaridade) {
		super();
		this.profissao = profissao;
		this.regulamentacao = regulamentacao;
		this.salarioMinimo = salarioMinimo;
		this.areaAtuacao = areaAtuacao;
		this.escolaridade = escolaridade;
	}

	//getters
	public String getProfissao() { return profissao;}
	public boolean isRegulamentacao() { return regulamentacao;}
	public float getSalarioMinimo() { return salarioMinimo;}
	public String getAreaAtuacao() { return areaAtuacao;}
	public String getEscolaridade() { return escolaridade;}

	//setters
	public void setProfissao(String profissao) { this.profissao = profissao;}
	public void setRegulamentacao(boolean regulamentacao) { this.regulamentacao = regulamentacao;}
	public void setSalarioMinimo(float salarioMinimo) { this.salarioMinimo = salarioMinimo;}
	public void setAreaAtuacao(String areaAtuacao) { this.areaAtuacao = areaAtuacao;}
	public void setEscolaridade(String escolaridade) { this.escolaridade = escolaridade;}
    
	 // metodos de classe: trabalhar

		public void trabalhar() {
	        System.out.println("Eu vou trabalhar");
	    }
	    
	    public void receber() {
	        System.out.println("O salário é ótimo!");
	    }
	    
	    public void estudar() {
	        System.out.println("Esta área exige muito estudo");
	    }
	
    

}
