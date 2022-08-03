package quanlyxe;

public class XeBus extends Xe implements ActionCuaImp {
	private String nguoiSoatVe;
	// Interface -> Ghi đè và xuất ra kế thừa từ Method;
	@Override
	public void dongCua() {
		System.out.println("Đóng 2 cánh cửa");
	}
	
	@Override
	public void moCua() {
		System.out.println("Mở 2 cánh cửa");
	}
	
	// Getter and Setter
	public String getNguoiSoatVe() {
		return nguoiSoatVe;
	}

	public void setNguoiSoatVe(String nguoiSoatVe) {
		this.nguoiSoatVe = nguoiSoatVe;
	}
	
}
