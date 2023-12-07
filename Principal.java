package br.com.Ouvidoria;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Ouvidoria ouvidoria = new Ouvidoria();
        int opcao = 0;

        while (opcao != 5) {
            String input = JOptionPane.showInputDialog("Sistema De Ouvidoria\n" + "- Selecione uma opção:\n"
                    + "1- Visualizar ocorrências\n" + "2- Cadastrar nova ocorrência\n" + "3- Excluir ocorrência\n"
                    + "4- Pesquisar ocorrência pelo código\n" + "5- Sair\n" + "- Digite a sua opção:");
            opcao = Integer.parseInt(input);

            if (opcao == 1) {
            	String listagem = ouvidoria.listarOcorrencias();
                JOptionPane.showMessageDialog(null, listagem);
            } else if (opcao == 2) {
            	String novaOcorrencia = JOptionPane.showInputDialog("- Digite a nova Ocorrência:");
                String adicionando = ouvidoria.adicionarOcorrencias(novaOcorrencia);
                JOptionPane.showMessageDialog(null, adicionando);
            } else if (opcao == 3) {
            	String codigoExclusaoSTR = JOptionPane.showInputDialog("Digite o código da ocorrência para Remover:");
            	int codigoExclusao = Integer.parseInt(codigoExclusaoSTR);
                
            	String removendo = ouvidoria.RemoverOcorrencias(codigoExclusao);
                JOptionPane.showMessageDialog(null, removendo);
            } else if (opcao == 4) {
            	String codigoParaPesquisaSTR = JOptionPane.showInputDialog("- Digite o código da ocorrência para Pesquisa:");
            	int codigo = Integer.parseInt(codigoParaPesquisaSTR);
            	
            	String pesquisando = ouvidoria.pesquisarOcorrenciaPeloCodigo(codigo);
                JOptionPane.showMessageDialog(null, pesquisando);
            } else if (opcao != 5) {
            	JOptionPane.showMessageDialog(null, "- Opção Inválida");
            }
        }

        JOptionPane.showMessageDialog(null, "- Obrigado, até a próxima!");
    }
}
