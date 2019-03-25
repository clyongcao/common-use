package myTest;

public class FormateTest {

	public static void main(String[] args) {

		// 需要按顺序
		String a = String.format("order_data_%s_%s", 15, "fc70b11a-65fe-47a8-a5c2-9d1e93702380");

		System.out.println(a);
		System.out.printf("100的16进制数是：%x %n", 100);
		System.out.printf("%c的大写是：%s %n", 'F', "字母F");

	}

}
