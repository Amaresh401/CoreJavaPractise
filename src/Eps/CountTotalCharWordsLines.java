package Eps;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountTotalCharWordsLines {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String path = "C:\\Users\\akandula\\OneDrive - GVC Group\\Desktop\\Dump.txt";
		String path1 = "C:\\Users\\akandula\\OneDrive - GVC Group\\Desktop\\Dump.txt";
		int lineCount = 0;
		int wordCount = 0;
		int characterCount = 0;

		BufferedReader fileReader = new BufferedReader(new FileReader(path));
		String lineByLine = fileReader.readLine();

		BufferedReader fileReader2 = new BufferedReader(new FileReader(path1));
		String lineinLine = fileReader2.readLine();

		BufferedReader fileReader3 = new BufferedReader(new FileReader(path1));
		String lineByLineForCharacters = fileReader3.readLine();

		numberOfLines(lineByLine, lineCount, fileReader);
		numberOfWords(lineinLine, wordCount, fileReader2);
		numberofCharacters(fileReader3, lineByLineForCharacters, characterCount);

	}

	private static void numberofCharacters(BufferedReader fileReader3, String lineByLineForCharacters,
			int characterCount) throws IOException {
		// TODO Auto-generated method stub

		while (lineByLineForCharacters != null) {
			char[] ch = lineByLineForCharacters.toCharArray();
			for (char c : ch) {
				if (c != ' ') {
					characterCount++;
				}
			}
			lineByLineForCharacters = fileReader3.readLine();
		}
		System.out.println(characterCount);
	}

	private static void numberOfWords(String lineinLine, int wordCount, BufferedReader fileReader2) throws IOException {
		// TODO Auto-generated method stub
		while (lineinLine != null) {

			String[] words = lineinLine.toLowerCase().split(" ");
			wordCount = wordCount + words.length;

			lineinLine = fileReader2.readLine();
		}
		System.out.println(wordCount);
	}

	private static void numberOfLines(String lineByLine, int lineCount, BufferedReader fileReader) throws IOException {
		while (lineByLine != null) {
			lineCount++;
			lineByLine = fileReader.readLine();
		}
		System.out.println(lineCount);
	}

}
