package mustafa.game;

public class Logic extends Controller{

	/*
	 * Yilan yemin ustunde ise yedi kabul edilerek kontrol edilir
	 * parametre olarak yilan bas kisminin koordinatlari alinir
	 * hatali koordinat geldigi zaman oyun sonlandirilir
	 */
	public boolean ifFeed(int[] loc){
		if(loc.length != 2) {
			System.out.println("Hatali koordinatlar");
			return false;
		}
		else {
			if(Map.map[loc[0]][loc[1]] == 666)
				return true;
			else 
				return false;
		}
	}


	/*
	 * Yilan kendi vucuduna temas ettigi zaman oyun sonlandirilir 
	 * bu metod bas kismi koordinatlari kendi vucuduna temas edip etmedigini 
	 * kontrol eder
	 */
	public boolean ifSelfHit(int[] loc) {
		if(loc.length != 2) {
			System.out.println("Hatali koordinatlar");
			return true;
		}
		else {
			if(Map.map[loc[0]][loc[1]] == 0)
				return false;
			else if(Map.map[loc[0]][loc[1]] == 666)
				return false;
			else 
				return true;
		}
	}

	
	/*
	 * Yilanin bas kisminin koordinatlari eger haritanin sinir cizgilerine geldi ise 
	 * oyun sonlandirilir
	 */
	public boolean ifHitBorder(int[] loc) {
		if(loc.length != 2) {
			System.out.println("Hatali koordinatlar");
			return true;
		}
		else {
			if(loc[0]==0 || loc[0]==Map.map.length-1 || 
					loc[1]==0 || loc[1]==Map.map[loc[0]].length-1)
				return true;
			else
				return false;
		}
	}
	
}
