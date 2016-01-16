import java.io.*;
import java.util.Scanner;

public class textbuddy{
	public static void main(String[] args)throws IOException{
		String name = args[0];
		System.out.println("Hello " + name);
		
	Scanner input = new Scanner(new File("test.txt"));
	System.out.println();
	
	while (input.hasNextInt()){
		System.out.print(input.nextInt() + "\t");
	}
	
	}
}