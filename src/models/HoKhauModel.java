package models;

public class HoKhauModel {
	int maHo;
	int soThanhvien;
	String diaChi;
	String tenChuHo;
	double tienCanDong;
	double tienDaDong;
	
	public HoKhauModel() {
		
	}
	
	public HoKhauModel(int soThanhVien, String diaChi) {
		this.soThanhvien = soThanhVien;
		this.diaChi = diaChi;
	}

	public HoKhauModel(int maHo ,int soThanhVien, String diaChi) {
		this.maHo=maHo;
		this.soThanhvien = soThanhVien;
		this.diaChi = diaChi;
	}

	
	public int getMaHo() {
		return maHo;
	}

	public void setMaHo(int maHo) {
		this.maHo = maHo;
	}


	public int getSoThanhvien() {
		return soThanhvien;
	}

	public void setSoThanhvien(int soThanhvien) {
		this.soThanhvien = soThanhvien;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public double getTienCanDong() {
		return tienCanDong;
	}

	public void setTienCanDong(double tienCanDong) {
		this.tienCanDong = tienCanDong;
	}

	public double getTienDaDong() {
		return tienDaDong;
	}

	public void setTienDaDong(double tienDaDong) {
		this.tienDaDong = tienDaDong;
	}

	public String getTenChuHo() {
		return tenChuHo;
	}

	public void setTenChuHo(String tenChuHo) {
		this.tenChuHo = tenChuHo;
	}
	
	
	
}
