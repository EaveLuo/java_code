package one;

public class Example01 {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "张三";
		s1.age = 19;
		s1.speak();
		Student s2 = new Student();
		s2.name = "李四";
		s2.age = 20;
		s2.speak();
		Student s3 = new Student();
		s3 = s2;
		s3.speak();
	}
}
