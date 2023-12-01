package Repositorio;

import java.util.ArrayList;

import Pessoas.Coordenador;

public class CentralDeTudo {
	
	private ArrayList<Coordenador> adm = new ArrayList<>();
	
	
	public ArrayList<Coordenador> getAdm() {
		return adm;
	}

	void setAdm(ArrayList<Coordenador> adm) {
		this.adm = adm;
	}
	
	public Coordenador retornaADM(String email) {// QUANDO FOR LISTAR NAO E PRA LISTAR ADM!

		for (int i = 0; i < adm.size(); i++) {
			if (adm.get(i).getEmail().equals(email)) {
				return adm.get(i);
			}
		}
		return null;
	}
	
	public boolean isLogado(String email, String Senha) {
		for (int i = 0; i < adm.size(); i++) {
			if (adm.get(i).getEmail().equals(email) && adm.get(i).getSenha().equals(Senha)) {
				return true;
			}
		}
		return false;
	}

}
