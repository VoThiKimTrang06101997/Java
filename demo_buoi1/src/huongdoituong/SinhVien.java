package huongdoituong;

public class SinhVien {
		private String hoTen;
		private double diemTB = 0;
		
		public void tinhDiemTrungBinh(double diemTB) {
			/* 
			 * Điểm trung bình từ 9 -> 10đ => Học sinh giỏi
			 * Điểm trung bình từ 7 -> 8đ => Học sinh khá
			 * Điểm trung bình từ 5 -> 6đ => Học sinh trung bình
			 * Điểm trung bình dưới 5 => Yếu
			 * */
			if(diemTB >= 9 && diemTB <= 10) {
				System.out.println("Bạn là học sinh giỏi");
			} else if(diemTB >= 7 && diemTB <= 8) {
				System.out.println("Bạn là học sinh khá");
			} else if(diemTB >= 5 && diemTB <= 6) {
				System.out.println("Bạn là học sinh trung bình");
			} else if(diemTB < 5){
				System.out.println("Bạn là học sinh yếu");
			} else {
				System.out.println("Điểm trung bình không hợp lệ");
			}
		}
		
		// getter, setter
		public String getHoTen() {
			return hoTen;
		}
		public void setHoTen(String hoTen) {
			this.hoTen = hoTen;
		}
		
		public double getDiemTB() {
			return diemTB;
		}
		public void setDiemTB(double diemTB) {
			this.diemTB = diemTB;
	}
	
