package iPodLab;

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

	// cycles through each song, putting it in a 1d array if it is top ten
	public void printPopular() {
		Song[] tmp = new Song[10];
		for (int i = 0; i < songs.length; i++) {
			for (int j = 0; i < songs[i].length; j++) {
				for (int k = 0; k < 10; k++) {
					if (songs[i][j].getTimesPlayed() >= tmp[k].getTimesPlayed()) {
						tmp = shiftDown(tmp, k);
						tmp[k] = songs[i][j];
					}
				}
			}
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(i + 1 + ": " + tmp[i].getTitle() + "(" + tmp[i].getTimesPlayed() + ")");
		}
	}

	private Song[] shiftDown(Song[] tmp, int index) {
		for (int i = tmp.length - 1; i > index; i--) {
			tmp[i] = tmp[i - 1];
		}
		return tmp;
	}

	public void playSong() {
		Scanner input = new Scanner(System.in);
		System.out.print("What Song do you want to play? ");
		String title = input.next();
		input.close();
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

	public void printArtist() {
		Scanner input = new Scanner(System.in);
		System.out.print("What artist do you want to print? ");
		String artist = input.next();
		input.close();
		for (int i = 0; i < songs.length; i++) {
			for (int k = 0; k < songs[i].length; k++) {
				if (songs[i][k].getArtist() == artist) {
					System.out.print(songs[i][k].getTitle() + ", ");
				}
			}
		}
	}

	public void printLongest() {
		Song[] longSong = new Song[10];
		for (int i = 0; i < songs.length; i++) {
			for (int j = 0; i < songs[i].length; j++) {
				for (int k = 0; k < 10; k++) {
					if (songs[i][j].getLength() >= longSong[k].getLength()) {
						longSong = shiftDown(longSong, k);
						longSong[k] = songs[i][j];
					}
				}
			}
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(i + 1 + ": " + longSong[i].getTitle() + "(" + longSong[i].getTimesPlayed() + ")");
		}
	}

	public void printShortest() {
		Song[] shortSong = new Song[10];
		for (int i = 0; i < songs.length; i++) {
			for (int j = 0; i < songs[i].length; j++) {
				for (int k = 0; k < 10; k++) {
					if (songs[i][j].getLength() >= shortSong[k].getLength()) {
						shortSong = shiftDown(shortSong, k);
						shortSong[k] = songs[i][j];
					}
				}
			}
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(i + 1 + ": " + shortSong[i].getTitle() + "(" + shortSong[i].getTimesPlayed() + ")");
		}
	}

	public void playRandom() {

	}

}
