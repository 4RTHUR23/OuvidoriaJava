package br.com.SistemaOuvidoria.terminal.opcoes;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class SistemaOuvidoria {

	public static void main(String[] args) {
		ArrayList<String> listaOcorrencias = new ArrayList<>();
		int opcao = 0;

		while (opcao != 4) {
			String input = JOptionPane.showInputDialog("Sistema De Ouvidoria\n" + "Selecione uma opção:\n"
					+ "1- Visualizar ocorrências\n" + "2- Cadastrar nova ocorrência\n" + "3- Excluir ocorrência\n"
					+ "4- Sair\n\n" + "- Digite a sua opção abaixo:");
			opcao = Integer.parseInt(input);

			if (opcao == 1) {
				OpcaoListagem.exibirOcorrencias(listaOcorrencias);
			} else if (opcao == 2) {
				OpcaoAdicionar.adicionarOcorrencias(listaOcorrencias);
			} else if (opcao == 3) {
				OpcaoRemover.pesquisarRemover(listaOcorrencias);
			} else if (opcao != 4) {
				JOptionPane.showMessageDialog(null, "- Opção Inválida");
			}
		}

		JOptionPane.showMessageDialog(null, "- Obrigado, até a próxima!");
	}
}
