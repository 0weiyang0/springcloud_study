import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author ZangNa
 * @version 1.0
 * @date 2022/12/6 21:26
 */
public class Test2 {
	public static void main(String[] args) {
		System.out.println("用于测试github");
		Integer[] array = { 1,2,3,4,5,6,7};
		Stream.of(array).forEach(s-> System.out.println(s%2==0));
		long count = Stream.of(array).count();
		System.out.println(count);
//		Stream.of(array).map((int1,str1)-> {return int1.toString()});
//		List<User> users = Arrays.asList(
//				new User("zhangsan", "123"),
//				new User("lisi", "456"),
//				new User("wangwu", "789"),
//				new User("zhaoliu", "178")
//		);
//		int i = 0;
//		Stream.of(users).map((userList,userList2)-> );
//
	}

}
class User{
	public String name;
	public String pass;

public User() {
}

public User(String name) {
	this.name = name;
}

public User(String name, String pass) {
	this.name = name;
	this.pass = pass;
}
}
