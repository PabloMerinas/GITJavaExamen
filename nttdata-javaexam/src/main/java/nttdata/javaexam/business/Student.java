package nttdata.javaexam.business;

import java.util.List;
import java.util.Objects;

public abstract class Student {

	// Atributos de la clase
	private String name;
	private Integer age;
	private Center center;

	// Constructor de la clase
	protected Student(String name, Integer age, Center center) {
		this.name = name;
		this.age = age;
		this.center = center;
	}

	public abstract void saluda(List<Student> names);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Center getCenter() {
		return center;
	}

	public void setCenter(Center center) {
		this.center = center;
	}

	// Ordenacion por defecto POR EL NOMBRE
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	// Ordenacion por defecto POR EL NOMBRE
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Student [getName()=" + getName() + ", getAge()=" + getAge() + ", getCenter()=" + getCenter() + "]";
	}

}
