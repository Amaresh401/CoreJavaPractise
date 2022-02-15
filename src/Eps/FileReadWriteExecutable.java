package Eps;

import java.io.File;

public class FileReadWriteExecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path = "C:\\Users\\akandula\\OneDrive - GVC Group\\Desktop\\Dump.txt";
		
		File filePath = new File(path);
		filePath.setExecutable(true);
		filePath.setReadable(false);
		filePath.setWritable(true);
		System.out.println("Done");

	}

}
