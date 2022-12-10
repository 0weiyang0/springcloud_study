import lombok.Data;

import java.util.Arrays;
import java.util.List;

/**
 * @author ZangNa
 * @version 1.0
 * @date 2022/12/7 13:00
 */
public class Test5 {

public static void main(String[] args) {
	List<Person> peoples = Arrays.asList(
			new Person("zhangsan", 18),
			new Person("lisi", 16),
			new Person("wangwu", 20),
			new Person("zhaoliu", 30)
	);
	peoples.sort((person1,person2)->Person.compareByAge(person1,person2));

}

}


@Data
class Person{
	private String name;
	private Integer age;

public Person(String name, int age) {
	this.name = name;
	this.age = age;
}

public static int compareByAge(Person a, Person b) {
		return a.age.compareTo(b.age);
	}
}
