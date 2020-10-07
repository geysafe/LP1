package classes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JToggleButton;

public class Calcado_primeira {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calcado_primeira window = new Calcado_primeira();
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
	public Calcado_primeira() {
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
		
	
		JLabel lblNewLabel = new JLabel("Modelo:");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel.setBounds(37, 24, 98, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setFont(new Font("Arial", Font.PLAIN, 12));
		lblMarca.setBounds(37, 60, 98, 14);
		frame.getContentPane().add(lblMarca);
		
		JLabel lblNumerao = new JLabel("Numera\u00E7\u00E3o:");
		lblNumerao.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNumerao.setBounds(37, 94, 98, 14);
		frame.getContentPane().add(lblNumerao);
		
		JLabel lblFinalidade = new JLabel("Finalidade:");
		lblFinalidade.setFont(new Font("Arial", Font.PLAIN, 12));
		lblFinalidade.setBounds(37, 130, 98, 14);
		frame.getContentPane().add(lblFinalidade);
		
		JComboBox finalidade = new JComboBox();
		finalidade.setBounds(121, 128, 114, 20);
		finalidade.addItem("-");
		finalidade.addItem("ESPORTE");
		finalidade.addItem("SOCIAL");
		finalidade.addItem("FESTA");
		finalidade.addItem("CASUAL");
		frame.getContentPane().add(finalidade);
		
		
		JComboBox numeracao = new JComboBox();
		numeracao.setBounds(121, 92, 69, 20);
		numeracao.addItem("-");
		numeracao.addItem("34");
		numeracao.addItem("35");
		numeracao.addItem("36");
		numeracao.addItem("37");
		numeracao.addItem("38");
		numeracao.addItem("39");
		numeracao.addItem("40");
		numeracao.addItem("41");
		numeracao.addItem("42");
		numeracao.addItem("43");
		frame.getContentPane().add(numeracao);

		
		JComboBox marcas = new JComboBox();
		marcas.setBounds(88, 58, 147, 20);
		marcas.addItem("-");
		marcas.addItem("Anacapri");
		marcas.addItem("Arezzo");
		marcas.addItem("Bottero");
		marcas.addItem("Luiza Barcelos");
		marcas.addItem("Moleca");
		marcas.addItem("Ramarim");
		marcas.addItem("Santa Lolla");
		marcas.addItem("Schutz");		
		marcas.addItem("Via Marte");
		marcas.addItem("Vizzano");
		frame.getContentPane().add(marcas);
		
		JComboBox modelos = new JComboBox();
		modelos.setBounds(88, 22, 147, 20);
		modelos.addItem("-");
		modelos.addItem("Anabela");
		modelos.addItem("Botas");
		modelos.addItem("Plataforma");
		modelos.addItem("Salto");
		modelos.addItem("Sapatilha");
		modelos.addItem("Sapatos");
		modelos.addItem("Tênis");
		frame.getContentPane().add(modelos);

		//botão de cadastro
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null,"Modelo: "+modelos.getSelectedItem().toString()+"\nMarcas: "+marcas.getSelectedItem().toString()+"\nNúmero: "+numeracao.getSelectedItem().toString(), "Confirmar cadastro?", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnCadastrar.setBounds(163, 193, 114, 32);
		frame.getContentPane().add(btnCadastrar);
	}
}
