package classes;

public class Alunos {
	private String nome;
    private int semestre;
    private String curso;
    private int matricula; 
    private double mediaAtual;

    //construtor
  	public Alunos(String nome, int semestre, String curso, int matricula, double d) {
  		this.setNome(nome);
  		this.setSemestre(semestre);
  		this.setCurso(curso);
  		this.setMatricula(matricula);
  		this.setMediaAtual(d);
  	}
        
    //getters
    public String getNome() {return nome;}
	public int getSemestre() {return semestre;}
	public String getCurso() {return curso;	}
	public int getMatricula() {return matricula;}
	public double getMediaAtual() {return mediaAtual;}
	
	//setters
	public void setNome(String nome) {this.nome = nome;	}
	public void setSemestre(int semestre) {this.semestre = semestre;}
	public void setCurso(String curso) {this.curso = curso;	}
	public void setMatricula(int matricula) {this.matricula = matricula;}
	public void setMediaAtual(double d) {this.mediaAtual = d;}
	    
    
    //metodos de classe
	
	public void estudar() {
        System.out.println("estuda na FATEC");
    }
    
    public void frequentar() {
        System.out.println("possui ótima frequencia");
    }
    
    public void aprender() {
        System.out.println("aprende a aprender!");
    }
    
    

}
