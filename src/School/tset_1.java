package School;
import javax.print.attribute.Size2DSyntax;
public class tset_1 {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setScore(600);	
		s1.setName("Pete");
		System.out.println(s1.getName()+"����"+s1.getScore());
		Student s2 = new Student("Alice",590);
		System.out.println(s2.getName()+"����"+s2.getScore());
		
		Course c1=new Course();
		c1.setCourse_name("Java�������");
		c1.setCourse_book("Java��������");
		System.out.println(c1.getCourse_name()+"���ſ�ʹ�õĽ̲��ǡ�"+c1.getCourse_book()+"��");
	}

}
