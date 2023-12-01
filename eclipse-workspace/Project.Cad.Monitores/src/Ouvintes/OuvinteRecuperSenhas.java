package Ouvintes;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;

import Pessoas.Usuario;
import Repositorio.CentralDeTudo;
import Repositorio.Persistencia;
import Telas.TelaLogin;



public class OuvinteRecuperSenhas implements MouseListener{
	
	private TelaLogin tela;
	private JLabel label;
	private String labelTextFlag;
	
	public OuvinteRecuperSenhas(TelaLogin telaLogin, JLabel label) {
		super();
		this.tela = telaLogin;
		this.label = label;
		this.labelTextFlag = label.getText();
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public void mouseClicked(MouseEvent e) {
		Persistencia persistencia = new Persistencia();
		CentralDeTudo central = persistencia.recuperarCentral();
		String email = tela.getEmail().getText();
		
		Usuario estouValido = central.retornaADM(email);
		if (estouValido != null) {
			
		}
		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
