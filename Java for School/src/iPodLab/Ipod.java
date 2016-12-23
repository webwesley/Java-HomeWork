package iPodLab;

import java.util.Random;
import java.util.Scanner;

public class Ipod {
	Song[][] songs = new Song[4][50];
	// 0 = UnListenible
	// 1 = Jesus Tracks
	// 2 = Roll and Rock
	// 3 = Other

	public Ipod() {

		Song SampledToObbbllliiivvviiiiooonnnn = new Song("SampledToObbbllliiivvviiiiooonnnn", "Noah Hellman",
				"The essential Noah hellman", 130);
		Song AesteticSong = new Song("Aestetic Song", "Noah Hellman", "The essential Noah Hellman", 62);
		Song JazzAestetic = new Song("Jazz Aestetic", "Noah Hellman", "The essential Noah Hellman", 204);
		Song BadHombres = new Song("Bad Hombres", "Noah Hellman", "The essential Noah Hellman", 75);
		Song NoahHellYes = new Song("Noah HellYes", "Noah Hellman", "The Essential Noah Hellman", 56);
		Song HowIsDaWeather = new Song("How Is Da Weather", "Noah Hellman", "The essential Noah Hellman", 56);
		Song TooMuchSausageFattner = new Song("Too much sausage fattner", "Noah Hellman", "The essential Noah Hellman",
				190);
		Song WhyDoesEveryTrapSongHaveChantsThisIsWhy = new Song("Why Does Every Trap Song Have Chants? This Is Why",
				"Noah hellman", "The essential Noah Hellman", 182);
		Song CaravanIsh = new Song("Caravan- Ish", "Noah Hellman", "The essential Noah Hellman", 205);
		Song AndWhatIsAllepo = new Song("And What Is Allepo?", "Noah Hellman", "The essential Noah Hellman", 119);
		Song OhhhhhYes = new Song("Ohhhhh Yes", "Noah Hellman", "The essential Noah Hellman", 228);
		Song KPopSong1 = new Song("KPop Song 1", "Noah Hellman", "The essential Noah Hellman", 228);
		Song Milano = new Song("Milano", "Noah Hellman", "The essential Noah Hellman", 73);
		Song PredictionForDaddyHeGotATesla = new Song("Prediction For Daddy, He got a Tesla", "Noah Hellman",
				"The essential Noah Hellman", 25);
		Song DontRemixMeNoah = new Song("Don't Remix Me Noah", "Noah hellman", "The essential Noah Hellman", 231);
		Song OkayNoProblem = new Song("Okay, No Problem", "Noah Hellman", "The essential Noah hellman", 206);
		Song AlwaysAway = new Song("Always Away", "Noah Hellman", "The essential Noah Hellman", 169);
		Song ConversionsWithMiles = new Song("Conversations With Miles", "Noah Hellman", "The essential Noah Hellman",
				146);
		Song SomeDayMyPrinceWillCome = new Song("Some Day My Prince Will Come", "Noah Hellman",
				"The essential Noah Hellman", 297);
		Song SundayJamsPart5 = new Song("Sunday Jams Part 5", "Noah Hellman", "The essential Noah hellman", 180);
		Song SundayJamsPart4 = new Song("Sunday Jams Part 4", "Noah Hellman", "The essential Noah Hellman", 181);
		Song SundayJamsPart3 = new Song("Sunday Jams Part 3", "Noah Hellman", "The essential Noah Hellman", 132);
		Song SundayJams = new Song("Sunday Jams", "Noah Hellman", "The essential Noah Hellman", 134);
		Song MessingAround = new Song("Messing Around", "Noah Hellman", "The essential Noah Hellman", 499);
		Song Serendipity = new Song("Serendipity", "Noah Hellman", "The essential Noah Hellman", 331);

		Song InTheseLastDays = new Song("In These Last Days", "Mike Helms", "I Love Jesus", 204);
		Song HeIsOurGod = new Song("He Is Our God", "Mike Helms", "I Love Jesus", 181);
		Song JesusIsNotReligious = new Song("Jesus Is Not Religious", "Satan", "I LOve Jesus", 89);
		Song WoeBabylon = new Song("Woe Babylon", "The People of Babylon", "I Love Jesus", 124);
		Song JesusTakeTheWheel = new Song("Jesus Take The Wheel", "Noah", "I Love Jesus", 200);
		Song JesusOnMyMind = new Song("Jesus On My Mind", "Adam and Eve", "I Love Jesus", 160);
		Song PSALM19 = new Song("PSALM19", "Pastor Pat", "I love Jesus", 101);
		Song WheresThePowerLord = new Song("Wheres' The Power Lord", "God", "I Love Jesus", 77);
		Song SpirtWords = new Song("Spirit Words", "Abraham", "I Love Jesus", 60);
		Song AllYouReallyNeedIsJesus = new Song("All You Really Need Is Jesus", "Abel", "I Love Jesus", 134);
		Song WhatEverHappenedToJesus = new Song("What Ever Happened To Jesus", "Job", "I Love Jesus", 204);
		Song ToChristian = new Song("To Christian", "King Saul", "I Love Jesus", 174);
		Song JesusISMyBestFriend = new Song("Jesus Is My Best Friend", "Gabriel", "I Love Jesus", 301);
		Song JesusBuiltMyHotrod = new Song("Jesus Built My Hot Rod", "Ruth", "I Love Jesus", 156);
		Song Jesus = new Song("Jesus", "Queen", "I Love Jesus", 244);

		Song HellToHighWay = new Song("Hell To Highway", "CDCA", "Backwards Roll", 666);
		Song TNT = new Song("TNT", "CDAC", "Backwards Roll", 132);
		Song RhapsodyBohemian = new Song("Rhapsody Bohemian", "neeuq", "Backwards Roll", 145);
		Song UpYouGiveGonnaNever = new Song("Up You Give Gonna Never", "Astley Kicr", "Backwards Roll", 86);
		Song BlackItPaint = new Song("Black It Paint", "Stationary Stones", "Bakwards Roll", 100);
		Song HeavenToStairway = new Song("Heaven To Stairway", "Heallium submarine", "Backwards Roll", 301);
		Song WaterTheOnSmoke = new Song("Water The On Smoke", "Shallow yellow", "Backwards Roll", 142);
		Song NothingForMoney = new Song("Nothing For Money", "relaxing tributaries", "Backwards Roll", 201);

		Song ThomasTheTankEngingeFtBiggieSmalls = new Song("Thomas The Tank Enginge Ft. Biggie Smalls", "Mr. Conductor",
				"Lit music", 77);
		Song MomsSpaghetti = new Song("moms Spaghetti", "Jake greens random crap", "Lit Music", 99);
		Song JamesHowardChristmasClassic = new Song("James Howard Christmas Classic", "James Howard ft. Clash Royal",
				"Lit music", 122);

		Song[] UnListenible = { SampledToObbbllliiivvviiiiooonnnn, AesteticSong, JazzAestetic, BadHombres, NoahHellYes,
				HowIsDaWeather, TooMuchSausageFattner, WhyDoesEveryTrapSongHaveChantsThisIsWhy, CaravanIsh,
				AndWhatIsAllepo, OhhhhhYes, KPopSong1, Milano, PredictionForDaddyHeGotATesla, DontRemixMeNoah,
				OkayNoProblem, AlwaysAway, ConversionsWithMiles, SomeDayMyPrinceWillCome, SundayJamsPart5,
				SundayJamsPart4, SundayJamsPart3, SundayJams, MessingAround, Serendipity };

		Song[] JesusTracks = { InTheseLastDays, HeIsOurGod, JesusIsNotReligious, WoeBabylon, JesusTakeTheWheel,
				JesusOnMyMind, PSALM19, WheresThePowerLord, SpirtWords, AllYouReallyNeedIsJesus,
				WhatEverHappenedToJesus, ToChristian, JesusISMyBestFriend, JesusBuiltMyHotrod, Jesus };

		Song[] RollandRock = { HellToHighWay, TNT, RhapsodyBohemian, UpYouGiveGonnaNever, BlackItPaint,
				HeavenToStairway, WaterTheOnSmoke, NothingForMoney };

		Song[] Other = { ThomasTheTankEngingeFtBiggieSmalls, MomsSpaghetti, JamesHowardChristmasClassic };

		songs[0] = UnListenible;
		songs[1] = JesusTracks;
		songs[2] = RollandRock;
		songs[3] = Other;
	}

