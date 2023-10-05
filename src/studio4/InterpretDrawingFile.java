package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shape = in.next();
		
		int x= in.nextInt();
		int y=in.nextInt();
		int z=in.nextInt();
		StdDraw.setPenColor(x,y,z);
		boolean inside=in.nextBoolean();
		
		double a=in.nextDouble();
		double b=in.nextDouble();
		double c=in.nextDouble();
		double d=in.nextDouble();
		if(inside) {
			   StdDraw.filledRectangle(a,b,c,d);
		}
		else
		{
			StdDraw.rectangle(a,b,c,d);
		}
	}
}
