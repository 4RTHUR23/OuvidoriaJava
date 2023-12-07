package br.com.Ouvidoria;

import java.util.ArrayList;

public class FuncoesOuvidoria {

	private ArrayList<String> listaOcorrencias = new ArrayList<String>();

	public String listarOcorrencias() {
		if (listaOcorrencias.size() > 0) {
			String ocorrencias = "- Lista de Ocorrências:\n";
			for (String ocorrencia : listaOcorrencias) {
				ocorrencias += "- " + ocorrencia + "\n";
			}
			return ocorrencias;
		} else {
			return "- Não há ocorrências registradas.";
		}
	}

	public String adicionarOcorrencias(String novaOcorrencia) {
		listaOcorrencias.add(novaOcorrencia);
		return "- Ocorrência adicionada com sucesso!";
	}

	public String RemoverOcorrencias(int codigoExclusao) {
		if (codigoExclusao >= 1 && codigoExclusao <= listaOcorrencias.size()) {
			listaOcorrencias.remove(codigoExclusao - 1);
			return "- Ocorrência excluída com sucesso!";
		} else {
			return "- Código da ocorrência inexistente.";
		}
	}

	public String pesquisarOcorrenciaPeloCodigo(int codigoParaPesquisa) {
		if (codigoParaPesquisa >= 1 && codigoParaPesquisa <= listaOcorrencias.size()) {
			String ocorrenciaEncontrada = listaOcorrencias.get(codigoParaPesquisa - 1);
			return "Ocorrência encontrada:\n" + ocorrenciaEncontrada;
		} else {
			return "Ocorrência não encontrada para o código: " + codigoParaPesquisa;
		}

	}

}
