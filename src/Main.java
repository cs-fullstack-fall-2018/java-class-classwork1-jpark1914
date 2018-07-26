import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	Person person1 = new Person();
	Person person2 = new Person();
	Person person3 = new Person();

	person1.setWeight(134);
	person2.setWeight(187);
	person3.setWeight(300);

	person1.setHeight(56);
	person2.setHeight(66);
	person3.setHeight(73);

	System.out.println(person1.bodyMassIndex());
	System.out.println(person2.bodyMassIndex());
	System.out.println(person3.bodyMassIndex());


		ArrayList<Person> people = new ArrayList<Person>();
		people.addAll(Arrays.asList(person1,person2,person3));
		person2.printPerson();

    }
}
