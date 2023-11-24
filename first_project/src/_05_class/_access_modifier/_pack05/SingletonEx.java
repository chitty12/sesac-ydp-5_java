package _05_class._access_modifier._pack05;

public class SingletonEx {

	public static void main(String[] args) {
		
//		생성자의 접근 제한자가 private이기 때문에 다른 클래스에서 접근 불가.
//		Singleton s1 = new Singleton();
		
//		정적 메소드를 호출해서 싱글콘 객체를 얻음
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		
		
		if(s2==s3) {
			System.out.println("s2와 s3는 같은 참조를 가지므로 같은 객체임!");
		} else {
			System.out.println("s2 와 s3는 다른 참조를 가지므로 다른 객체임!");
		}
		
		
		System.out.println(s2);
		System.out.println(s3);
	}
	
}
