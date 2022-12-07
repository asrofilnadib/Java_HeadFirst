package main.java.ch2;

public class Drumkit {
	boolean topHat = true;
	boolean snare = true;

	public void playTopHat() {
		System.out.println("ding ding ding...");
	}
	public void playSnare() {
		System.out.println("bang bang bang...");
	}
}

class DrumkitTestDrive {
	public static void main(String[] args) {
		Drumkit d = new Drumkit();
		d.playSnare();
		d.snare = false;
		if (d.snare == true) {
			d.playSnare();
		}
		d.playTopHat();
	}
}