	public void printGenera() {
		Scanner input = new Scanner(System.in);
		System.out.print("What Genre do you want? ");
		String genera = input.nextLine();
		input.close();
		genera.toLowerCase();
		switch (genera) {
		case "unlistenible":
			System.out.print("Songs in UnListenible:");
			for (Song song : songs[0]) {
				String songName = song.getTitle();
				System.out.print(songName + ", ");
			}
			break;
		case "jesus tracks":
			System.out.print("Songs in Jesus Tracks:");
			for (Song song : songs[1]) {
				String songName = song.getTitle();
				System.out.print(songName + ", ");
			}
			break;
		case "roll and rock":
			System.out.print("Songs in Roll and Rock:");
			for (Song song : songs[2]) {
				String songName = song.getTitle();
				System.out.print(songName + ", ");
			}
			break;
		default:
			System.out.print("Songs not in any specific genera:");
			for (Song song : songs[3]) {
				String songName = song.getTitle();
				System.out.print(songName + ", ");
			}
		}

	}

	public void printAllSongs() {
		System.out.print("All the songs you have are: ");
		for (int i = 0; i < songs.length; i++) {
			for (int j = 0; j < songs[i].length; j++) {
				if (songs[i][j] != null) {
					System.out.print(songs[i][j].getTitle() + ", ");
				}
			}
			System.out.println();
		}
	}

