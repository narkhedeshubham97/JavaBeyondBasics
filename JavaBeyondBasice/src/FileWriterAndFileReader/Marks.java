package FileWriterAndFileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Marks {
	public static void main(String[] args) {

		try {
			FileReader term1file = new FileReader("C:\\New folder\\JavaBeyoendBasics\\JohnTerm1.txt");
			FileReader term2file = new FileReader("C:\\New folder\\JavaBeyoendBasics\\JohnTerm2.txt");

			BufferedReader term1filereader = new BufferedReader(term1file);
			BufferedReader term2filereader = new BufferedReader(term2file);

			String[] marks = new String[3];
			
			for (int i = 0; i < marks.length; i++) {
				marks[i] = term1filereader.readLine();
				marks[i] += term2filereader.readLine();
			}

			term1filereader.close();
			term2filereader.close();

			FileWriter totalMarks = new FileWriter("C:\\New folder\\JavaBeyoendBasics\\JohnTotal.txt");
			for (int i = 0; i < marks.length; i++) {
				totalMarks.write(marks[i] + "\n"); // for add data in file
				System.out.println(marks[i]);
			}

			totalMarks.close();

		} catch (IOException e) {
			System.out.println(e);

		}

	}

}
