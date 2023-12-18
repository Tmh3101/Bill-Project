package model;

public class KhachHang {
	private String cccd, hten;
	private int nsinh;

	public KhachHang() {
		cccd = new String();
		hten = new String();
		nsinh = 0;
	}

	public KhachHang(KhachHang kh) {
		cccd = new String(kh.cccd);
		hten = new String(kh.hten);
		nsinh = kh.nsinh;
	}

	public float layTlegiam() {
		return 0;
	}
}
