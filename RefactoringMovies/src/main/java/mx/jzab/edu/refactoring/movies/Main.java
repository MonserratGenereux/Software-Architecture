package mx.jzab.edu.refactoring.movies;

import java.io.IOException;

/**
 *
 * @author jzab
 */
public class Main {

	  public static void main( String[] args ) throws IOException{
	    Customer customer = new Customer( "John" );

	    Movie movie = new RegularMovie("Star Wars");
	    Movie movie2 = new RegularMovie("Piratas de Caribe");
	    Movie movie3 = new NewReleaseMovie("Blade Runner");
	    Movie movie4 = new ChildrenMovie("Cars");
	    Movie movie5 = new ChildrenMovie("Mickey Mouse");
	    
	    Rental rental = new Rental( movie, 4 );
	    Rental rental2 = new Rental( movie2, 3 );
	    Rental rental3 = new Rental( movie3, 5 );
	    Rental rental4 = new Rental( movie4, 2 );
	    Rental rental5 = new Rental( movie5, 1 );
	    
	    customer.addRental( rental );
	    customer.addRental( rental2 );
	    customer.addRental( rental3 );
	    customer.addRental( rental4 );
	    customer.addRental( rental5 );
	    
	    String statement = customer.statement();
	    System.out.println( statement );

	  }

	}
