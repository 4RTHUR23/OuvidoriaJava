package br.com.Ouvidoria;

import java.util.ArrayList;

public class Ouvidoria {

	private ArrayList<Ocorrencias> listaOcorrencias = new ArrayList<Ocorrencias>();

	public String listarOcorrencias() {
		if (listaOcorrencias.size() > 0) {
			String ocorrencias = "- Lista de Ocorrências:\n";
			for (Ocorrencias ocorrencia : listaOcorrencias) {
				ocorrencias += "- " + ocorrencia.getDescricaoDaOcorrencia() + "\n";
			}
			return ocorrencias;
		} else {
			return "- Não há ocorrências registradas.";
		}
	}

	public String adicionarOcorrencias(Ocorrencias novaOcorrencia) {
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
			Ocorrencias ocorrenciaEncontrada = listaOcorrencias.get(codigoParaPesquisa - 1);
			return "Ocorrência encontrada:\n" + ocorrenciaEncontrada;
		} else {
			return "Ocorrência não encontrada para o código: " + codigoParaPesquisa;
		}

	}

}
