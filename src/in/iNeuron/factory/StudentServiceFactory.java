package in.iNeuron.factory;

import in.iNeuron.service.IStudentService;
import in.iNeuron.service.StudentServiceImpl;

public class StudentServiceFactory {
    
	private static IStudentService studentserviceImpl;
	
	private StudentServiceFactory() {
		
	}
	
	public static IStudentService getStudentService() {
		if(studentserviceImpl==null) {
			studentserviceImpl=new StudentServiceImpl();
		}
		
		return studentserviceImpl;
	}
}
