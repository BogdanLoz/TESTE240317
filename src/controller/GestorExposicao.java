package controller;

import java.util.ArrayList;
import model.Exposicao;
import model.Obra;

public class GestorExposicao {
	
	public GestorExposicao(){
		
		ArrayList<Exposicao> exp = new ArrayList<Exposicao>();
		ArrayList<Obra> obr = new ArrayList<Obra>();
		
		
	}
	
	public void addExposicao(String nomeExposicao, String dataInicio, String dataFim, int qtdVisitantes, float preco,float lucro, ArrayList<Obra> obr, int id,ArrayList<Exposicao> exp){
		
		Exposicao exposicao = new Exposicao(nomeExposicao, dataInicio, dataFim,  qtdVisitantes,  preco, lucro, obr, id);
		exp.add(exposicao);

	}
	
	public void addObras(String nomeArtista, String tituloObra, String categoria, String tipoObra, String data,ArrayList<Obra> obr){
		
		Obra obra = new Obra(nomeArtista, tituloObra, categoria, tipoObra, data);
		obr.add(obra);
	}
	
	public int maisLucro(ArrayList<Exposicao> exp,int idaux){
		
		float[] lucro = new float[exp.size()];
		float maior=0;
		for(int i = 0;i<exp.size();i++){
			lucro[i] = exp.get(i).getQtdVisitantes() * exp.get(i).getPreco();
				
				if(lucro[i] > maior){
					maior = lucro[i];
				    exp.get(i).setLucro(lucro[i]);
					idaux = exp.get(i).getId();
				}
		}
		
		return idaux;			
	}
	
}
