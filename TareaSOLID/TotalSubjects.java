package TareaSOLID;


import java.util.ArrayList;
import java.util.List;

public class TotalSubjects{
	
	private Subject subject;
	private List <Subject> subjects = new ArrayList<Subject>();
	
	public Subject getSubject(String name){
		if(this.subjects.isEmpty()){return null;
			
		}else{
		for (int i = 0; i <= subjects.size(); i++) {
			System.out.println(subjects.get(i).getName());
			if(subjects.get(i).getName().equals(name)){
				this.subject=subjects.get(i);
				System.out.println(subjects.get(i).getName());
				break;
			}
			
        }
		return this.subject;
		}
	}
	
	public void addSubject(Subject subject) {
		this.subjects.add(subject);
	}
	
	


	//Tu clase TotalSubjects debe guardar todas las materias, 
	//y debe tener un metodo: public Subject getSubject(String name)   
	//que regrese el objecto Subject si le das el nombre
	
}
