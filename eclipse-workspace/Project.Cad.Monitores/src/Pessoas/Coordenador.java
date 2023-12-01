package Pessoas;

@Entity
public class Coordenador extends Usuario {
	
	public Coordenador(String nome, String email, String senha) {
		super(nome, email, senha);
	
	}
	@Override
	public String toString() {
		return "O ADM - " + getNome();
	}

	
	
}
