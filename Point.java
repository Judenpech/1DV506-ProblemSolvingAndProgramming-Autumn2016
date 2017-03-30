package jl223vy_assign3;

public class Point {
	private int x=0;
	private int y=0;
	public Point(){ }
	public Point(int newX, int newY){
		x=newX;
		y=newY;
	}
	public String toString(){
		return "(" + x + "," + y + ")";
	}
	public boolean isEqualTo(Point p){
		return p.x==x && p.y==y;
	}
	public double distanceTo(Point p){   //¡Ωµ„º‰æ‡¿Î£∫AB=°Ã((x1-x2)^2+(y1-y2)^2)
		return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
	}
	public void move(int changex, int changey){
		x=x+changex;
		y=y+changey;
	}
	public void moveToXY(int newX, int newY){
		x=newX;
		y=newY;
	}

}
