package com.cos.jwtex01.web;

import java.net.URLEncoder;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.cos.jwtex01.naver.NaverCrawler;


/**
 * 네이버 크롤러 메인 클래스
 * 
 * @author steel
 * @since 2021.02.24
 */

@Service("naverService")
public class NaverService {

	public static void main(String[] args) {
		String id = "${property.naver.ClientID}";
        String secret ="${property.naver.ClientSecret}";
        
        try {
	        NaverCrawler crawler = new NaverCrawler();
	        String url = URLEncoder.encode("needjarvis", "UTF-8");
	        String response = crawler.search(id, secret, url);
	        System.out.println(response);	        
        } catch (Exception e) {
        	e.printStackTrace();
        }
	}
}