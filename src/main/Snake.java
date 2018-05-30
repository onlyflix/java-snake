package main;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Snake extends GameObject {

	protected boolean running;
	private char movingDir = 'd';
	private static int startX;
	private static int startY;
	private static char symbol = 'O';
	
	public Snake(int width, int height, ArrayList<int[]> positionWall) {
		startX = width / 2;
		startY = height / 2;
		coordinate[0] = startX;
		coordinate[1] = startY;
		position.add(coordinate);
	}

	public void keyReader() {
		while (running) {
			try {
				TimeUnit.MILLISECONDS.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			char direction = IO.readChar();
			if (direction == 'w') {
				if (this.getMovingDir() != 's') {
					this.setMovingDir('w');
				}
			}
			if (direction == 'a') {
				if (this.getMovingDir() != 'd') {
					this.setMovingDir('a');
				}
			}
			if (direction == 's') {
				if (this.getMovingDir() != 'w') {
					this.setMovingDir('s');
				}
			}
			if (direction == 'd') {
				if (this.getMovingDir() != 'a') {
					this.setMovingDir('d');
				}
			}
		}
	}
	
	private void move() {
		
	}

	public boolean isRunning() {
		return running;
	}

	public void setRunning(boolean running) {
		this.running = running;
	}

	public char getMovingDir() {
		return movingDir;
	}

	public void setMovingDir(char movingDir) {
		this.movingDir = movingDir;
	}

	public static char getSymbol() {
		return symbol;
	}

	public static void setSymbol(char symbol) {
		Snake.symbol = symbol;
	}
	
	public ArrayList<int[]> getSchlange(){
		return position;
		
	}
}
