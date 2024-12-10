package Comparable;

public class Student implements Comparable<Student>{
	private Integer id;
	private String name;
	private Integer age;
	private String Address;
	private String Course;
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
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
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", Address=" + Address + ",Course=" + Course + "]";
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.id.compareTo(o.id);
		//return this.name.compareTo(o.name);
		//return this.Address.compareTo(o.Address);
		//return this.age.compareTo(o.age);
		//return this.Course.compareTo(o.Course);
		
	}

}
