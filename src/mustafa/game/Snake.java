package mustafa.game;

import java.util.Scanner;

public class Snake extends Map{
	
	private int snakeSize;
	private int[] header;
	private Scanner input;
	
	public Snake() {
		// TODO Auto-generated constructor stub
		input = new Scanner(System.in);
		setSnakeSize(6);
		setHeader(new int[2]);
		startGame();
		input.close();
	}

	
	/*
	 * 
	 */
	public void startGame() {
		String choosing;
		header[0] = map.length/2;
		header[1] = map[header[0]].length/2;
		for(int i=0;i<snakeSize;i++) {
			map[header[0]][header[1]-i] = i+1;
		}
		generateFeed();
		printMap();
		while(true) {
			choosing = setControl(input);
			if(choosing.equals("w")) {
				header[0] -= 1;
			}
			else if(choosing.equals("a")) {
				header[1] -= 1;
			}
			else if(choosing.equals("s")) {
				header[0] += 1;			
			}
			else if(choosing.equals("d")) {
				header[1] += 1;
			}
			if(ifHitBorder(header) || ifSelfHit(header)) {
				System.out.println("Oyun Sonlandi");
				break;
			}
			if(ifFeed(header)) {
				drawSnake(getSnakeSize()+1);
				generateFeed();
			}
			else
				drawSnake(getSnakeSize());
			printMap();
		}
	}
	
	
	/*
	 * Yilani oyun haritasina yerlestirir
	 */
	public void drawSnake(int size) {
//		if(size != snakeSize) {
//			snakeSize++;
//			map[header[0]][header[1]] = "#";
//		}	
		int tempX = header[0];
		int tempY = header[1];
		for(int i=1;i<=snakeSize;i++) {
				//yilani ilerletme islemi yapılacak
			if(map[tempX-1][tempY] == i) {
				map[tempX][tempY] = map[tempX-1][tempY];
				tempX -= 1; 
			}
			else if(map[tempX][tempY-1] == i) {
				map[tempX][tempY] = map[tempX][tempY-1];
				tempY -= 1; 
			}
			else if(map[tempX+1][tempY] == i) {
				map[tempX][tempY] = map[tempX+1][tempY];
				tempX += 1; 
			}
			else if(map[tempX][tempY + 1] == i) {
				map[tempX][tempY] = map[tempX][tempY+1];
				tempY += 1; 
			}
		}
		if(size == snakeSize)
			map[tempX][tempY] = 0;
		else {
			setSnakeSize(getSnakeSize()+1);
			map[tempX][tempY] = getSnakeSize();
		}
	}
	
	
	public int getSnakeSize() {return snakeSize;}
	public void setSnakeSize(int snakeSize) {this.snakeSize = snakeSize;}

	public int[] getHeader() {return header;}
	public void setHeader(int[] header) {this.header = header;}



}
