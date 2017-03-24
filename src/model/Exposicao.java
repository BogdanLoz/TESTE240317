package model;

import java.util.ArrayList;

public class Exposicao {

	String nomeExposicao,
			dataInicio,
			dataFim;
	float preco,
			lucro;
	int id,
		qtdVisitantes;
	
	ArrayList<Obra> obr = new ArrayList<Obra>();

	public Exposicao(String nomeExposicao, String dataInicio, String dataFim, int qtdVisitantes, float preco, float lucro,
			ArrayList<Obra> obr, int id) {
		super();
		this.nomeExposicao = nomeExposicao;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.qtdVisitantes = qtdVisitantes;
		this.preco = preco;
		this.lucro = lucro;
		this.obr = obr;
		this.id = id;
	}

	public String getNomeExposicao() {
		return nomeExposicao;
	}

	public void setNomeExposicao(String nomeExposicao) {
		this.nomeExposicao = nomeExposicao;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataFim() {
		return dataFim;
	}

	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}

	public int getQtdVisitantes() {
		return qtdVisitantes;
	}

	public void setQtdVisitantes(int qtdVisitantes) {
		this.qtdVisitantes = qtdVisitantes;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public ArrayList<Obra> getObr() {
		return obr;
	}

	public void setObr(ArrayList<Obra> obr) {
		this.obr = obr;
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public float getLucro(){
		return lucro;
	}
	
	public void setLucro(float lucro){
		this.lucro = lucro;
	}
}
