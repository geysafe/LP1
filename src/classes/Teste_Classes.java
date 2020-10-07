package classes;

public class Teste_Classes {

	public static void main(String[] args) {
		
		Alunos [] alunosfatec = new Alunos [5];
		alunosfatec[0] = new Alunos ("Olivia", 3, "Banco de Dados", 123456, 5.4);
		alunosfatec[1] = new Alunos ("Fatima", 1, "Gestão da Produção Industrial ", 987456, 9.4);
		alunosfatec[2] = new Alunos ("Jefferson", 6, "Analise e Desenvolvimento de sistemas", 456987, 7.6);
		alunosfatec[3] = new Alunos ("Gal", 2, "Logística", 147852, 6.2);
		alunosfatec[4] = new Alunos ("Samuel", 4, "Manutenção de Aeronaves", 963258, 8.4);
		
		
		System.out.println("============= Classe  Alunos FATEC SJC =============" + " \t");
		for(int i=0; i<5; i++) {
			System.out.println("=> " + alunosfatec[i].getNome()  +  " cursa o " + alunosfatec[i].getSemestre() + " semestre de " + alunosfatec[i].getCurso() + " \t");
		

	}
}
}
