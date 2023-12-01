package br.com.SistemaOuvidoria.terminal.opcoes;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class OpcaoAdicionar {

	public static void adicionarOcorrencias(ArrayList<String> listaOcorrencias) {
		
		String novaOcorrencia = JOptionPane.showInputDialog("- Digite a nova Ocorrência:");
		listaOcorrencias.add(novaOcorrencia);
		JOptionPane.showMessageDialog(null, "- Ocorrência adicionada com sucesso!");
		
	}
}
