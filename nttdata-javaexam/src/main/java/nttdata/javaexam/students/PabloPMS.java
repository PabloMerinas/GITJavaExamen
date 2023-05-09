package nttdata.javaexam.students;

import java.util.List;

import nttdata.javaexam.business.Center;
import nttdata.javaexam.business.Student;

public class PabloPMS extends Student {

	public PabloPMS() {
		this(null, null, null);
	}

	public PabloPMS(String name, Integer age, Center center) {
		super(name, age, center);
	}

	@Override
	public List<Student> saluda(List<Student> studentList) {
		// Te añades a ti mismo aqui
		studentList.add(new PabloPMS("Pablo", 23, Center.IESALIXAR));

		// Invocas al siguiente compañero
//		RobertoXXX next = new RobertoXXX();
		// Llamas al metodo
//		next.saluda(studentList);
		return studentList;
	}

}
