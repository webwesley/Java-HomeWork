package iPodLab;

public class Ipod {
	
	public Ipod(){
		Song[][] songs = new Song[4][50];
		// 0 = UnListenible
		// 1 = Jesus Tracks
		// 2 = Roll and Rock
		// 3 = Other
				
//		String[] generas = {"Un-Listenible", "Jesus Tracks", "Roll and Rock", "Other"};
//		for(int i = 0; i < generas.length; i++){
		
		Song song = new Song();
		Song jazzAesthetic = new Song("Jazz Aesthetic", "Noah Hellman", "The Essential Noah Hellman", 204);
		Song[] unListenible = {jazzAesthetic};
		
		Song[] jesusTracks = {};
		
		for(int i = 0; i < 50; i++){
			unListenible[i] = songs[0][i];
		}
	}
	
	public String printGenera(){
		System.out.println("What Genera);
		return songs[]
			
	}
	
	

}
