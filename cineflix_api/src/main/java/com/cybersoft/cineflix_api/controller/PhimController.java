package com.cybersoft.cineflix_api.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cybersoft.cineflix_api.entity.Phim;
import com.cybersoft.cineflix_api.services.FileSystemStorageServiceImp;
import com.cybersoft.cineflix_api.services.PhimServiceImp;

@RestController
@RequestMapping("/phim")
public class PhimController {
	
	Logger logger = LoggerFactory.getLogger(PhimController.class); 
	
	@Autowired
	PhimServiceImp phimServiceImpl;
	
	@Autowired
	FileSystemStorageServiceImp fileSystemStorageServiceImp;
	
//	@Secured({"ROLE_USER","ROLE_CREATE"})
//	@PostAuthorize("hasRole('ROLE_UPDATE')")
	
	@GetMapping("")
	public ResponseEntity<?> getAllPhim() {
		
		 logger.trace("Trace Level Log");
		 logger.debug("Debug Level Log");
		 logger.info("Info Level Log");
		 logger.warn("Warn Level Log");
		 logger.error("Error Level Log");
		 
		 // JackSon, GSOn Map thành String
		 // localhost:8080/file
		 // ten_loai, ten_phim, hinh_anh, servletContext
		 
		 
		 // Cách 2
		 // Duyệt listPhim
		 // Lấy giá trị của hình ảnh và gán ngược lại
		 
		 
		List<Phim> listPhim = phimServiceImpl.getAllPhim();
		return new ResponseEntity<List<Phim>>(listPhim, HttpStatus.OK);
		 
//		 List<Map<String, ?>> listPhim = phimServiceImpl.getAllPhim();
//		 return new ResponseEntity<List<Map<String, ?>>>(listPhim, HttpStatus.OK);
		
//		List<Map<String, ?>> listPhimCategory = phimServiceImpl.getAllPhimWithCategory();
//		return new ResponseEntity<>(listPhimCategory, HttpStatus.OK);
		
	}
	
	@GetMapping("/{id_quocgia}")
	public ResponseEntity<?> getPhimByQuocGia(@PathVariable("id_quocgia") int id_quocgia) {
		List<Map<String, ?>> listPhim = phimServiceImpl.getPhimByQuocGia(id_quocgia);
		return new ResponseEntity<List<Map<String, ?>>>(listPhim, HttpStatus.OK);		
	}
	
	@GetMapping("/theloai")
	public ResponseEntity<?> getAllPhimWithCategory() {
		List<Map<String, ?>> listPhimCategory = phimServiceImpl.getAllPhimWithCategory();
		return new ResponseEntity<List<Map<String, ?>>>(listPhimCategory, HttpStatus.OK);		
	}
	
	@PostMapping("")
	public ResponseEntity<?> insertPhim(@RequestParam("file") MultipartFile file,
			@RequestParam("tenphim") String tenphim,
			@RequestParam("mota") String mota
			) {
		fileSystemStorageServiceImp.init();
		if(fileSystemStorageServiceImp.saveFile(file)) {
			Phim phim = new Phim();
			phim.setTenPhim(tenphim);
			phim.setMoTa(mota);
			phim.setHinhAnh(file.getOriginalFilename());
			
			phimServiceImpl.insertPhim(phim);
		};
		return new ResponseEntity<String>("", HttpStatus.OK);
		
	}
	
	
	
	
}
