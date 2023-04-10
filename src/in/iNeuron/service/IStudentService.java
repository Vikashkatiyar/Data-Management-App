package in.iNeuron.service;

import in.iNeuron.dto.Student;

public interface IStudentService {
   

	String save(Student student); // Creating a record

	Student findById(Integer sid);// Reading a record

	String updateById(Student student);// updating a record

	String deleteById(Integer sid);// Deleting a record
}
