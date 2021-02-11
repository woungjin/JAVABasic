package day10_public.poly2;

public class Teacher extends Person{
		String subject;

		public Teacher(String name, int age, String subject) {
			super(name, age);
			this.subject = subject;
		}

		@Override
		String info() {
			return "이름 : " + name + ", 나이 : " + age + ", 과목 : " + subject;
		}
		

	}
 
