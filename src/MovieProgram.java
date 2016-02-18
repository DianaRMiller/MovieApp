import java.util.ArrayList;
import java.util.Scanner;

public class MovieProgram {
	static final String HORROR = "horror";
	static final String COMEDY = "comedy";
	static final String ANIMATED = "animated";
	static final String DRAMA = "drama";
	static final String SCIFI = "scifi";
	
	static ArrayList MovieList;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		MovieList = new ArrayList();
		MovieList.add(new Movie(HORROR,"It"));
		MovieList.add(new Movie(HORROR,"Jason"));
		MovieList.add(new Movie(COMEDY,"Step Dad"));
		MovieList.add(new Movie(COMEDY,"Blades of Glory"));
		MovieList.add(new Movie(ANIMATED,"Inside Out"));
		MovieList.add(new Movie(ANIMATED,"Minnions"));
		MovieList.add(new Movie(DRAMA,"The GodFather"));
		MovieList.add(new Movie(DRAMA,"Forrest Gump"));
		MovieList.add(new Movie(SCIFI,"Starwars"));
		MovieList.add(new Movie(SCIFI,"ET"));
		
		String userContinue = "y";
		
		while (userContinue.equalsIgnoreCase("y")) {
			System.out.println("Please select the Genre Number: 1.Horror, 2.Comedy, 3.Animated, 4.Drama, 5.SciFi: ");
			String userInput = scan.nextLine();
			String userGenre = "";
			switch (userInput) {//if userInput equals to 1 assign the variable HORROR and so on 
			case "1":
				userGenre = HORROR;
				break;
			case "2":
				userGenre = COMEDY;
				break;
			case "3":
				userGenre = ANIMATED;
				break;
			case "4":
				userGenre = DRAMA;
				break;
			case "5":
				userGenre = SCIFI;
				break;
			default:
				System.out.println("Invalid Input");
				break;
			}
			ArrayList B = getMoviesByCategory(userGenre);// new container named B type of arraylist assigns/= the result method called getMovies...that passes 
			for (int i = 0; i < B.size(); i++) {
				Movie C = (Movie) B.get(i);
				System.out.println(C.Genre +":" + " " + C.Title);
			} 
			System.out.println("Would you like to continue (y/n):");
			userContinue = scan.nextLine();
		}
	}//ArrayList is the return type of my method and the parameter is what I require a String
	public static ArrayList getMoviesByCategory (String genre1) {
		ArrayList results = new ArrayList();
		for (int i = 0; i < MovieList.size(); i++) {
		//creating a container A and putting the contents into it
			Movie A = (Movie)MovieList.get(i);
			if (A.Genre.equals(genre1)) {
				results.add(A);
			}
		}
		return results;
	}
}
