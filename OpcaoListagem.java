package br.com.SistemaOuvidoria.terminal.opcoes;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class OpcaoListagem {

	public static void exibirOcorrencias(ArrayList<String> listaOcorrencias) {
		if (listaOcorrencias.size() > 0) {
			String ocorrencias = "- Lista de Ocorrências:\n"; 
			for (String ocorrencia : listaOcorrencias) {
				ocorrencias += "- " + ocorrencia + "\n";
			}
			JOptionPane.showMessageDialog(null, ocorrencias);
		} else {
			JOptionPane.showMessageDialog(null, "- Não há ocorrências registradas.");
		}
	}
}
