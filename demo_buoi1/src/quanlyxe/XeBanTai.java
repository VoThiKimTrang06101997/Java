package quanlyxe;

public class XeBanTai extends Xe implements ActionCuaImp{
	@Override
	public void dongCua() {
		System.out.println("Kéo cửa");
	}
	
	@Override
	public void moCua() {
		System.out.println("Mở cửa");
	}
	
	@Override
	public void lanBanh() {
		// super kế thừa từ class cha là class Xe
		super.lanBanh();
		System.out.println("Xe bán tải đang lăn bánh");
	}
}
