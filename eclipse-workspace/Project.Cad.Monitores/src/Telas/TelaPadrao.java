package Telas;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public abstract class TelaPadrao extends JFrame {
	//Essa tela serve para criar outras tela...
	public TelaPadrao(String Titulo) {
		setTitle(Titulo);
		setSize(900, 800);
		setLocationRelativeTo(null);
		setLayout(null);
		setResizable(false);
		//addLookAndFeel();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public void addLookAndFeel() {
		try {
			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
