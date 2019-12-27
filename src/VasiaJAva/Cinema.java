package VasiaJAva;

import java.util.Scanner;

public class Cinema {
	
	public static void main(String[] args) {
		Movie movie1 = new Movie();
		movie1.setIdNumber(1);
		movie1.setRating("PG13");
		movie1.setTitle("Ford v Ferrari");
		
		Movie movie2 = new Movie();
		movie2.setIdNumber(2);
		movie2.setRating("PG");
		movie2.setTitle("Frozen 2");
		System.out.println(movie1.equals(movie2));
		
		
		System.out.println(movie1);
		
		Movie[] movies = new Movie[2];
		movies[0] = movie1;
		movies[1] = movie2;
		
		Scanner scan  = new Scanner(System.in);
		
		System.out.println("Enter a movie ID: ");
		int movieID = scan.nextInt();
		if (movieID <=movies.length) {
			System.out.println("How many days it was late? : ");
			int days = scan.nextInt();
			System.out.println("Late fee: "+ movies[movieID-1].calcLateFees(days)+"$");
		} else {
			System.out.println("Invalid movie ID!");
		}
	}

}
