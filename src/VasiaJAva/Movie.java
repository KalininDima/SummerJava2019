package VasiaJAva;
/*
 * Abstraction - implementation hiding - it’s when method doesn’t have a body -
 *  method describes what to do instead of how to do. Abstract class stands 
 *  for partial abstraction. Most of the methods will be regular, only some 
 *  of them abstract. In case of interface, it should be 100% abstraction.
Example: public abstract void setName(String name);
In interface we can only have abstract, static, and default methods. NO instance
 vars, only constants. in interface we cannot have constructor
we can only extend one abstract class, but implement multiple interfaces
Inheritance: it’s when one class extends another and inherits properties and 
behavior from the parent class. Private methods/vars cannot be inherited as 
well as a constructor. The idea is to continue and improve in 
the child class parent class.
 */
public class Movie extends Object{
private String rating;
private int idNumber;
private String title;

//accessor and metator methods. means getter and setter
public void setRating(String rating) {
	this.rating = rating;
}

public int getIdNumber() {
	return idNumber;
}

public void setIdNumber(int idNumber) {
	this.idNumber = idNumber;
}

public String getTitle() {
	return title;
}

public void setTitle (String title) {
	this.title = title;
}

//based on our criteria , check if 2 object are same

@Override
public boolean equals(Object object) {
	Movie movie = (Movie) object;
	return this.idNumber == movie.getIdNumber();
}

//to describe object
@Override
public String toString() {
	return "Movie{" + " rating = " + rating +'\''+ 
			", id Number = " + idNumber + '\''+
			" title = "+title+"}";
				
}

//create an overriden  method named calcFeeLAted
//that takes as input the number of days a movie

public double calcLateFees(int days) {
	return days*2;
}

public Movie getMovieById(Movie [] movies, int movieID) {
	for (Movie m: movies) {
		if (m.idNumber == movieID) {
			return m;
		}
	}
}
}
