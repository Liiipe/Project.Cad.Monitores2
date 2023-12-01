package Menssagens;

import javax.swing.JOptionPane;

public class MensageiroDeUsuario {
	
	
	public static void usuarioSalvo() {
		JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
	}

	public static void usuarioSenhaErrada() {
		JOptionPane.showMessageDialog(null, "As senhas nao sao iguais!");
	}

	public static void usuarioCampoVazio() {
		JOptionPane.showMessageDialog(null, "Campo/s vazio/s!");
	}

	public static void usuarioExcluir() {
		JOptionPane.showMessageDialog(null, "Usuario exluido com sucesso!");
	}

	public static void usuarioNaoEncontrado() {
		JOptionPane.showMessageDialog(null, "Usuario nao encontrado!");
	}

	public static void usuarioErro() {
		JOptionPane.showMessageDialog(null, "Houve algum erro na criacao de sua conta. tente novamente!");
	}
}
