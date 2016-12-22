package iPodLab;

public class iPodLabTester {
	
	public static void main(String args[]){
		Ipod iPod = new Ipod();
		
		iPod.printGenera();
		addSpace();
		iPod.printAllSongs();
		clear();
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
		
		
	}
	
	private static void addSpace(){
		System.out.println();
		System.out.println();
	}
	
	private static void clear(){
		for(int i = 0; i <30; i++){
			System.out.println();
		}
	}
	
	private static void randomize(Ipod iPod){
		for(int i = 0; i < 10000; i++){
			iPod.randomSong();
		}
	}

}
