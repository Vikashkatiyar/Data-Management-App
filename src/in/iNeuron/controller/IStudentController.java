package in.iNeuron.controller;

import in.iNeuron.dto.Student;

public interface IStudentController {
	
	
	String save(Student student); // Creating a record

	Student findById(Integer sid);// Reading a record

	String updateById(Student newStudent);// updating a record

	String deleteById(Integer sid);// Deleting a record

}
