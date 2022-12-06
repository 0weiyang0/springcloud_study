import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Stream;

/**
 * @author ZangNa
 * @version 1.0
 * @date 2022/12/6 11:58
 */
public class Test1 {
	public static void main(String[] args) {
		//list,collection,set都提供了stream
		//  将数据转化为arrayList
		List<Integer> list = Arrays.asList(1,2,4);
		list.stream().filter(num -> num < 3);

		//  以下是想存多少数据就存多少数据
		Stream.of(1,2,3);
		//  以下是存n个一样的数
		Stream.generate(() -> "1234").limit(100);
		//  以下方法是可以使数字发生改变的
		Stream.iterate(1,(i) -> ++i).limit(100);
	}

}
