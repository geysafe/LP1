package classes;

public class Pessoa {
	private String nome;
    private String sexo;
    private int idade;
    private float altura;
    private Date nascimento;
	
    
    public Pessoa(String nome, String sexo, int idade, float altura, Date nascimento) {
		this.setNome(nome);
		this.setSexo(sexo);
		this.setIdade(idade);
		this.setAltura(altura);
		this.setNascimento(nascimento);
	}

    //getters
	public String getNome() { return nome;}
	public String getSexo() { return sexo;}
	public int getIdade() { return idade;}
	public float getAltura() { return altura;}
	public Date getNascimento() { return nascimento;}

    //setters
	public void setNome(String nome) { 	this.nome = nome;}
	public void setSexo(String sexo) { this.sexo = sexo;}
	public void setIdade(int idade) { this.idade = idade;}
	public void setAltura(float altura) { this.altura = altura;}
	public void setNascimento(Date nascimento) { this.nascimento = nascimento;}
    
    
	 // metodos de classe: andar, correr, pedalar	
		public void andar() {
	        System.out.println("Acha caminhada maravilhoso pra saúde");
	    }
	    
	    public void correr() {
	        System.out.println("Está aprendendo a correr");
	    }
	    
	    public void pedalar() {
	        System.out.println("Prefere mesmo de pedalar!");
	    }
    
	    

}
