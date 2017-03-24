package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.GestorExposicao;
import model.Exposicao;
import model.Obra;

public class ViewExposicao {
	
	public void addExposicao(ArrayList<Exposicao> exp, ArrayList<Obra> obr){
		
		String nomeExposicao,
			   dataInicio,
		       dataFim;
		float preco,lucro = 0;
		int id,qtdVisitantes;
		String nomeArtista,
			   tituloObra,
			   categoria,
			   tipoObra,
			   data;
		
		id = exp.size();
		System.out.println("Exposicao");
		System.out.println("Nome da Exposicao");
		nomeExposicao = new Scanner(System.in).nextLine();
		System.out.println("Data de Inicio");
		dataInicio = new Scanner(System.in).nextLine();
		System.out.println("Data do Fim");
		dataFim = new Scanner(System.in).nextLine();
		System.out.println("Quantidade de Visitantes");
		qtdVisitantes = new Scanner(System.in).nextInt();
		System.out.println("Preco de Entrada");
		preco = new Scanner(System.in).nextFloat();
		
		
		
		System.out.println("Deseja inserir Obras na Exposicao \n1->[s]\n2->[n]");
		int opt = new Scanner(System.in).nextInt();
			if(opt == 1){
				do{
					System.out.println("Obras");
					System.out.println("Nome do Artista");
					nomeArtista = new Scanner(System.in).nextLine();
					System.out.println("Titulo da Obra");
					tituloObra = new Scanner(System.in).nextLine();
					System.out.println("Categoria");
					categoria = new Scanner(System.in).nextLine();
					System.out.println("Tipo da Obra");
					tipoObra = new Scanner(System.in).nextLine();
					System.out.println("Data da Criacao da Obra");
					data = new Scanner(System.in).nextLine();
					
					new GestorExposicao().addObras(nomeArtista, tituloObra, categoria, tipoObra, data,obr);
					
					System.out.println("Inserir mais Obras \n1->[s]\n2->[n]");
					opt = new Scanner(System.in).nextInt();
				}while(opt != 2);
			}
			
			new GestorExposicao().addExposicao(nomeExposicao, dataInicio, dataFim, qtdVisitantes, preco, lucro, obr, id,exp);
			
	}

	public void addObras(ArrayList<Exposicao> exp, ArrayList<Obra> obr){
		String nomeArtista,
			   tituloObra,
			   categoria,
			   tipoObra,
			   data;
		int id,opt;
		
		System.out.println("ID da Exposicao onde quer adicionar obras");
		id = new Scanner(System.in).nextInt();
		do{
			System.out.println("Obras");
			
			System.out.println("Nome do Artista");
			nomeArtista = new Scanner(System.in).nextLine();
			System.out.println("Titulo da Obra");
			tituloObra = new Scanner(System.in).nextLine();
			System.out.println("Categoria");
			categoria = new Scanner(System.in).nextLine();
			System.out.println("Tipo da Obra");
			tipoObra = new Scanner(System.in).nextLine();
			System.out.println("Data da Criacao da Obra");
			data = new Scanner(System.in).nextLine();
			
			Obra obra = new Obra(nomeArtista, tituloObra, categoria, tipoObra, data);
			exp.get(id).getObr().add(obra);
			
			System.out.println("Quer inserir mais Obras a Exposicao \n1->[s]\n2->[n]");
			opt = new Scanner(System.in).nextInt();
			
		}while(opt != 2);
	}
	
	public void showExposicao(ArrayList<Exposicao> exp, ArrayList<Obra> obr){
		
		int opt;
		
		System.out.println("Menu");
		System.out.println("1->Procura por ID");
		System.out.println("2->Lista Completa");
		opt = new Scanner(System.in).nextInt();
			switch(opt){
				
				case 1 :
					System.out.println("ID da Exposicao : ");
					int id = new Scanner(System.in).nextInt();
						for(int i = 0;i<exp.size();i++){
							if(id == exp.get(i).getId()){
								System.out.println("Nome da Exposicao : " + exp.get(i).getNomeExposicao());
								System.out.println("Data Inicio\n" + exp.get(i).getDataInicio() + "\nData Fim\n" + exp.get(i).getDataFim());
								System.out.println("Preco de Entrada : " + exp.get(i).getPreco());
									for(int j = 0;j<exp.get(i).getObr().size();j++){
										System.out.println("-----------------------------------");
										System.out.println("Obra N " + (j+1));
										System.out.println("Nome do Artista : " + exp.get(i).getObr().get(j).getNomeArtista());
										System.out.println("Titulo da Obra : " + exp.get(i).getObr().get(j).getTituloObra());
										System.out.println("Categoria : " + exp.get(i).getObr().get(j).getCategoria());
										System.out.println("Tipo de Obra : " + exp.get(i).getObr().get(j).getTipoObra());
										System.out.println("Data da Criacao : " + exp.get(i).getObr().get(j).getData());
										System.out.println("------------------------------------");
										
									}
							}
						}
						break;
				case 2 :
					for(int i = 0;i<exp.size();i++){
							System.out.println("Nome da Exposicao : " + exp.get(i).getNomeExposicao());
							System.out.println("Data Inicio\n" + exp.get(i).getDataInicio() + "\nData Fim\n" + exp.get(i).getDataFim());
							System.out.println("Preco de Entrada : " + exp.get(i).getPreco());
								for(int j = 0;j<exp.get(i).getObr().size();j++){
									System.out.println("-----------------------------------");
									System.out.println("Obra N " + (j+1));
									System.out.println("Nome do Artista : " + exp.get(i).getObr().get(j).getNomeArtista());
									System.out.println("Titulo da Obra : " + exp.get(i).getObr().get(j).getTituloObra());
									System.out.println("Categoria : " + exp.get(i).getObr().get(j).getCategoria());
									System.out.println("Tipo de Obra : " + exp.get(i).getObr().get(j).getTipoObra());
									System.out.println("Data da Criacao : " + exp.get(i).getObr().get(j).getData());
									System.out.println("------------------------------------");
									
								}
					}
			}
		
		
		
	}
}
