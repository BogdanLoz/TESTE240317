package application;

import java.util.ArrayList;

import model.Exposicao;
import model.Obra;
import view.Menu;

public class App {
	
	public static void main(String[] args) {
		
		ArrayList<Exposicao> exp = new ArrayList<Exposicao>();
		ArrayList<Obra> obr = new ArrayList<Obra>();
		
		new Menu(exp,obr);
	}
}
