package iPodLab;

public class Song {
	String title;
	String artist;
	String album;
	int length;
	int timesPlayed;
	
	
	public Song(){
		this.title = "Bad Hombres";
		this.artist = "Noah Hellman";
		this.album = "The Essential Hellman";
		this.length = 75;
		this.timesPlayed = 0;
	}
	
	public Song(String title, String artist, String album, int length){
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.length = length;
		this.timesPlayed = 0;
	}


	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getTimesPlayed() {
		return timesPlayed;
	}

	public void setTimesPlayed(int timesPlayed) {
		this.timesPlayed = timesPlayed;
	}

	public String toString(){
		return ("Title:" + this.title + " Artist:" + this.artist + " Album:" + this.album);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
