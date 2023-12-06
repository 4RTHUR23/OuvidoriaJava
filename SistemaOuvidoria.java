package br.com.Ouvidoria;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class SistemaOuvidoria {

	public static void main(String[] args) {
		ArrayList<String> listaOcorrencias = new ArrayList<String>();
		int opcao = 0;

		while (opcao != 5) {
			String input = JOptionPane.showInputDialog("Sistema De Ouvidoria\n" + "- Selecione uma opção:\n"
					+ "1- Visualizar ocorrências\n" + "2- Cadastrar nova ocorrência\n" + "3- Excluir ocorrência\n"
					+ "4- Pesquisar ocorrência pelo código\n" + "5- Sair\n" + "- Digite a sua opção:");
			opcao = Integer.parseInt(input);

			if (opcao == 1) {
				FuncoesOuvidoria.listarOcorrencias(listaOcorrencias);
			} else if (opcao == 2) {
				FuncoesOuvidoria.adicionarOcorrencias(listaOcorrencias);
			} else if (opcao == 3) {
				FuncoesOuvidoria.pesquisarERemoverOcorrencias(listaOcorrencias);
			} else if (opcao == 4) {
				FuncoesOuvidoria.pesquisarOcorrenciaPeloCodigo(listaOcorrencias);
			} else if (opcao != 5) {
				JOptionPane.showMessageDialog(null, "- Opção Inválida");
			}
		}

		JOptionPane.showMessageDialog(null, "- Obrigado, até a próxima!");
	}

}
