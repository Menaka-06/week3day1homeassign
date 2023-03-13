package week3.day1;

public class OnePlus extends AndroidTv implements Android  {

	public static void main(String[] args) {
		OnePlus objonepls = new OnePlus();
		objonepls.openApp();
		objonepls.playVideo();
	}

	public void playVideo() {
		System.out.println("play the video - oneplus");
		
	}

}
