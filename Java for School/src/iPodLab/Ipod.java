package iPodLab;

import java.util.Scanner;

public class Ipod {
	Song[][] songs = new Song[4][50];
	// 0 = UnListenible
	// 1 = Jesus Tracks
	// 2 = Roll and Rock
	// 3 = Other

	public Ipod() {

		// String[] generas = {"Un-Listenible", "Jesus Tracks", "Roll and Rock",
		// "Other"};
		// for(int i = 0; i < generas.length; i++){

		Song song = new Song();
		Song jazzAesthetic = new Song("Jazz Aesthetic", "Noah Hellman", "The Essential Noah Hellman", 204);
		Song[] unListenible = { jazzAesthetic };

		Song[] jesusTracks = {};

		for (int i = 0; i < 50; i++) {
			unListenible[i] = songs[0][i];
		}
	}

	public void printGenera() {
		Scanner input = new Scanner(System.in);
		System.out.print("What Genera do you want? ");
		String genera = input.nextLine();
		input.close();
		switch (genera) {
		case "UnListenible":
			System.out.print("Songs in UnListenible:");
			for (String songName : getGenera(0)) {
				System.out.print(songName + ", ");
			}
			break;
		case "Jesus Tracks":
			System.out.print("Songs in Jesus Tracks:");
			for (String songName : getGenera(1)) {
				System.out.print(songName + ", ");
			}
			break;
		case "Roll and Rock":
			System.out.print("Songs in Roll and Rock:");
			for (String songName : getGenera(2)) {
				System.out.print(songName + ", ");
			}
			break;
		default:
			System.out.print("Songs not in any specific genera:");
			for (String songName : getGenera(3)) {
				System.out.print(songName + ", ");
			}
		}

	}

	// returns a 1d string based on the row number
	private String[] getGenera(int row) {
		int length = 50;
		String[] genera = new String[length];
		for (int i = 0; i < length; i++) {
			genera[i] = this.songs[row][i].getTitle();
		}
		return genera;
	}

	public void printAllSongs() {
		for (int i = 0; i < songs.length; i++) {
			for (int j = 0; i < songs[i].length; j++) {
				System.out.print("All the songs you have are:" + songs[i][j].getTitle() + ", ");
			}
		}
	}

	public void printPopular() {
		Song[] tmp = new Song[10];
		for (int i = 0; i < songs.length; i++) {
			for (int j = 0; i < songs[i].length; j++) {
				for(int k = 0; k < 10; k++){
					if(songs[i][j].getTimesPlayed() >= tmp[k].getTimesPlayed()){
						tmp = shiftDown(tmp, k);
						tmp[k] = songs[i][j];
					}
				}
			}
		}
		for(int i = 0; i < 10; i++){
			System.out.print(i+1 + ": " + tmp[i].getTitle() + "(" + tmp[i].getTimesPlayed() + ")");
		}
	}
	
	private Song[] shiftDown(Song[] tmp, int index){
		for(int i = tmp.length - 1; i > index; i--){
			tmp[i] = tmp[i - 1];
		}
		return tmp;
	}
	
	public void playSong(){
		Scanner input = new Scanner(System.in);
		System.out.print("What Song do you want to play?");
		String title = input.next();
		for(int i = 0; i < songs.length; i++){
			for(int j = 0; i < songs[i].length; i++){
				if(title == songs[i][j].getTitle()){
					songs[i][j].setTimesPlayed(songs[i][j].getTimesPlayed() + 1);
					break;
				}
			}
		}
		System.out.println("Sorry, that song is not in this iPod");
	}

}
