package com.cybersoft.cineflix_api.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "phim")
public class Phim {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne()
	@JoinColumn(name = "id_quocgia")
	QuocGia quocGia;
//	private int idQuocGia; // Foreign Key
//	
//	@OneToMany(mappedBy = "phim")
//	private Set<LoaiPhim_Phim> loaiPhimPhims;
//	
//	@OneToMany(mappedBy = "phim")
//	private Set<ChiTietPhim> chiTietPhims;
	
	@Column(name = "ten_phim")
	private String tenPhim;
	
	@Column(name = "hinh_anh")
	private String hinhAnh;
	
	@Column(name = "ngay_tao")
	@Temporal(TemporalType.DATE)
	private Date ngayTao;
	
	@Column(name = "mo_ta")
	private String moTa;
	
	/* getters and setters */
	public long getId() {
		return id;
	}

	public QuocGia getQuocGia() {
		return quocGia;
	}

	public void setQuocGia(QuocGia quocGia) {
		this.quocGia = quocGia;
	}

	public void setId(long id) {
		this.id = id;
	}

//	public QuocGia getQuocGia() {
//		return quocGia;
//	}
//
//	public void setQuocGia(QuocGia quocGia) {
//		this.quocGia = quocGia;
//	}
//
//	public Set<LoaiPhim_Phim> getLoaiPhimPhims() {
//		return loaiPhimPhims;
//	}
//
//	public void setLoaiPhimPhims(Set<LoaiPhim_Phim> loaiPhimPhims) {
//		this.loaiPhimPhims = loaiPhimPhims;
//	}
//
//	public Set<ChiTietPhim> getChiTietPhims() {
//		return chiTietPhims;
//	}
//
//	public void setChiTietPhims(Set<ChiTietPhim> chiTietPhims) {
//		this.chiTietPhims = chiTietPhims;
//	}

	public String getTenPhim() {
		return tenPhim;
	}

	public void setTenPhim(String tenPhim) {
		this.tenPhim = tenPhim;
	}

	public String getHinhAnh() {
		return hinhAnh;
	}

	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}

	public Date getNgayTao() {
		return ngayTao;
	}

	public void setNgayTao(Date ngayTao) {
		this.ngayTao = ngayTao;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	
}
