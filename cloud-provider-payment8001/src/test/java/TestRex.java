import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ZangNa
 * @version 1.0
 * @date 2022/12/1 12:50
 */
public class TestRex {

//	public static void main(String[] args) {
//		String str = "再见，JAVA，你好，Golang,学好编程，program";
//		//  创建一个模式对象，可以理解为一个正则表达式对象
//		Pattern pattern = Pattern.compile("[a-zA-Z]+");
//		//  匹配器，按照pattern模式，到str文本中去匹配，找到返回true,否则为false
//		Matcher matcher = pattern.matcher(str);
//		while (matcher.find()){
//			System.out.println(matcher.group(0));
//		}
//	}


	public static void main(String[] args) {
		String str = "ajgoengdfoe1fo90355454";
		Pattern compile = Pattern.compile("\\d\\d");
		Matcher matcher = compile.matcher(str);
		while (matcher.find()){
			System.out.println("找到："+matcher.group(0));
		}

	}


}
