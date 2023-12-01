package Telas;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Ouvintes.OuvinteBotaoVoltar;
import Repositorio.CentralDeTudo;
import Repositorio.Componentes;
import Repositorio.Persistencia;




public class TelaDeCadastro extends TelaPadrao {
	
	public TelaDeCadastro(String Titulo) {
		super(Titulo);
		// TODO Auto-generated constructor stub
	}
	Persistencia persistenci = new Persistencia();
	CentralDeTudo central = persistenci.recuperarCentral();
	
	public TelaDeCadastro() {
		super("Tela de Cadastro");
		setSize(800, 900);
		//botao();
		tituloTela();
		
	}
	private JComboBox<String> opcao;
	private JTextField indentificador;
	private JTextField indentificadorCPF;
	private JTextField nome;
	private JTextField email;
	private JPasswordField senha;
	private JPasswordField confimarsenha;
	private JButton cadastrar;
	private JButton voltar;
	
	public void botao() {
		Ouvintes.OuvinteTelaCadastro ouvinteBotaoCadastro = new Ouvintes.OuvinteTelaCadastro(this);
		cadastrar = Componentes.addButao(this, "Cadastrar", 160, 510, 260, 30);
		cadastrar.addActionListener(ouvinteBotaoCadastro);
		if (central.getAdm().size() != 0) {
			voltar = Componentes.addButao(this, "Voltar", 160, 550, 260, 30);
			voltar.addActionListener(new OuvinteBotaoVoltar(this));
		}
	}
	public void comobox() {
		
	}
	
	public void tituloTela() {
		Componentes.adicionarTitulo(null, 0, 0, 850, 95);
	}
	public JComboBox<String> getOpcao() {
		return opcao;
	}
	public void setOpcao(JComboBox<String> opcao) {
		this.opcao = opcao;
	}
	public JTextField getIndentificador() {
		return indentificador;
	}
	public void setIndentificador(JTextField indentificador) {
		this.indentificador = indentificador;
	}
	public JTextField getIndentificadorCPF() {
		return indentificadorCPF;
	}
	public void setIndentificadorCPF(JTextField indentificadorCPF) {
		this.indentificadorCPF = indentificadorCPF;
	}
	public JTextField getNome() {
		return nome;
	}
	public void setNome(JTextField nome) {
		this.nome = nome;
	}
	public JTextField getEmail() {
		return email;
	}
	public void setEmail(JTextField email) {
		this.email = email;
	}
	public JPasswordField getSenha() {
		return senha;
	}
	public void setSenha(JPasswordField senha) {
		this.senha = senha;
	}
	public JPasswordField getConfimarsenha() {
		return confimarsenha;
	}
	public void setConfimarsenha(JPasswordField confimarsenha) {
		this.confimarsenha = confimarsenha;
	}
	public JButton getCadastrar() {
		return cadastrar;
	}
	public void setCadastrar(JButton cadastrar) {
		this.cadastrar = cadastrar;
	}
	public JButton getVoltar() {
		return voltar;
	}
	public void setVoltar(JButton voltar) {
		this.voltar = voltar;
	}
	
	
}
