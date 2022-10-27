package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class rainbowkittensuprise {
	
	public static void main (String args[]) {
		circlesUponCircles(0.5, 0.5, 0.4, 0.01);
	}
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {
		if (radius<radiusMinimumDrawingThreshold) {
			return;
		}
		StdDraw.setPenColor((int)(150*Math.random())+100, 0, (int)(150*Math.random())+100);
		StdDraw.circle(xCenter, yCenter, radius);
		circlesUponCircles(xCenter-radius, yCenter, radius/2.0, radiusMinimumDrawingThreshold);
		circlesUponCircles(xCenter, yCenter+radius, radius/2.0, radiusMinimumDrawingThreshold);
		circlesUponCircles(xCenter+radius, yCenter, radius/2.0, radiusMinimumDrawingThreshold);
		circlesUponCircles(xCenter, yCenter-radius, radius/2.0, radiusMinimumDrawingThreshold);
		// FIXME
	}
}
