import java.time.ZonedDateTime;

/**
 * @author ZangNa
 * @version 1.0
 * @date 2022/12/6 16:34
 */
public class Test2 {
	public static void main(String[] args) {
		// 2022-12-06T16:35:01.361+08:00[Asia/Shanghai]
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println(zonedDateTime);
	}
}
