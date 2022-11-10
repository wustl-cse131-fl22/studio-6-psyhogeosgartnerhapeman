package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class HexagonsGoCrazy {
	
	public static double MINIMUM_RADIUS = 0.04;
	public static double factor = 0.5;
	
	public static void main(String[] args) {
		StdDraw.setCanvasSize(1200,1200);
		double x = 0.5;
		double y = 0.5;
		double radius = 0.37;
		crazyHexagons(x, y, radius);
	}
	
	public static void hex(double x, double y, double radius) {
		StdDraw.line(x-radius, y, x-0.5*radius, y+radius*Math.sin(Math.PI * (1.0/3.0)));
		StdDraw.line(x-0.5*radius, y+radius*Math.sin(Math.PI * (1.0/3.0)), x+0.5*radius, y+radius*Math.sin(Math.PI * (1.0/3.0)));
		StdDraw.line(x+0.5*radius, y+radius*Math.sin(Math.PI * (1.0/3.0)), x+radius, y);
		StdDraw.line(x+radius, y, x+0.5*radius, y-radius*Math.sin(Math.PI * (1.0/3.0)));
		StdDraw.line(x+0.5*radius, y-radius*Math.sin(Math.PI * (1.0/3.0)), x-0.5*radius, y-radius*Math.sin(Math.PI * (1.0/3.0)));
		StdDraw.line(x-0.5*radius, y-radius*Math.sin(Math.PI * (1.0/3.0)), x-radius, y);
	}
	
	public static void crazyHexagons(double x, double y, double radius) {
		if(radius < MINIMUM_RADIUS)
			return;
		StdDraw.setPenRadius(0.01);
		StdDraw.setPenColor((int)(155*Math.random())+100, (int)(155*Math.random())+100, (int)(155*Math.random())+100);
		hex(x, y, radius);
		crazyHexagons(x-radius*0.5, y, radius*factor);
		crazyHexagons(x-0.25*radius, y+0.5*radius*Math.sin(Math.PI * (1.0/3.0)), radius*factor);
		crazyHexagons(x+0.25*radius, y+0.5*radius*Math.sin(Math.PI * (1.0/3.0)), radius*factor);
		crazyHexagons(x+radius*0.5, y, radius*factor);
		crazyHexagons(x+0.25*radius, y-0.5*radius*Math.sin(Math.PI * (1.0/3.0)), radius*factor);
		crazyHexagons(x-0.25*radius, y-0.5*radius*Math.sin(Math.PI * (1.0/3.0)), radius*factor);
	}

}
