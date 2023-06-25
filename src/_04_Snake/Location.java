package _04_Snake;

public class Location {
public int x;
public int y;
public Location(int objectX, int objectY){
	
}
public boolean LocationEquals(int snakeX, int snakeY) {
	if(snakeX==x && snakeY==y) {
		return true;
	}
		return false;
}

public int getX() {
	return x;
}

public int getY() {
	return y;
}

enum Direction{
	UP,DOWN,LEFT,RIGHT;
}



}
