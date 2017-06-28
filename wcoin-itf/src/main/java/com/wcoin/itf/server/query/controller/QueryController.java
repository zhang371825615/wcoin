package com.wcoin.itf.server.query.controller;

import java.io.IOException;

import org.bitcoin.market.AbstractMarketApi;
import org.bitcoin.market.MarketApiFactory;
import org.bitcoin.market.bean.Market;
import org.bitcoin.market.bean.Symbol;
import org.bitcoin.market.bean.SymbolPair;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.wcoin.common.domain.ResponseMessage;

@RestController
@RequestMapping("/query")
public class QueryController {
	
	
    @RequestMapping("queryYBTickers.do")
    @ResponseBody
	public ResponseMessage queryYBTickers(String first,String second) throws IOException{
    	
    	 ResponseMessage rm=new ResponseMessage();
    	 
		if(!StringUtils.isEmpty(second)&&!StringUtils.isEmpty(first)){
			 Symbol f = Symbol.valueOf(first);
			 Symbol s = Symbol.valueOf(second);
			 AbstractMarketApi market = MarketApiFactory.getInstance().getMarket(Market.PeatioCNY);
			 JSONObject jsonObj = market.ticker2(new SymbolPair(f, s));
			 rm.setData(jsonObj);
			
		}
		return rm;
		
	}
    
    
  
    
    
    
    
    
    
    
    
    
   
    
    
    
    
    
}
