package models;

public class Servico {

	private String nomeDoServico;
	private double precoDoServico;
	private String dataDoServico;
	private String horaDoServico;
	
	public Servico(String nomeDoServico, double precoDoServico, String dataDoServico, String horaDoServico) {
		this.nomeDoServico = nomeDoServico;
		this.precoDoServico = precoDoServico;
		this.dataDoServico = dataDoServico;
		this.horaDoServico = horaDoServico;
	}

	public String getNomeDoServico() {
		return nomeDoServico;
	}

	public void setNomeDoServico(String nomeDoServico) {
		this.nomeDoServico = nomeDoServico;
	}

	public String getDataDoServico() {
		return dataDoServico;
	}

	public void setDataDoServico(String dataDoServico) {
		this.dataDoServico = dataDoServico;
	}

	public String getHoraDoServico() {
		return horaDoServico;
	}

	public void setHoraDoServico(String horaDoServico) {
		this.horaDoServico = horaDoServico;
	}
	
	
	
	
}
