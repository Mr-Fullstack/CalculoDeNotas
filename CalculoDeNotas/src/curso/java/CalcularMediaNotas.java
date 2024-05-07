package curso.java;

import javax.swing.JOptionPane;

public class CalcularMediaNotas {

	public static void main(String[] args) {
		double notas = 0 ;
		int quantidadeNotas =0;
		int confirmacao = JOptionPane.YES_OPTION;
		
		
		while(confirmacao == JOptionPane.YES_OPTION) {
			String novaNota = JOptionPane.showInputDialog("Digite uma nota");
			if(novaNota != "" && novaNota != null ) {
				notas += Double.parseDouble(novaNota);
				quantidadeNotas++;
				confirmacao = JOptionPane.showConfirmDialog(null, "Deseja adicionar mais uma nota");
			}
			if(novaNota == null || confirmacao == JOptionPane.NO_OPTION ) {
				break;
			}
		}
		double media = notas / quantidadeNotas;
		
		if(Double.isNaN(media)) {
			JOptionPane.showMessageDialog(null, "Não foi possivel calcular a média das notas!");
		}else {
			JOptionPane.showMessageDialog(null, "Médias das notas é:" + media );
		}

	}

}
