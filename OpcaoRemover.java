package br.com.SistemaOuvidoria.terminal.opcoes;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class OpcaoRemover {

	public static void pesquisarRemover(ArrayList<String> listaOcorrencias) {
		if (listaOcorrencias.size() > 0) {
			String ocorrencias = "- Lista de Ocorrências:\n";
			for (int i = 0; i < listaOcorrencias.size(); i++) {
				ocorrencias += "- Código " + (i + 1) + " corresponde à ocorrência: " + listaOcorrencias.get(i) + "\n";
			}
			JOptionPane.showMessageDialog(null, ocorrencias);

			String codigoExclusaoStr = JOptionPane
					.showInputDialog("- Digite o código da ocorrência que deseja excluir:");
			int codigoExclusao = Integer.parseInt(codigoExclusaoStr);

			if (codigoExclusao >= 1 && codigoExclusao <= listaOcorrencias.size()) {
				listaOcorrencias.remove(codigoExclusao - 1);
				JOptionPane.showMessageDialog(null, "- Ocorrência excluída com sucesso!");
			} else {
				JOptionPane.showMessageDialog(null, "- Código de ocorrência inválido.");
			}
		} else {
			JOptionPane.showMessageDialog(null, "- Não há ocorrências registradas.");
		}
	}
}