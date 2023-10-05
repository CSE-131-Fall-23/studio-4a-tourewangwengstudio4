package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		 StdDraw.setPenColor(StdDraw.PINK);
		StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.25);
		 StdDraw.setPenColor(StdDraw.MAGENTA);
		StdDraw.filledSquare(0.25,0.25,0.125);
		StdDraw.filledSquare(0.75,0.75,0.125);
		StdDraw.setPenColor(StdDraw.BOOK_BLUE);
		StdDraw.filledSquare(0.75,0.25,0.125);
		StdDraw.setPenColor(StdDraw.BOOK_BLUE);
		StdDraw.filledSquare(0.25,0.75,0.125);
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledEllipse(0.5, 0.5, 0.035, 0.025);
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledEllipse(0.25, 0.25, 0.035, 0.025);
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledEllipse(0.25, 0.75, 0.035, 0.025);
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledEllipse(0.75, 0.75, 0.035, 0.025);
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledEllipse(0.75, 0.25, 0.035, 0.025);
		StdDraw.circle(0.25, 0.25, 0.25);
		StdDraw.circle(0.75, 0.75, 0.25);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.circle(0.75, 0.25, 0.25);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.circle(0.25, 0.75, 0.25);
	}
}