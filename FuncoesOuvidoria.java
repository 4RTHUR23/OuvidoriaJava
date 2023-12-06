package br.com.Ouvidoria;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class FuncoesOuvidoria {


	public static void listarOcorrencias(ArrayList<String> listaOcorrencias) {
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

	public static void adicionarOcorrencias(ArrayList<String> listaOcorrencias) {

		String novaOcorrencia = JOptionPane.showInputDialog("- Digite a nova Ocorrência:");
		listaOcorrencias.add(novaOcorrencia);
		JOptionPane.showMessageDialog(null, "- Ocorrência adicionada com sucesso!");

	}

	public static void pesquisarERemoverOcorrencias(ArrayList<String> listaOcorrencias) {
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

	public static void pesquisarOcorrenciaPeloCodigo(ArrayList<String> listaOcorrencias) {
		if (listaOcorrencias.size() > 0) {
			String codigoParaPesquisaSTR = JOptionPane.showInputDialog("- Digite o código da ocorrência:");
			int codigo = Integer.parseInt(codigoParaPesquisaSTR);

			if (codigo >= 1 && codigo <= listaOcorrencias.size()) {
				String ocorrenciaEncontrada = listaOcorrencias.get(codigo - 1);
				JOptionPane.showMessageDialog(null, "Ocorrência encontrada:\n" + ocorrenciaEncontrada);
			} else {
				JOptionPane.showMessageDialog(null, "Ocorrência não encontrada para o código: " + codigo);
			}
		} else {
			JOptionPane.showMessageDialog(null, "- Não há ocorrências registradas.");
		}

	}

}
