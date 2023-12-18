package model;

import java.util.ArrayList;

public class HoaDon {
	private String mso, tde, nvien;
	private ArrayList<ChiTiet> dsct;
	private KhachHang kh;
	private Date date;
	
	public HoaDon() {
		mso = new String();
		tde = new String();
		nvien = new String();
		dsct = new ArrayList<ChiTiet>();
		kh = new KhachHang();
		date = new Date();
	}
	
	public HoaDon(HoaDon hd) {
		mso = new String(hd.mso);
		tde = new String(hd.tde);
		nvien = new String(hd.nvien);
		dsct = new ArrayList<ChiTiet>();
		for (ChiTiet ct : hd.getDsct()) {
			dsct.add(ct);
		}
		kh = new KhachHang(hd.kh);
		date = new Date(hd.date);
	}
	
	public ArrayList<ChiTiet> getDsct() {
		return dsct;
	}

	
	public float tong() {
		float t = 0;	
		for (ChiTiet ct : dsct) {
			t += ct.ttien();
		}
		return t - (t * kh.layTlegiam());
	}
	
	public void themChiTiet(ChiTiet ct) {
		dsct.add(ct);
	}
	
	public void xoaChiTiet(ChiTiet ct) {
		dsct.remove(ct);
	}
	
	public boolean msoDaTonTai(ChiTiet oct) {
		for (ChiTiet ct : dsct) {
			if(ct.getHhoa().getMso().equals(oct.getHhoa().getMso())) return true;
		}
		return false;
	}
	
}
