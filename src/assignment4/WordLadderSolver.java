/*
     Andrew Ferrari - acf2282 
 */

package assignment4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Assignment3.Clothing;
import Assignment3.Electronics;
import Assignment3.Grocery;
import Assignment3.Item;

// do not change class name or interface it implements
public class WordLadderSolver implements Assignment4Interface
{
    // delcare class members here.

    // add a constructor for this object. HINT: it would be a good idea to set up the dictionary there

    // do not change signature of the method implemented from the interface
    //@Override
    public List<String> computeLadder(String startWord, String endWord) throws NoSuchLadderException 
    {
        // implement this method
        throw new UnsupportedOperationException("Not implemented yet!");
    }

    //@Override
    public boolean validateResult(String startWord, String endWord, List<String> wordLadder) 
    {
        throw new UnsupportedOperationException("Not implemented yet!");
    }
    public static void main(String[] args) 
    {
    try 
   	{
    	   FileReader freader = new FileReader(args[0]);
   		BufferedReader reader = new BufferedReader(freader);
   		
   		for (String s = reader.readLine(); s != null; s = reader.readLine()) 
   		{
   			String newString = s;
   			String[] inputs = s.split("\\s+");
   			String operation = inputs[0];
   			
   			System.out.println(s);
   		}	
   		
   	}
   	catch (FileNotFoundException e) 
   	{
   		System.err.println("Error: File not found. Exiting...");
   		e.printStackTrace();
   		System.exit(-1);
   	}
    	catch (IOException e) 
   	{
   		System.err.println("Error: IO exception. Exiting...");
   		e.printStackTrace();
   		System.exit(-1);
   	}
   }
  }