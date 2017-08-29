package TareaSOLID;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String answer="";
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Name:");
	    String name = scanner.nextLine();
	    System.out.println("Semester:");
	    int semester = Integer.parseInt(scanner.nextLine());
	    

	    
	    LinkedList<String> enrollment = new LinkedList<>();
	    TotalSubjects total = new TotalSubjects();
	    Subject OOP = new Subject("OOP","1");
	    total.addSubject(OOP);
	    Subject Math = new Subject("Math","1");
	    total.addSubject(Math);
	    Subject Math2 = new Subject("Math2","1");
	    total.addSubject(Math2);
	    
	    total.getSubject("OOP");
	    
		/*do{
		      System.out.println("Which subject you like to enroll?");
		      answer = scanner.nextLine();
		      if(total.subject().contains(answer)){
		    	  if((answer.equals("Soft") && semester<=5)){
		    		  System.out.println(">>>  You can't enroll on this subject until 6th semester");
		    	  }else{
		    		  System.out.println(">>> Done. Good look on your '" + answer + "' class");
			    	  enrollment.add(answer);
		    	  }
		    	  
		      }
		          
		}while(!"Exit".equals(answer)); */ 
		
		
	

	}

}
