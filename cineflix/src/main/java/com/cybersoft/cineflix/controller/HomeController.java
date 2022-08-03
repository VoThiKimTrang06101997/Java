package com.cybersoft.cineflix.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cybersoft.cineflix.pojo.LoaiPhim;
import com.cybersoft.cineflix.pojo.Phim;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/*
 * @Controller: Dành cho việc làm web Java.
 * @RestController: Dành cho việc viết API không có giao diện.
 * */

@Controller
@RequestMapping("/home")

public class HomeController {
	@GetMapping("")
	public ModelAndView home() {
		ModelAndView andView = new ModelAndView("home");
//		
//		int soA = 10;
//		int soB = 20;
//		int tong = tinhTong(soA, soB);
//		
//		andView.addObject("KetQua", tong);
//		
		String response = getDataTypeGet("http://localhost:8080/phim");
		
		ObjectMapper mapper = new ObjectMapper();
		try {
			Phim[] phims = mapper.readValue(response, Phim[].class);
			andView.addObject("phims", phims);
			
//			for (Phim phim : phims) {
//				System.out.println(phim.getTenPhim());
//			}
			
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(response);
		
		// CateGory
		String responseCategory = getDataTypeGet("http://localhost:8080/loaiphim");
		ObjectMapper objectMapper = new ObjectMapper();
		
		try {
			LoaiPhim[] loaiphims = objectMapper.readValue(responseCategory, LoaiPhim[].class);
			andView.addObject("loaiphims", loaiphims);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
      return andView;
//		
	}
	
	private String getDataTypeGet(String url) {
		StringBuilder responseData = new StringBuilder();
		
		// Khai báo sử dụng đường dẫn
		try {
			URL newUrl = new URL(url);
			HttpURLConnection connection = (HttpURLConnection) newUrl.openConnection();
			connection.setRequestMethod("GET");
			
			// BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			// Lấy Input stream (Dữ liệu trả về từ URL) từ đường dẫn
			InputStream inputStream = connection.getInputStream();
			// Đọc dữ liệu từ inputstream
			InputStreamReader reader = new InputStreamReader(inputStream);
			// Tạo bộ nhớ đệm
			BufferedReader bufferedReader = new BufferedReader(reader);
			
			// Line đại diện cho từng dòng data đọc được
			String line = "";
			while ((line = bufferedReader.readLine()) != null) {
				responseData.append(line);
			}
			
			bufferedReader.close();
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return responseData.toString();   
		
		
	}
	
//	private int tinhTong(int soA, int soB) {
//		int tong = 0;
//		tong = soA + soB;
//		return tong;
//	}
}
