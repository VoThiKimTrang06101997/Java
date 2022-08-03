package com.cybersoft.cineflix_api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "loaiphim_phim")
public class LoaiPhim_Phim {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
	@JoinColumn(name = "id_phim")
	private Phim phim;
//	private long id_phim;  // Foreign Key
	
	
	@ManyToOne
	@JoinColumn(name = "id_loaiphim")
	private LoaiPhim loaiPhim;
//	private long id_loaiphim;  // Foreign Key
	
	/* getters and setters */
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public Phim getPhim() {
		return phim;
	}


	public void setPhim(Phim phim) {
		this.phim = phim;
	}


	public LoaiPhim getLoaiPhim() {
		return loaiPhim;
	}


	public void setLoaiPhim(LoaiPhim loaiPhim) {
		this.loaiPhim = loaiPhim;
	}

}
