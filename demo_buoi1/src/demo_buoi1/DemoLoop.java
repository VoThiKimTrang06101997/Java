package demo_buoi1;

public class DemoLoop {
	public static void main(String[] args) {
		/* for(giá trị bắt đầu ban đầu; điều kiện so sánh để tiếp tục chạy; tăng giá trị ban đầu)
		 * 1 + 2 +3 + 4 + 5 + 6 + 7 + 8 + 9 + 10
		 * */
//		int soCanTinhTong = 10;
//		int ketQua = 0;
//		for(int giaTriBanDau = 1; giaTriBanDau <= soCanTinhTong; giaTriBanDau++) {
//			// Đúng với điều kiện thì thực hiện
//			ketQua = giaTriBanDau + ketQua;
//			System.out.println("Kết quả từ vòng lặp for " + giaTriBanDau);
//		}
//		System.out.println("Kết quả tính tổng: " + ketQua);
		
		/* while(điều kiện) {
		 * 	code chạy khi thỏa điều kiện
		 * 		ketQua = ketQua + giaTriBanDau ;
		 * }
		 * */
//		int soCanTinhTong = 100;
//		int i = 0;
//		int ketQua = 0;
//		while(i <= soCanTinhTong) {
//			ketQua += i;
//			System.out.println("Kiểm tra vòng lặp while " + i);
//			i++;
//		}
//		System.out.println("Kết quả: " + ketQua);
		
		/* Cú pháp:  do {
		 * 
		 * } while(dieukien)
		 * */
		int i = 0;
		int ketQua = 0;
		int soCanTinhTong = 100;
		do {
			// Chạy code ở đây lần đầu tiên
			ketQua += i;
			System.out.println("Kiểm tra vòng lặp while " + i);
			i++;
		} while (i <= soCanTinhTong);
		System.out.println("Kết quả: " + ketQua);
	}
}
