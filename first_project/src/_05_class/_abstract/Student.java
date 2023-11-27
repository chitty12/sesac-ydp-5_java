package _05_class._abstract;

public abstract class Student {
	
	String name;
	String school;
	Integer age;
	Integer nums;
	
	public Student(String name, String school, Integer age, Integer nums) {
		this.name = name;
		this.school = school;
		this.age = age;
		this.nums = nums;
	}
	
	
	abstract void todo();


	public String getName() {
		return name;
	}


	public String getSchool() {
		return school;
	}


	public Integer getAge() {
		return age;
	}


	public Integer getNums() {
		return nums;
	}
	
	
	
}
