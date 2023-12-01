package Telas;

import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import Repositorio.Componentes;

public class TelaMenu extends TelaPadrao {

	public TelaMenu() {
		super("Tela Menu");
		menu();
		titulo();
		//randomTela();
		setVisible(true);
	}
	private JMenuBar menuBar;
	private JMenu menunu;
	private JButton deletar;
	
	//Ira ter todas as informçoes
	public void menu() {
		menunu =  Componentes.addJmenu(this, menuBar,"options",0, 30, 750, 95);
		JMenuItem menuCadastroUsuario = Componentes.addMenuItem(menunu,"Cadastro Usuarios");
		
	}
	//Vai randomisar telas
	/*public void randomTela() {
		
	}*/
	
	
	public void titulo() {
		JFrame minhaTela = new JFrame();
        Componentes.adicionarTitulo("Meu Título", 10, 10, 200, 50);
        minhaTela.setVisible(true);
        }
	
	

	
}
