package _05_class._access_modifier._pack04;

import _05_class._access_modifier._pack03.A;

public class C {

	 public void method() {
		 A a =new A(); // A 클래스와 C 클래스는 패키지가 다르므로 import 
		 
//		 필드 변경
		 a.field1 = 111;
//		 a.field2 = 222; // default field 이므로 x
//		 a.field3 = 333; // private 
		 
	 }

}
