package _04_Snake;

public class Location {
public int x;
public int y;
public boolean equals(int snakeX, int snakeY){
	if (snakeX == x && snakeY == y) {
		return true;
	}
	else {
		return false;
	}
}
enum Direction{
	UP,DOWN,LEFT,RIGHT;
}

}
