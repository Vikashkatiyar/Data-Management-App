package in.iNeuron.controller;

import in.iNeuron.dto.Student;
import in.iNeuron.factory.StudentServiceFactory;
import in.iNeuron.service.IStudentService;

public class StudentControllerImpl implements IStudentController {

	IStudentService stdService;

	@Override
	public String save(Student student) {
		stdService = StudentServiceFactory.getStudentService();
		 return stdService.save(student);
		
	}

	@Override
	public Student findById(Integer sid) {
		stdService = StudentServiceFactory.getStudentService();
		return stdService.findById(sid);
	}

	@Override
	public String updateById(Student student) {
		stdService = StudentServiceFactory.getStudentService();
		return stdService.updateById(student);
	}

	@Override
	public String deleteById(Integer sid) {
		stdService = StudentServiceFactory.getStudentService();
		return stdService.deleteById(sid);
	}

}
