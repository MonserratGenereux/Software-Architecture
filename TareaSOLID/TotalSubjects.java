package TareaSOLID;

import java.util.ArrayList;
import java.util.HashMap;

public class TotalSubjects implements Subject{
	HashMap<Integer,String> subjects= new HashMap<>();
	
	@Override
	public String subject() {
		subjects.put(1,"OPP");
		subjects.put(1,"Math");
		subjects.put(6,"Soft");
		return subjects.toString();
	}

	
}
