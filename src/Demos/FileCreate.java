package Demos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCreate {

	public static void main(String[] args) throws Exception {
		
		File f1= new File("D:\\\\NewD.txt");
		Scanner sc= new Scanner(f1);
		while(sc.hasNextLine()) {
		String data=sc.nextLine();
		System.out.println(data);
		}
		sc.close();
	}
}
