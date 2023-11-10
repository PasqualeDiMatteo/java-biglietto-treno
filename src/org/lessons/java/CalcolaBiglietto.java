package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		
		float priceKm=0.21F;
		
		float discountUnder = 0.8F;
		float discountOver = 0.6F;
		
		Scanner in=  new Scanner(System.in);
		
		System.out.println("Inserisci la tua età: ");
		
		String age= in.nextLine();
		
		int ageInt=Integer.valueOf(age);
		
		
		System.out.println("Inserisci la tratta in km: ");
		
		String km= in.nextLine();
		
		int kmInt=Integer.valueOf(km);
		
		if (ageInt>=65) {
			
			 float price= priceKm * discountOver*kmInt;
			 
			 String priceFloat=String.format("%.2f",price);
			 
			 System.out.println("Il Prezzo del biglietto è: "+priceFloat+"$");
			 
			 
			
		}else if(ageInt<=18){
			
			float price= priceKm * discountUnder*kmInt;
			 
			 String priceFloat=String.format("%.2f",price);
			 
			 System.out.println("Il Prezzo del biglietto è: "+priceFloat+"$");
			
		}else {
			float price= priceKm *kmInt;
			String priceFloat=String.format("%.2f",price);
			 
			 System.out.println("Il Prezzo del biglietto è: "+priceFloat+"$");
		}
	}
}
