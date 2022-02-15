package Eps;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

public class ImageFormatConversion {

	public static void main(String[] args) {

		// First approach using URL
		usingUrl();

		// Second approach using File
		usingFile();
		
		System.out.println("Programming Done");

	}

	private static void usingFile() {
		// TODO Auto-generated method stub

		File file = new File("C:/Users/akandula/ProtractorTutorial/CoreJava/src/Eps/ImageConversion/newref.jpg");
		try {
			BufferedImage imageReadFile = ImageIO.read(file);

			ImageIO.write(imageReadFile, "jpg",
					new File("C:/Users/akandula/ProtractorTutorial/CoreJava/src/Eps/ImageConversion/usingFileRef.jpg"));
			ImageIO.write(imageReadFile, "png",
					new File("C:/Users/akandula/ProtractorTutorial/CoreJava/src/Eps/ImageConversion/usingFileRef.png"));
			ImageIO.write(imageReadFile, "bmp",
					new File("C:/Users/akandula/ProtractorTutorial/CoreJava/src/Eps/ImageConversion/usingFileRef.bmp"));
			ImageIO.write(imageReadFile, "gif",
					new File("C:/Users/akandula/ProtractorTutorial/CoreJava/src/Eps/ImageConversion/usingFileRef.gif"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void usingUrl() {
		// TODO Auto-generated method stub
		try {
			URL imageUrl = new URL(
					"https://images-eu.ssl-images-amazon.com/images/G/31/img20/Events/Onam/PC/header/DesktopGateway_CategoryCard_1x._SY304_CB641189741_.jpg");

			BufferedImage readImageUrl = ImageIO.read(imageUrl);

			ImageIO.write(readImageUrl, "jpg",
					new File("C:/Users/akandula/ProtractorTutorial/CoreJava/src/Eps/ImageConversion/newref.jpg"));
			ImageIO.write(readImageUrl, "png",
					new File("C:/Users/akandula/ProtractorTutorial/CoreJava/src/Eps/ImageConversion/newref.png"));
			ImageIO.write(readImageUrl, "bmp",
					new File("C:/Users/akandula/ProtractorTutorial/CoreJava/src/Eps/ImageConversion/newref.bmp"));
			ImageIO.write(readImageUrl, "gif",
					new File("C:/Users/akandula/ProtractorTutorial/CoreJava/src/Eps/ImageConversion/newref.gif"));

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