	public void printPopular() {
		Song[] tmp = basicArray();
		for (int i = 0; i < songs.length; i++) {
			int length = songs[i].length;
			for (int j = 23; j < length; j++) {
				for (int k = 0; k < tmp.length; k++) {
					Song original = tmp[k];
					Song replacement = songs[i][j];
					if ((replacement != null) && (replacement.getTimesPlayed() >= original.getTimesPlayed())) {
						tmp = shiftDown(tmp, k);
						tmp[k] = songs[i][j];
						break;
					}
				}
			}
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(i + 1 + ": " + tmp[i].getTitle() + "(" + tmp[i].getTimesPlayed() + " ) ");
		}
	}

	private Song[] basicArray() {
		Song[] tmp = new Song[10];
		for (int i = 0; i < 10; i++) {
			tmp[i] = songs[0][i];
		}
		return tmp;
	}

	private Song[] shiftDown(Song[] tmp, int index) {
		for (int i = tmp.length - 1; i > index; i--) {
			tmp[i] = tmp[i - 1];
		}
		return tmp;
	}

	public void playSong(String title) {
		for (int i = 0; i < songs.length; i++) {
			for (int j = 0; i < songs[i].length; i++) {
				if (title == songs[i][j].getTitle()) {
					songs[i][j].setTimesPlayed(songs[i][j].getTimesPlayed() + 1);
					break;
				}
			}
		}
		System.out.println("Sorry, that song is not in this iPod");
	}

	public void playSong(Song song) {
		song.setTimesPlayed(song.getTimesPlayed() + 1);
	}

	public void printLongest() {
		Song[] tmp = basicArray();
		for (int i = 0; i < songs.length; i++) {
			for (int j = 0; j < songs[i].length; j++) {
				for (int k = 0; k < 10; k++) {
					if ((songs[i][j] != null) && (songs[i][j].getLength() > tmp[k].getLength())) {
						System.out.print(songs[i][j] + "; ");
						break;
					}
					break;
				}
			}
		}
	}
	
		
		
	public void printShortest() {
		Song[] tmp = basicArray();
		for (int i = 0; i < songs.length; i++) {
			for (int j = 0; j < songs[i].length; j++) {
				for (int k = 0; k < 10; k++) {
					if ((songs[i][j] != null) && (songs[i][j].getLength() < tmp[k].getLength())) {
						System.out.print(songs[i][j] + "; ");
						break;
					}
					break;
				}
			}
		}
	}

	public void randomSong() {

		Random row = new Random();
		Random col = new Random();
		int i = row.nextInt(4);
		int length = songs[i].length;
		int j = col.nextInt(length);
		while (songs[i][j] == null) {
			j = col.nextInt(length - 1);
			length--;
		}
		playSong(songs[i][j]);
		System.out.println("You just played: " + songs[i][j].getTitle());
	}

	public void addSong(String title, String artist, String album, int length, String genera) {
		Song tmp = new Song(title.toLowerCase(), artist.toLowerCase(), album.toLowerCase(), length);

		switch (genera) {
		case "unlistenible":
			putInGenera(tmp, 0);
			break;
		case "jesus tracks":
			putInGenera(tmp, 1);
			break;
		case "roll and rock":
			putInGenera(tmp, 2);
			break;
		default:
			putInGenera(tmp, 3);
		}
		System.out.println("Congagulations, you just add " + title +" to your iPod");
	}

	private void putInGenera(Song tmp, int genera) {
		for (int j = 0; j < songs[genera].length; j++) {
			if (songs[genera][j] == (null)) {
				songs[genera][j] = tmp;
				return;
			}
		}
		Song[] copy = new Song[songs[genera].length + 10];
		songs[genera] = copy;
	}

	public void deleteSong(String title) {
		for (int i = 0; i < songs.length; i++) {
			for (int j = 0; j < songs[i].length; j++) {
				Song tmp = songs[i][j];
				if ((tmp != null) && (title.toLowerCase() == tmp.getTitle().toLowerCase())) {
					songs[i][j] = null;
					break;
				}
			}
		}
		System.out.println("Sorry, that song is not in this iPod");
	}

	public void printAlbum(String album1) {
		for (int i = 0; i < songs.length; i++) {
			for (int j = 0; j < songs[i].length; j++) {
				if (songs[i][j].getAlbum().toLowerCase().equals(album1.toLowerCase())) {
					System.out.print(j + ":" + songs[i][j].getTitle() + ", ");
				}
			}
		}
	}

	public void printArtist(String artist) {
		for (int i = 0; i < songs.length; i++) {
			for (int j = 0; j < songs[i].length; j++) {
				if (songs[i][j].getArtist() == artist) {
					System.out.print(songs[i][j] + "; ");
				}
			}
		}
	}
}