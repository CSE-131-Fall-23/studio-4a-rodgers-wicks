package studio4;

import java.awt.Color;
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
		
		String shapeType = in.next();
		int R = in.nextInt();
		int G = in.nextInt();
		int B = in.nextInt();
		boolean isFilled = in.nextBoolean();
		double parameterOne = in.nextDouble();
		double parameterTwo = in.nextDouble();
		double parameterThree = in.nextDouble();
		double parameterFour = in.nextDouble();
		
		if(shapeType.equals("rectangle")) {
			Color outline = new Color(R, G, B);
			StdDraw.setPenColor(outline);
			if(isFilled == true) {
				StdDraw.filledRectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
			}
			else
			StdDraw.rectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
		
		}
		
		
		
		
		
			
		}

	private static void rectangle(double parameterOne, double parameterTwo, double parameterThree,
			double parameterFour) {
		// TODO Auto-generated method stub
		
	}
	}
