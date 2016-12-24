package iPodLab;

public class iPodLabTester {
	
	public static void main(String args[]){
		Ipod iPod = new Ipod();
<<<<<<< HEAD
	
		randomize(iPod);
		clear();
		iPod.printPopular();
		clear();
		iPod.playSong("Bad Hombres");
		clear();
		iPod.printArtist("Noah Hellman");
		clear();
		iPod.printLongest();
		clear();
		iPod.printShortest();
		clear();
		iPod.randomSong();
		clear();
		iPod.printGenera("Other");
		addSpace();
		iPod.addSong("4:33", "John Cage", "Swanky Silence", 277, "Other");
		addSpace();
		iPod.printGenera("Other");
		addSpace();
		iPod.deleteSong("4:33");
		addSpace();
		iPod.printGenera("Other");
		clear();
		iPod.printAllSongs();
		clear();
		iPod.printArtist("Noah Hellman");
		clear();
		iPod.printAlbum("Backwards Roll");
=======
		
		iPod.printGenera();
		addSpace();
		randomize(iPod);
		//clear();
		iPod.printPopular();
		//clear();
		iPod.playSong("Bad Hombres");
		//clear();
		iPod.printArtist("Noah Hellman");
		//clear();
		iPod.printLongest();
		//clear();
		iPod.printShortest();
		//clear();
		iPod.randomSong();
		//clear();
		iPod.addSong("4:33", "John Cage", "Swanky Silence", 277, "Other");
		//clear();
		iPod.printAllSongs();
		iPod.deleteSong("Bad Hombres");
		iPod.printAllSongs();
		//clear();
//		iPod.printAlbum();
>>>>>>> branch 'master' of https://github.com/webwesley/Java-HomeWork.git
		
		
	}
	
	private static void addSpace(){
		System.out.println();
		System.out.println();
	}
	
	private static void clear(){
		for(int i = 0; i <15; i++){
			System.out.println();
		}
	}
	
	private static void randomize(Ipod iPod){
		for(int i = 0; i < 10000; i++){
			iPod.randomSong();
		}
	}
	
	private static void addSpace(){
		System.out.println();
		System.out.println();
	}
	
	private static void clear(){
		for(int i = 0; i <15; i++){
			System.out.println();
		}
	}
	
	private static void randomize(Ipod iPod){
		for(int i = 0; i < 10000; i++){
			iPod.randomSong();
		}
	}
	

}