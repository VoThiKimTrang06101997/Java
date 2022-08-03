package quanlyxe;

// Nếu implements ở class cha 
public abstract class Xe implements ActionCuaImp {
	protected String bienSoXe;
	protected String taiXe;
	protected String tuyenDi;
	protected int banhXe;
	protected double doanhThu;
	protected String phamViHoatDong;
	
	// Nạp chồng (Overload)
	public Xe() {
		
	}
	
	public Xe(String bienSoXe) {
		
	}
	
	public void dongCua() {
		System.out.println("Đóng cửa");
	}
	public void moCua() {
		System.out.println("Mở cửa");
	}
	
	public void lanBanh() {
		System.out.println("Xe đang lăn bánh");
	}
}
