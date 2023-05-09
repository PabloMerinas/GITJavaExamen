package nttdata.javaexam.business;

import java.util.List;

public interface ManagmentServiceI {

	boolean addStudent(Student student);

	boolean delStudent(Student student);

	void modifyStudent(Student student);

	List<Student> listStudents();

	List<Student> listStudentsOrderByName();

	List<Student> listStudentsOrderByAge();

	List<Student> listStudentsByCenter();

	//Se exportara a un archivo .txt
	boolean exportListToText(String archiveName);

	// Se exportara a un archivo .dat
	boolean exportListToBin(String archiveName);

	// Se exportara a un archivo .xml
	boolean exportListToXml(String archiveName);

	// Se exportara en un archivo .json
	boolean exportListToJson(String archiveName);

	// Dependiendo de la extension del archivo, tendra diferentes metodos para recuperar la información
	boolean recoverList(String archiveName);

}
