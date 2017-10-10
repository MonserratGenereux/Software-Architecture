package mx.jzab.edu.refactoring.movies;


public class Statement {
	
	
	public Statement(String data){
		
		for(String line : data.split("\n")){
			System.out.println(line);
			
		}	
	}
}
