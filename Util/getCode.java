package Util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import java.util.Arrays;

public class getCode {
	public static String codeGet()
	{
		ArrayList<String> lines = new ArrayList<String>();
		
		String line = "";
		
		Scanner sc = null;

	    try 
	    {
	    	sc = new Scanner(new File("Util/Palindrome.java"));
	        //Scanner reads every line and adds to ArrayList Lines
	        while (sc.hasNextLine()) 
	        {   
	        	lines.add(sc.nextLine());
	        }
	        
	    }
	    catch (FileNotFoundException e) 
        {
            ConsoleMethods.println("File Not found");
        }
	    
	    Object[] objArray = lines.toArray();
	    String [] stringArray = Arrays.copyOf(objArray,  objArray.length,String[].class);
	    for(String hold : stringArray)
	    	hold = hold + "\n";
	    
	    for(String hold: stringArray)
	    	line = line + hold;
	    //line = stringArray.toString();
        
	    
	    return line;
	}
}
	

