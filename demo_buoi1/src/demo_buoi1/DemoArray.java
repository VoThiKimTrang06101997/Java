package demo_buoi1;

import java.util.ArrayList;
import java.util.List;

public class DemoArray {
	public static void main(String[] args) {
//		int[] array = {1,2,3};
		String[] arrayString = {"Java", "Array", "Java Core", "SpringBoot"};
		
//		for(int i=0; i <= arrayString.length - 1; i++) {
//			System.out.println("Giá trị mảng: " + i);
//			System.out.println("Giá trị mảng " + arrayString[i]);
//			break;
//		}
		
		// foreach  -> Xử lý luôn hết cả mảng mà ko cần phải hiển thị ra từng index
//		for (String value : arrayString) {
//			System.out.println("Giá trị mảng foreach " + value);
//		}
		
		List<String> listString = new ArrayList<>();
		listString.add("Java");
		listString.add("Array");
		listString.add("Java Core");
		listString.add("Spring Boot");
		
		for(int i=0; i <= listString.size() - 1; i++) {
			System.out.println("Giá trị mảng: " + i);
			System.out.println("Giá trị mảng " + listString.get(i));
		}
		
//		for(String value: listString) {
//			System.out.println("Giá trị mảng foreach " + value);
//		}
	}
}
