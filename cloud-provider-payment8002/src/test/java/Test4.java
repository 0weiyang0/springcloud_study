import java.util.*;
import java.util.stream.Collectors;

/**
 * @author ZangNa
 * @version 1.0
 * @date 2022/12/7 9:25
 */
public class Test4 {
	public static void main(String[] args) {
		List<Car> cars = Arrays.asList(
				new Car("宝马","蓝色",300000),
				new Car("奔驰","黑色",400000),
				new Car("奥迪","红色",450000),
				new Car("保时捷","蓝色",600000),
				new Car("本田","白色",2000000),
				new Car("比亚迪","白色",220000),
				new Car("理想","黑色",250000)
		);

		//   中间操作的map
		cars.stream().map(car -> {
			return new Car(car.getName(), car.getPrice());
		}).forEach(System.out::println);


		//  分组
		Map<String, List<Car>> collect1 = cars.stream().collect(Collectors.groupingBy(car -> car.getColor()));
		System.out.println(collect1);

		//  汇总
		Object collect = cars.stream().collect(
										Collectors.summarizingInt(car -> car.getPrice()));
		System.out.println(collect);

		long count = cars.stream().count();
		System.out.println(count);

		Optional<Car> max = cars.stream().max((car1, car2) -> car1.getPrice() - car2.getPrice());
		System.out.println(max.toString());
		cars.stream().forEach(car -> System.out.println(car));
		// --------------    等价于  ----------->
		cars.stream().forEach(System.out::println);
	}
}

class Car{

	private String name;
	private String color;
	private Integer price;

	public Car() {
	}

public Car(String name, Integer price) {
	this.name = name;
	this.price = price;
}

public Car(String name, String color, Integer price) {
		this.name = name;
		this.color = color;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

public void setColor(String color) {
	this.color = color;
}

public Integer getPrice() {
	return price;
}

public void setPrice(Integer price) {
	this.price = price;
}

@Override
public String toString() {
	return "Car{" +
			       "name='" + name + '\'' +
			       ", color='" + color + '\'' +
			       ", price=" + price +
			       '}';
}
}
