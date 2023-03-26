package s1t2n1exercici1;

import java.util.*;

public class Venda {
	
	
	private static ArrayList<Producte> colleccio_productes = new ArrayList<Producte>();
	private static int preu_total;
	
	public static void calcularTotal() {
		
		if (colleccio_productes.size() == 0) {
		
			try {
						
				throw new VendaBuidaException("Per fer una venda primer has d’afegir productes"); 		
		
			} catch (VendaBuidaException e) {
			System.out.println(e.getMessage());	
			}
		
		} else {	
		
			for (int i = 0; i < colleccio_productes.size(); i++) {
				
				preu_total = preu_total + colleccio_productes.get(i).getPreu();
			}
			
			System.out.println("El preu total dels productes és " + preu_total);				
			}
		}

	public static void afegir_producte(String nom, int preu) {
	
		colleccio_productes.add(new Producte(nom, preu));		
	}
}