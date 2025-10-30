package TestScript;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSVDemo {
	public static void main(String args[]) {
		try {
			File file = new File(".\\src\\test\\resources\\TestData\\Book2.csv");
			FileReader filereader= new FileReader(file);
			BufferedReader bufferreader= new BufferedReader(filereader);
			String line ;
			while((line=bufferreader.readLine())!=null) {
				String[] str=line.split(",");
				for(String s:str)
					System.out.println(s+" ");
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
//		File file = new File(".\\src\\test\\resources\\TestData\\Book2.csv");
	}
}
