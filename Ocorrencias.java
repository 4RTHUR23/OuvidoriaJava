package br.com.Ouvidoria;

public class Ocorrencias {

	private int protocolo;
	private String tipoDaOcorrencia;
	private String autorDaOcorrencia;
	private String descricaoDaOcorrencia;

	public Ocorrencias(int protocolo, String tipoDaOcorrencia, String autorDaOcorrencia, String descricaoDaOcorrencia) {
		super();
		this.protocolo = protocolo;
		this.tipoDaOcorrencia = tipoDaOcorrencia;
		this.autorDaOcorrencia = autorDaOcorrencia;
		this.descricaoDaOcorrencia = descricaoDaOcorrencia;
	}

	public int getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(int protocolo) {
		this.protocolo = protocolo;
	}

	public String getTipoDaOcorrencia() {
		return tipoDaOcorrencia;
	}

	public void setTipoDaOcorrencia(String tipoDaOcorrencia) {
		this.tipoDaOcorrencia = tipoDaOcorrencia;
	}

	public String getAutorDaOcorrencia() {
		return autorDaOcorrencia;
	}

	public void setAutorDaOcorrencia(String autorDaOcorrencia) {
		this.autorDaOcorrencia = autorDaOcorrencia;
	}

	public String getDescricaoDaOcorrencia() {
		return descricaoDaOcorrencia;
	}

	public void setDescricaoDaOcorrencia(String descricaoDaOcorrencia) {
		this.descricaoDaOcorrencia = descricaoDaOcorrencia;
	}

}
