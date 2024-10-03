package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setCanvasSize(1028, 512);
		StdDraw.setPenColor(new Color(100,0,128));
		StdDraw.filledRectangle(0.5, 0.9, 0.5, 0.25);
		StdDraw.filledRectangle(0.5, 0.1, 0.5, 0.25);
		StdDraw.setPenColor(new Color(158,0,12));
		StdDraw.filledCircle(0.5, 0.5, 0.1);
	}
}