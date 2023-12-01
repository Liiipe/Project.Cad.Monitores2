package Ouvintes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Menssagens.MensageiroDeUsuario;
import Pessoas.Coordenador;
import Repositorio.Persistencia;
import Telas.TelaDeCadastro;


public class OuvinteTelaCadastro<Usuario> implements ActionListener {
	TelaDeCadastro telaCadastro;
	Persistencia percistencia = new Persistencia();
	@Override
	public void actionPerformed(ActionEvent e) {
		String opcao = (String) telaCadastro.getOpcao().getSelectedItem();
		String indentificadorCPF = (String) telaCadastro.getIndentificador().getText();
		String nome  = telaCadastro.getNome().getText();
		String email  = telaCadastro.getEmail().getText();
		String password = telaCadastro.getSenha().getText();
		String confirmarSenha = telaCadastro.getConfimarsenha().getText();
		
		if (nome.isBlank() || email.isBlank() || password.isBlank() || confirmarSenha.isBlank()) {
			MensageiroDeUsuario.usuarioCampoVazio();
		}else if(!password.equals(confirmarSenha)) {
			MensageiroDeUsuario.usuarioSenhaErrada();
		} 
		
		}
	public OuvinteTelaCadastro(TelaDeCadastro tela) {
		this.telaCadastro = tela;
	}
	

}
