package demo_buoi1;

import java.util.Scanner;   // import thư viện Scanner

public class DataType {
	public static void main(String[] args) {
		/* Khai báo biến - cú pháp
		 * Kiểu dữ liệu - tên biến - giá trị của biến */
//		boolean isSuccess = false;
//		isSuccess = true;
//		System.out.println("Kiểm tra tên biến: " + isSuccess);	
		
		/* Đối với kiểu dữ liệu là số thì có thể thực hiện được các phép tính tổng (Operator): +, -, *, /, +=, -=, *=, /= */
//		byte soA = 5, soB = 127;
//		byte ketQua = (byte) (soA + soB);
////		int ketQua = soA + soB;
//		System.out.println("Kiểm tra kết quả: " + ketQua);
		
		Scanner scanner = new Scanner(System.in);
		String soScanner = scanner.next();
		System.out.println("Kiểm tra scanner: " + soScanner);
	}
}