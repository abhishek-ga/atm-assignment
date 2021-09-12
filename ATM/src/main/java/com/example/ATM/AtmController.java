package com.example.ATM;

import java.util.HashMap;
import java.util.Map;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AtmController {
	@Autowired
	AtmBean aBean;
	
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value="/transactions" , method = RequestMethod.POST)
	@ResponseBody
	public Map<String, String> transactions(@RequestBody long cardNo) {
		Map<String, String> map = new HashMap<String, String>();
		String found = "false";
		String message="User doesn't exists! Please register first";

		for(int i =0 ; i< aBean.size(); i ++){
			if(cardNo == aBean.getCards(i)) {
				found = "true";
				message = "User exists!";
			}
		}
	    map.put("message", message);
	    map.put("CardNo", String.valueOf(cardNo));
	    map.put("found", found);
	    return map;
	}
	
	
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value="/register" , method = RequestMethod.POST)
	@ResponseBody
	public JSONObject register(@RequestBody long cardNo) {
		JSONObject json = new JSONObject();
		aBean.setCards(cardNo);
		//cardNo1=aBean.getCards(aBean.size()-1);
		json.put("message","Card Registered");
		return json;
	}
}