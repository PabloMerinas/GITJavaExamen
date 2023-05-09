package nttdata.javaexam.business;

import java.util.List;

public class ManagmentServiceImpl implements ManagmentServiceI {

	private List<Student> listStudents;

	@Override
	public boolean addStudent(Student student) {
		return listStudents.add(student);
	}

	@Override
	public boolean delStudent(Student student) {
		return listStudents.remove(student);
	}

	@Override
	public void modifyStudent(Student student) {
		// TODO Auto-generated method stub
	}

	@Override
	public List<Student> listStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> listStudentsOrderByName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> listStudentsOrderByAge() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> listStudentsByCenter() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exportListToText(String archiveName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean exportListToBin(String archiveName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean exportListToXml(String archiveName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean exportListToJson(String archiveName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean recoverList(String archiveName) {
		// TODO Auto-generated method stub
		return false;
	}

}
