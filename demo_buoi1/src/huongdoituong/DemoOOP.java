package huongdoituong;

import java.util.Scanner;

public class DemoOOP {
	public static void main(String[] args) {
		NhanVien nhanVienA = new NhanVien("Nguyễn Văn A", "MS001", "123456789", "abc@gmail.com", "0908752634", "Nam", 8);
//		System.out.println("Kiểm tra họ tên: " + nhanVienA.getHoTen());
		
		Scanner diem = new Scanner(System.in);
		System.out.print("Nhập điểm: ");
		float input_diem = diem.nextFloat();
		
		NhanVien nhanVienB = new NhanVien();
//		nhanVienB.setHoTen("Nhân viên B");
//		System.out.println("Kiểm tra họ tên: " + nhanVienB.getHoTen());
		nhanVienB.setDiemTrungBinh(input_diem);
		System.out.println("Kiểm tra điểm trung bình: " + nhanVienB.getDiemTrungBinh());
		
		// Cach 2
//		NhanVien nhanVienB = new NhanVien();
//		nhanVienB.hoTen = "Nguyễn Văn B";
//		
//		System.out.println("Nhân viên: " + nhanVienA.hoTen);
//		System.out.println("Nhân viên: " + nhanVienB.hoTen);
		
	}
}

