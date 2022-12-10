import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author ZangNa
 * @version 1.0
 * @date 2022/12/7 8:58
 */

public class Test3 {
	public static void main(String[] args) {
		String str = "Hello world";
		Consumer<String> c1 = ((String s1 )-> System.out.println(s1.length()));
		Consumer<String> mc1 = (String s1)->{
			System.out.println(s1.length());
		};
		Consumer<String> mc2 = (String s1)->{
			System.out.println(s1.toUpperCase());
		};
		Consumer<String> mc3 = s1->{
			System.out.println(s1.substring(0,5));
		};
//		mc2.accept(str);
		mc1.andThen(mc2.andThen(mc3)).accept(str);


		Stream.generate(()->  "Hello").limit(100);
//		Stream.iterate();
	}
}
