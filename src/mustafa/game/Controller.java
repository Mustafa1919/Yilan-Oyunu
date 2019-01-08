package mustafa.game;

import java.util.Scanner;

public class Controller {
	
	/*
	 * Basilan tus algilanarak tus gonderilir. Eger Tus yonlerden değilse veya birden fazla 
	 * karakter girildiyse metod tekrar cagrilarak dogru girdi alinmaya calisilir
	 */
	public String setControl(Scanner input) {
		String choosing;
		System.out.println("Yonler\nW->Yukari\nA->Sol\nS->Asagi\nD->Sag");
		System.out.print("Yilani hareket ettirmek istediginiz yonu seciniz.");
		choosing = input.next().toLowerCase();
		if(choosing.length()>1) {
			System.out.println("Lutfen Yonu Giriniz ve Tek Karakter Olarak Giriniz.");
			return setControl(input);
		}
		else if(choosing.equals("w") || choosing.equals("a") ||
				choosing.equals("s") || choosing.equals("d")) 
			return choosing;
		else{
			System.out.println("Yon Komutlarindan Birini Giriniz.");
			return setControl(input);
		}
	}

}
