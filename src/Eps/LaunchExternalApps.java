package Eps;

import java.io.IOException;

public class LaunchExternalApps {

	public static void main(String[] args) throws IOException, InterruptedException {

	/*	Runtime runTime = Runtime.getRuntime();
		Process processRunTime = runTime
				.exec("notepad.exe C:\\Users\\akandula\\OneDrive - GVC Group\\Desktop\\tomorrow.txt");
		Thread.sleep(4000);
		processRunTime.destroy();

		String[] stringRunTime = new String[] { "C:\\Program Files\\VideoLAN\\VLC\\vlc.exe",
				"C:\\Users\\akandula\\Downloads\\9000_SB_amended.mp4" };

		Process loadEnvironment = runTime.exec(stringRunTime);
		Thread.sleep(10000);
		loadEnvironment.destroy();*/
		
		
		ProcessBuilder builder = new ProcessBuilder("C:\\Program Files\\VideoLAN\\VLC\\vlc.exe",
				"C:\\Users\\akandula\\Downloads\\9000_SB_amended.mp4" );
		builder.start();

	}

}
