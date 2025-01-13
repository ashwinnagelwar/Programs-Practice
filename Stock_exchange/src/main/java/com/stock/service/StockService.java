package com.stock.service;

import java.net.http.HttpHeaders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StockService {

	private static final String NSE_URL = "https://www.nseindia.com/api/quote-equity?symbol=DABUR";
	
	@Autowired
    private RestTemplate restTemplate;

    public String getStockPrice() {
        org.springframework.http.HttpHeaders headers = new org.springframework.http.HttpHeaders();
        headers.add("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36");
        HttpEntity<String> entity = new HttpEntity<>(headers);

//        ResponseEntity<String> response = restTemplate.exchange(NSE_URL, HttpMethod.GET, entity, String.class, symbol);
        //return response.getBody(); // Returns full JSON response; parse it for specific fields
        ResponseEntity<String> forEntity = restTemplate.getForEntity(NSE_URL, String.class);
        
        return forEntity.getBody();
    }
}
