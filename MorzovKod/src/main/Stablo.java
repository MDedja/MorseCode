package main;

import java.util.Scanner;

public class Stablo {
	
	CvorStabla koren;
	Scanner citac = new Scanner(System.in);
	
	
	
	public static void ispisiStablo(CvorStabla koren) {
		if(koren == null) {
			return;
		}
		
		System.out.print(koren.slovo + " ");
		
		ispisiStablo(koren.levoDete);
		ispisiStablo(koren.desnoDete);
	}
	
	public void ispisiNiz(char niz[]) {
		for(int i = 0;i<niz.length;i++) {
			System.out.print(niz[i] + " ");
		}
	}
	
	
	
	// Trazi unos reci, uzima rec deli je na charove i ubacuje u niz. Vraca taj niz.
	public char[] unosReci() {
		String rec;
		char niz[] = new char[15];
		
		System.out.println("Enter your word: ");
		rec = citac.nextLine();
		
		niz = rec.toCharArray();
		
		return niz;
	}
	
	
	
	
	
	
	
	
	

}
