package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.GestorExposicao;
import model.Exposicao;
import model.Obra;

public class Menu {
	
	public Menu(ArrayList<Exposicao> exp,ArrayList<Obra> obr){
		
		int opt,
			idaux=0;
		do{	
			System.out.println("Menu");
			System.out.println("1->Inserir Exposicoes");
			System.out.println("2->Listar Exposicoes/Obras");
			System.out.println("3->Adicionar Obras");
			System.out.println("4->Gestor de Lucro");
			System.out.println("0->Sair");
			
			opt = new Scanner(System.in).nextInt();
				
				switch(opt){
					
					case 1 : 
						new ViewExposicao().addExposicao(exp,obr);
						break;
					case 2 :
						new ViewExposicao().showExposicao(exp, obr);
						break;
					case 3 :
						new ViewExposicao().addObras(exp, obr);
						break;
					case 4 :
						new GestorExposicao().maisLucro(exp,idaux);
						System.out.println("A Exposicao com mais lucro");
						System.out.println(exp.get(idaux).getNomeExposicao());
						System.out.print("Com um Lucro de : " + exp.get(idaux).getLucro() + "€\n");
						break;
				}
		}while(opt != 0);
	}
}
