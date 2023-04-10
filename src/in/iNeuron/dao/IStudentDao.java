package in.iNeuron.dao;

import in.iNeuron.dto.Student;

public interface IStudentDao {

	String save(Student student); // Creating a record

	Student findById(Integer sid);// Reading a record

	String updateById(Student student);// updating a record

	String deleteById(Integer sid);// Deleting a record
}
