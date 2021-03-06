package ch21;

//Demo: Text file output

import java.io.*;

public class TextFileWriteTest {
	public static void main(String[] args) {
		String fileName = "myData.txt";
		String myFilePath = "C:/java/Ch21/myFiles/";

		try {
			File myFile = new File(myFilePath + fileName);
			PrintWriter out = new PrintWriter(myFile);
			out.println("This line will be written to the file. ");		//调用输出
			out.print("Version: " + 1.01);
			out.print("\tAuthor: 高永强");
			out.println();
			out.println("File name: " + fileName);
			out.close();
		}
		catch (IOException e) {
			System.out.println(e);
		}
	}
}

