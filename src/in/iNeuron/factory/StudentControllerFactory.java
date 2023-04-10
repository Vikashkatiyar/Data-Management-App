package in.iNeuron.factory;

import in.iNeuron.controller.IStudentController;
import in.iNeuron.controller.StudentControllerImpl;

public class StudentControllerFactory {
		
	private static IStudentController studentController;
	
	private  StudentControllerFactory() {
		
	}
	
	public static IStudentController getStudentController() {
		if(studentController==null) {
			studentController=new StudentControllerImpl();
		}
		
		return studentController;
		
	}
}
