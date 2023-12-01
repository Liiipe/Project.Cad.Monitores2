package Ouvintes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PersistenceDelegate;

import Menssagens.MensageiroDeUsuario;
import Pessoas.Coordenador;
import Repositorio.CentralDeTudo;
import Repositorio.Persistencia;
import Telas.TelaLogin;
import Telas.TelaMenu;

public class OuvinteTelaLogin implements ActionListener {
	
	TelaLogin telaLogin ;
	
	public OuvinteTelaLogin(TelaLogin telaDeLogin) {
		this.telaLogin = telaDeLogin;	
	}
	public void actionPerformed(ActionEvent e) {
		
		Persistencia persistenci = new Persistencia();
		CentralDeTudo central = persistenci.recuperarCentral();
		
		String eMail = telaLogin.getEmail().getText();
		String senha = telaLogin.getPassword().getText();
		
		if(eMail.isBlank() || senha.isBlank()) {
			MensageiroDeUsuario.usuarioCampoVazio();
		}else {
			if(central.isLogado(eMail, senha)) {
				Coordenador adm = central.retornaADM(eMail);
				new TelaMenu();
				telaLogin.setVisible(false);
			}else {
				MensageiroDeUsuario.usuarioNaoEncontrado();
			}
		}
		
	}

}
