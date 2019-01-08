package mustafa.game;

import java.util.Random;

public class Map extends Logic{
	static int[][] map;
	private Random rnd;
	
	
	public Map() {
		// TODO Auto-generated constructor stub
		map = new int[26][26];
		rnd = new Random();
		initMap();
	}
	
	
	/*
	 * initMap metodu oyun baslarken ve mapi bosluklarla doldurur 
	 * mapin ilk hali bostur ve kenarlar . ile cizilir
	 */
	public void initMap() {
		for(int i=0; i<map.length; i++) {
			for(int j=0; j<map[i].length; j++) {
				if(i==0 || i==map[i].length-1 || j==0 || j==map[i].length-1)
					map[i][j] = 555;
				else
					map[i][j] = 0;
			}
		}
	}
	
	
	/*
	 * generateFeed metodu haritada rastgele bir noktaya yilan icin bir yem 
	 * yerlestirir ve bu yem yilanin oldugu konum disinda bir yere koymasi icin 
	 * kontrol de yapar
	 */
	public void generateFeed() {
		int x,y;
		x = 1+rnd.nextInt(map.length-2);
		y = 1+rnd.nextInt(map[x].length-2);
		if(map[x][y] == 0)
			map[x][y] = 666;
		else
			generateFeed();
	}
	
	
	/*
	 * printMap metodu haritayi ekrana yazdirir
	 */
	public void printMap() {
		for(int i=0; i<map.length; i++) {
			for(int j=0; j<map[i].length; j++) {
				if(map[i][j] == 0)
					System.out.print("  ");
				else if(map[i][j] == 555)
					System.out.print(". ");
				else if(map[i][j] == 666)
					System.out.print("* ");
				else if(map[i][j] == 1)
					System.out.print("#" + " ");
				else
					System.out.print("+" + " ");
			}
			System.out.println();
		}
	}
	
}
