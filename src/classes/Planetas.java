package classes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Planetas {
	
	ArrayList<Planeta> planetlist = new ArrayList<>();
	Planeta [] planet = new Planeta [8];{
		planet [0] = new Planeta ("Mercurio");
		planet[0].setCuriosidades("- CURIOSIDADE - \n MERCURIO teve o seu nome atribuído pelos romanos baseado no mensageiro dos deuses,\n de asas nos pés, porque parecia mover-se mais depressa do que qualquer outro planeta.");
		planet [1] = new Planeta ("Vênus");
		planet[1].setCuriosidades("- CURIOSIDADE - \n O segundo planeta do sistema solar leva cerca de 243 dias terrestres para dar uma \n volta em si mesmo. E leva apenas 225 dias para dar uma volta inteira em \n volta ao redor do sol. Ou seja, os dias em Vênus são mais longos que os anos.");
		planet [2] = new Planeta ("Terra");
		planet[2].setCuriosidades("- CURIOSIDADE - \n Existe um reservatório de água nas profundezas da crosta terrestre que contém um \n volume três vezes superior ao de todos os oceanos da Terra");
		planet [3] = new Planeta ("Marte");
		planet[3].setCuriosidades("- CURIOSIDADE - \n A distância de Marte ao Sol é de 228 milhões de quilômetros. O tempo de duração do \n movimento de rotação desse planeta é de 24 horas e 34 minutos, portanto,\n esse é o tempo de um dia em Marte. Já a duração dos anos é de 687 dias terrestres.");
		planet [4] = new Planeta ("Júpiter");
		planet[4].setCuriosidades("- CURIOSIDADE - \n Quem batizou o planeta foram os romanos, homenageando o Senhor do Céu, o chefe \n supremo de sua mitologia que corresponde a Zeus na mitologia grega. Nada mais \n justo que o maior planeta de todo o Sistema Solar recebesse o nome do deus dos deuses, Júpiter. ");
		planet [5] = new Planeta ("Saturno");
		planet[5].setCuriosidades("- CURIOSIDADE - \n Saturno é o recordista como o planeta com mais luas no Sistema Solar, 82 no total,\n a frente de Júpiter, que possui 67. Algumas das luas de Saturno são gigantes,\n como Titã, a segunda maior lua do Sistema Solar. Porém, a maioria é pequena,\n com apenas alguns quilômetros de diâmetro, e que não possuem nem nomes oficiais.");
		planet [6] = new Planeta ("Urano");
		planet[6].setCuriosidades("- CURIOSIDADE - \n A atmosfera de Urano é constituída, principalmente, de hidrogênio, hélio e metano.\n A temperatura na superfície chega a 216ºC negativos. A cor azulada resulta da \n absorção de luz vermelha do metano nas camadas superiores da atmosfera.");
		planet [7] = new Planeta ("Netuno");
		planet[7].setCuriosidades("- CURIOSIDADE - \n Como um típico planeta gasoso, Netuno possui ventos muito velozes confinados em bandas \n de latitudes e grandes tempestades. Os ventos em Netuno são os mais rápidos \n do sistema solar chegando a velocidades de até 2000 km/h.\r\n" + 
				"\r\n" + 
				"Da mesma maneira que Júpiter e Saturno, Netuno também possui uma fonte interna de calor e irradia mais do dobro da energia que recebe do Sol.");
	
	}
	


	private JFrame frame;

	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Planetas window = new Planetas();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Planetas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel textplaneta = new JLabel("Escolha o planeta que deseja conhecer:");
		textplaneta.setFont(new Font("Arial Black", Font.PLAIN, 12));
		textplaneta.setBounds(88, 38, 298, 54);
		frame.getContentPane().add(textplaneta);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBox.setBounds(89, 103, 270, 44);
		comboBox.addItem("-");
		int i;
		for(i=0; i<8; i++) {
			comboBox.addItem(planet[i].getNome());
		}
		comboBox.addItem(planet[0].getNome());
		
		
		frame.getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("Selecionar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int j;
				for (j=0; j<8; j++) {
					if (comboBox.getSelectedItem().toString() == planet[j].getNome()) {
						JOptionPane.showMessageDialog(null, planet[j].getCuriosidades(), planet[j].getNome(), JOptionPane.INFORMATION_MESSAGE);
					}
					
				}
								
			}
		});
		btnNewButton.setBounds(166, 170, 117, 33);
		
		frame.getContentPane().add(btnNewButton);
	}
}
