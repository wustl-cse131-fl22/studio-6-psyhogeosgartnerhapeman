package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class rainbowkittensurpriseTRIANGLE {

	public static double constant = 2;
	
	public static void main (String args[]) {
		StdDraw.setCanvasSize(1200,1200);
		StdDraw.setPenRadius(0.005);
		double radius = 0.2;
		double factor = 0.5;
		trianglesUponTriangles(0.5, 0.5, radius, factor);
	}

	public static void betterTriangle(double xCenter, double yCenter, double radius) {
		StdDraw.line(xCenter, yCenter+radius, xCenter+(Math.sqrt(2)*radius), yCenter-(Math.sqrt(2)*radius));
		StdDraw.line(xCenter+(Math.sqrt(2)*radius), yCenter-(Math.sqrt(2)*radius), xCenter-(Math.sqrt(2)*radius), yCenter-(Math.sqrt(2)*radius));
		StdDraw.line(xCenter-(Math.sqrt(2)*radius), yCenter-(Math.sqrt(2)*radius), xCenter, yCenter+radius);
	}
	
	public static void trianglesUponTriangles(double xCenter, double yCenter, double radius, double factor) {
		if(radius<0.005)
			return;
		StdDraw.setPenColor((int)(155*Math.random())+100, (int)(155*Math.random())+100, (int)(155*Math.random())+100);
		betterTriangle(xCenter, yCenter, radius);
		trianglesUponTriangles(xCenter-constant*radius, yCenter, radius*factor, factor);
		trianglesUponTriangles(xCenter, yCenter+constant*radius, radius*factor, factor);
		trianglesUponTriangles(xCenter+constant*radius, yCenter, radius*factor, factor);
		trianglesUponTriangles(xCenter, yCenter-constant*radius, radius*factor, factor);
		return;
	}

}
