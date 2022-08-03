package huongdoituong;

public class NhanVien {
	// Thuộc tính
	public String hoTen;
	public String maNhanVien;
	public String cmnd;
	public String email;
	public String sdt;
	public String gioiTinh;
	public float diemTrungBinh;
	
	/*Phương thức khởi tạo*/
	public NhanVien() {};
	
	public NhanVien(String hoTen, String maNhanVien, String cmnd, String email, String sdt, String gioiTinh, float diemTrungBinh) {
		this.hoTen = hoTen;
		this.maNhanVien = maNhanVien;
		this.cmnd = cmnd;
		this.email = email;
		this.sdt = sdt;
		this.gioiTinh = gioiTinh;
		this.diemTrungBinh = diemTrungBinh;
	}
	
	// Phương thức
	public void tinhLuong() {
		System.out.println("Đây là hàm tính lương");
	}
	
	public void tongGioLam() {
		System.out.println("Đây là hàm tính giờ làm");
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getMaNhanVien() {
		return maNhanVien;
	}

	public void setMaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}

	public String getCmnd() {
		return cmnd;
	}

	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	
	
//	public String getHoTen() {
//		if(hoTen.equals("Nguyễn Văn A")) {
//			return "Bi";
//		}
//		return this.hoTen;
//	}
//	
//	public void setHoTen(String hoTen) {
//		this.hoTen = hoTen;
//	}
	
	/* 
	 * Điểm trung bình từ 9 -> 10đ => Học sinh giỏi
	 * Điểm trung bình từ 7 -> 8đ => Học sinh khá
	 * Điểm trung bình từ 5 -> 6đ => Học sinh trung bình
	 * Điểm trung bình dưới 5 => Yếu
	 * */
	public float getDiemTrungBinh() {
		if(diemTrungBinh >= 9 && diemTrungBinh <=10) {
			System.out.println("Học sinh giỏi");
		} else if(diemTrungBinh >= 7 && diemTrungBinh <=8) {
			System.out.println("Học sinh khá");
		} else if(diemTrungBinh >= 5 && diemTrungBinh <=6) {
			System.out.println("Học sinh trung bình");
		} else if(diemTrungBinh < 5) {
			System.out.println("Học sinh yếu");
		} else {
			System.out.println("Không nằm trong vùng điểm nào hết");
		}
		return diemTrungBinh;
	}
	
	public void setDiemTrungBinh(float diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}
	
}

