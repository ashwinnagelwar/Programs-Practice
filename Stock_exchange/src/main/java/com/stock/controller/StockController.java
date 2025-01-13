package com.stock.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.stock.service.StockService;

@RestController
public class StockController {

	 private final StockService stockService;

	    public StockController(StockService stockService) {
	        this.stockService = stockService;
	    }

	    @GetMapping("/nse-stock-price")
	    public String getStockPrice() {
	        return stockService.getStockPrice();
	    }
}
