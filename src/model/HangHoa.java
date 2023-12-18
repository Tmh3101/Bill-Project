package model;

public class HangHoa {
	private String mso, ten, nsxuat;
	
	public HangHoa() {
		mso = new String();
		ten = new String();
		nsxuat = new String();
	}
	
	public HangHoa(String mso, String ten, String nsxuat) {
		this.mso = new String(mso);
		this.ten = new String(ten);
		this.nsxuat = new String(nsxuat);
	}
	
	
	
	public HangHoa(HangHoa hh) {
		mso = new String(hh.mso);
		ten = new String(hh.ten);
		nsxuat = new String(hh.nsxuat);
	}
	
	
	
	public String getMso() {
		return mso;
	}

	public String getTen() {
		return ten;
	}

	public String getNsxuat() {
		return nsxuat;
	}
}
