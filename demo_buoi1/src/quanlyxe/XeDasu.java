package quanlyxe;

public class XeDasu extends Xe implements ActionCuaImp {
	@Override
	public void dongCua() {
		System.out.println("Không có cửa để đóng");
	}
	
	@Override
	public void moCua() {
		System.out.println("Không có cửa để mở");
	}
	
	@Override
	public void lanBanh() {
		// super đại diện cho thằng cha  -> Super này đại diện cho class Xe
		super.lanBanh();
	}
	
	public void getColor() {
		System.out.println("Màu xe Dasu là màu vàng");
	}
	
	
}
