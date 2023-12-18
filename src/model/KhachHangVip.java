package model;

public class KhachHangVip extends KhachHang{
	private float tlegiam;
	
	public KhachHangVip() {
		super();
		tlegiam = 0;
	}
	
	public KhachHangVip(KhachHangVip khv) {
		super(khv);
		tlegiam = khv.tlegiam;
	}
	
	public float layTlegiam() {
		return tlegiam;
	}
	
}
