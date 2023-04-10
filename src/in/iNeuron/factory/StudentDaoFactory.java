package in.iNeuron.factory;

import in.iNeuron.dao.IStudentDao;
import in.iNeuron.dao.StudentDaoImpl;

public class StudentDaoFactory {
	
	private static IStudentDao studentDao=null;
	
	private StudentDaoFactory() {
		
	}
	
	public static IStudentDao getStudentDao() {
		if(studentDao==null) {
			studentDao=new StudentDaoImpl();
		}
		
		return studentDao;
	}
}
