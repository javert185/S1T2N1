package s1t2n1exercici1;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		
		//Ficar productes
		
		String nou_producte;	
		do {
			
			//Preguntem per un producte
			nou_producte = JOptionPane.showInputDialog("Afegeix un producte");

			//Si l'usuari no fica producte, ni preguntem pel preu
			if (!nou_producte.equals("")) {
				
			//Preguntem pel preu i el convertim a int
			int preu_nou_producte = Integer.parseInt(JOptionPane.showInputDialog("Introdueix el seu preu:" ));
				
				//Afegim el producte a la llista producte
				Venda.afegir_producte(nou_producte, preu_nou_producte);
			}		
		} while (!nou_producte.equals(""));
		
		Venda.calcularTotal();
	}
}