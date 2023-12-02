package Repositorio;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public abstract class Componentes {
	public static JLabel adicionarTitulo(String txt, int x, int y, int comprimento, int altura) {
        ImageIcon icon = new ImageIcon("icons8-dragão-50.png");
        JLabel jLabel = new JLabel(txt, icon, JLabel.LEFT);
        jLabel.setBounds(x, y, comprimento, altura);
        jLabel.setFont(new Font("Impact", Font.ITALIC, 50));
        jLabel.setOpaque(true);
        jLabel.setBackground(Color.CYAN);
        jLabel.setForeground(Color.blue);
        return jLabel;
        
    }
	
	
	/*public static JLabel adicionarTitulo(JFrame tela, String txt, int x, int y, int comprimento, int altura) {
		ImageIcon icon = new ImageIcon("icons8-dragão-50.png");
		JLabel jLabel = new JLabel(txt, icon, JLabel.LEFT);
		jLabel.setBounds(x, y, comprimento, altura);
		jLabel.setFont(new Font("Impact", Font.ITALIC, 50));
		jLabel.setOpaque(true);
		jLabel.setBackground(Color.darkGray);
		jLabel.setForeground(Color.BLACK);
		tela.add(jLabel);
		return jLabel;

	}*/
	
	public static JMenu addJmenu(JFrame tela, JMenuBar menuBar, String txt, int x, int y, int comprimento, int altura) {
	    if (menuBar == null) {
	        menuBar = new JMenuBar();
	        tela.setJMenuBar(menuBar);
	    }

	    JMenu menu = new JMenu(txt);
	    menu.setBounds(x, y, comprimento, altura);
	    menu.setOpaque(true);
	    menu.setBackground(Color.BLACK);
	    menu.setForeground(Color.CYAN);
	    menu.setMnemonic('o');
	    menuBar.add(menu);

	    return menu;
	}
	
	/*public static JLabel radomizadorDeTela(JFrame tela, int x, int y, int comprimento, int altura) {

		JLabel jLabel = new JLabel();
		jLabel.setIcon(new ImageIcon(SorteioDeImagens.sorteioDeTela()));
		jLabel.setBounds(x, y, comprimento, altura);
		tela.add(jLabel);
		return jLabel;
	}*/
	
	// CRIA UM BLOCO DE TEXTO.
		public static JTextField addTexto(JFrame tela, int x, int y, int comprimento, int altura) {
			JTextField texto = new JTextField();
			texto.setBounds(x, y, comprimento, altura);
			tela.add(texto);
			return texto;
		}
	
	public static JMenu addJmenu1(JFrame tela, JMenuBar menuBar, String txt, int x, int y, int comprimento, int altura) {
		menuBar = new JMenuBar();
		tela.setJMenuBar(menuBar);
		JMenu menu = new JMenu(txt);
		menu.setBounds(x, y, comprimento, altura);
		menu.setOpaque(true);
		menu.setBackground(Color.BLACK);
		menu.setForeground(Color.CYAN);
		menu.setMnemonic('o');
		menuBar.add(menu);

		return menu;
	}
	// CRIAR JMENUITEM:
		public static JMenuItem addMenuItem(JMenu menu, String txt) {
			JMenuItem menuItem = new JMenuItem(txt);
			menuItem.setOpaque(true);
			menuItem.setBackground(Color.BLACK);
			menuItem.setForeground(Color.MAGENTA);
			menu.add(menuItem);

			return menuItem;
		}
		
		public static JLabel addLabelSemCor(JFrame tela, String nome, int x, int y, int comprimento, int altura) {
			JLabel label = new JLabel(nome);
			label.setBounds(x, y, comprimento, altura);
			label.setVerticalTextPosition(SwingConstants.BOTTOM);
			label.setHorizontalTextPosition(SwingConstants.CENTER);
			label.setForeground(Color.MAGENTA);
			// label.setBackground(Color.DARK_GRAY);
			tela.add(label);
			return label;

		}
		
		// CRIA UMA lABEL OU TEXTO DE REFERENCIA.
		public static JLabel addLabel(JFrame tela, String nome, int x, int y, int comprimento, int altura) {
			JLabel label = new JLabel(nome);
			label.setBounds(x, y, comprimento, altura);
			label.setVerticalTextPosition(SwingConstants.BOTTOM);
			label.setHorizontalTextPosition(SwingConstants.CENTER);
			label.setOpaque(true);
			label.setForeground(Color.MAGENTA);
			label.setBackground(Color.BLACK);
			tela.add(label);
			return label;

		}
		
		// CRIA UM BOTAO..
		public static JButton addButao(JFrame tela, String nome, int x, int y, int comprimento, int altura) {
			JButton botao = new JButton(nome);
			botao.setBounds(x, y, comprimento, altura);
			botao.setVerticalTextPosition(SwingConstants.BOTTOM);
			botao.setHorizontalTextPosition(SwingConstants.CENTER);
			botao.setForeground(Color.MAGENTA);
			tela.add(botao);
			return botao;
		}
		
		// ADICIONA ICONE DE LOGIN
		public static JLabel adicionarIcone(JFrame tela, int x, int y, int comprimento, int altura) {
			ImageIcon icone = new ImageIcon("Figuras/icons8-login-64.png");
			JLabel label = new JLabel(icone);
			label.setBounds(x, y, comprimento, altura);
			tela.add(label);
			return label;
		}
		
		// CRIA PASSWORDFIELD.
		public static JPasswordField adicionarPasswordField(JFrame tela, int x, int y, int comprimento, int altura) {
			JPasswordField password = new JPasswordField();
			password.setBounds(x, y, comprimento, altura);
			tela.add(password);
			return password;

		}

}
