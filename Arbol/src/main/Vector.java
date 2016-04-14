package main;

public class Vector {
	float x;
	 float y;
	public Vector(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public void rotar(float grados){
		 double cos = Math.cos(Math.toRadians(grados));
		 double sin = Math.sin(Math.toRadians(grados));
		 
		 float xn = (float) (x*cos - y * sin);
		 y = (float) (x*sin + y  * cos);
		 x = xn;
	}
	
	public float modulo(){
		return (float) Math.sqrt(x*x + y*y);
	}
}
