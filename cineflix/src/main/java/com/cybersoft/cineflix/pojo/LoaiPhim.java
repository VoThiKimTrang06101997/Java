package com.cybersoft.cineflix.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoaiPhim {
	private int id;
	
	@JsonProperty("tenLoai")
	private String ten_loai;
	
	@JsonProperty("hinhAnh")
	private String hinh_anh;
	
	/* getter and setter */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTen_loai() {
		return ten_loai;
	}

	public void setTen_loai(String ten_loai) {
		this.ten_loai = ten_loai;
	}

	public String getHinh_anh() {
		return hinh_anh;
	}

	public void setHinh_anh(String hinh_anh) {
		this.hinh_anh = hinh_anh;
	}
	
}
