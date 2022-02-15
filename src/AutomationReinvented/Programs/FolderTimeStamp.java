package AutomationReinvented.Programs;

import java.io.File;
import java.util.Date;

public class FolderTimeStamp {

	public static void main(String[] args) {
		File filePath = new File(System.getProperty("user.dir")+"/htmlReports/"+ timeStamps());
		if(filePath.exists()){
			System.out.println("File Already Created");
		}else{
			filePath.mkdir();
			System.out.println("File Created Now");
		}
	}
	
	private static String timeStamps(){
		Date date = new Date();
		String dateFormat = date.toString().replace(" ", "_").replace(":", "_");
		return dateFormat;
	}

}
