package classes;

public class Teste_Calcado {

	public static void main(String[] args) {
		
		Calcado [] estoque = new Calcado [5];
		estoque [0] = new Calcado ("Tenis", "Adidas", 39);
		estoque [1] = new Calcado ("Anabela", "Amaro", 34);
		estoque [2] = new Calcado ("Tenis", "New Balance", 41);
		estoque [3] = new Calcado ("Oxford", "Ramarin", 36);
		estoque [4] = new Calcado ("Sapatenis", "Lacoste", 43);
		
		System.out.println( "\n"+ "============= Classe  Calçados =============" + " \t");
		for(int i1=0; i1<5; i1++) {
			System.out.println("- Modelo: "+ estoque[i1].getModelo() + " \n" + "- Marca: "+ estoque[i1].getMarca() + " \n" + "- Numeração: "+ estoque[i1].getNumeracao() + " \t" + " \n");
			estoque[i1].aquecer();
		}
		
	}

}