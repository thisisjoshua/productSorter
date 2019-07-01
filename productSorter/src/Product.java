import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Product {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String filename;
		filename = JOptionPane.showInputDialog("Please input the file name of the input file:");
		
		String pName[];
		pName = new String[50];
		double pPrice[];
		pPrice = new double[50];
		
		readFromFile(pName, pPrice, filename);
		sortArrays(pName, pPrice);
		writeToFile(pName, pPrice);
		
		

	}
	
	public static void readFromFile(String[] pName, double[] pPrice, String filename) throws FileNotFoundException
	{
		// Create a File instance
	    java.io.File file = new java.io.File(filename);

	    // Create a Scanner for the file
	    Scanner input = new Scanner(file);

	    // Read data from a file
	    
	    int i = 0;
	    while (input.hasNext()) 
	    {
	      String lineInput = input.nextLine();
	      String[] product = lineInput.split(",");
	      
	      pName[i] = product[0].trim();
	      pPrice[i] = Double.parseDouble(product[1].trim());	      
	      	      
	      i++;	 	      
	    }
	    
	    
	    
	    String message = "NAME\tPRICE\n";
	    for(int j = 0; j < pPrice.length; j++)
	    	message += pName[j] + "\t$" + pPrice[j] + "\n";
	    
	    JOptionPane.showMessageDialog(null, new JTextArea(message), null, JOptionPane.INFORMATION_MESSAGE);
	    // Close the file
	    input.close();
	}
	
	public static void sortArrays(String[] pName, double[] pPrice)
	{
		Sort.selectionSort(pName, pPrice);
		String message = "NAME\tPRICE\n";
	    for(int i = 0; i < pPrice.length; i++)
	    	message += pName[i] + "\t$" + pPrice[i] + "\n";
	    
	    JOptionPane.showMessageDialog(null, new JTextArea(message), null, JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void writeToFile(String[] pName, double[] pPrice) throws FileNotFoundException
	{
		File file = new File("output.txt");
	    
	    // Create a file
	    java.io.PrintWriter output = new java.io.PrintWriter(file);
	    
	    //read data from arrays
	    String message = "NAME\tPRICE\n";
	    for(int i = 0; i < pPrice.length; i++)
	    	message += pName[i] + "\t$" + pPrice[i] + "\n";
	    
	    JOptionPane.showMessageDialog(null, new JTextArea(message), null, JOptionPane.INFORMATION_MESSAGE);

	    // Write formatted output to the file
	    output.print(message);
	    
	    // Close the file
	    output.close();
	}

}
