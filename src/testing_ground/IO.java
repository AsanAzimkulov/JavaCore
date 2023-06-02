package testing_ground;

import java.io.*;
import java.util.Scanner;

public class IO {
	public static void firstRead() throws IOException{
		String str;
		
		OutputStreamWriter osw = new OutputStreamWriter(System.out);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in, osw.getEncoding()));
		
		System.out.println("Вводите строки; для выхода введите stop.");
		
		do {
			str = br.readLine();
			System.out.println(str);
		} while(!str.equals("stop"));
	}
	
	public static void writeToConsole() throws IOException{
		int b;
		b = 'A';
		System.out.write(b);
		System.out.write('\n');
	}
}
