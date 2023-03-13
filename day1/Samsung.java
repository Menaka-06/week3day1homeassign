package week3.day1;

public class Samsung extends AndroidTv implements Android{

	public static void main(String[] args) {
		
		Samsung objsamsng = new Samsung();
		objsamsng.openApp();
		objsamsng.playVideo();

	}

	public void playVideo() {
		System.out.println("play an video - samsung");
		
	}

}
