package _05_class._abstract;

public class StudentEx {

	public static void main(String[] args) {
		Kim k = new Kim("김철수", "ㄱㄴㄷ고등학교", 17, 20220001);
		Baek b = new Baek("백영희", "xyz 고등학교", 18, 20220002);

		System.out.printf("===%s 학생의 정보===\n", k.getName());
		System.out.println("학교: " + k.getSchool() );
		System.out.println("나이: " + k.getAge() );
		System.out.println("학번: " + k.getNums() );				
		k.todo();
		System.out.printf("===%s 학생의 정보===\n", b.getName());
		System.out.println("학교: " + b.getSchool() );
		System.out.println("나이: " + b.getAge() );
		System.out.println("학번: " + b.getNums() );				
		b.todo();
	}

}
