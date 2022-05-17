package com.jobiak.empapi.resources;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catalog")
public class Product {

	//	@GetMapping("/mobile")

	@GetMapping(value="/mobile",produces=MediaType.APPLICATION_JSON_VALUE)
	public String showCatlog() {
		
		return new String ("Samsung E2FH,Dual camara,32GB Memory,49,999,I got you");
	}
	
	
	@GetMapping("/intro")
	public String introduction() {
		return new String("The #1 Manfacture of Digital Mobiles in Asia");
	}
	
	@GetMapping("/search/{modelId}")
	public String searchModel(@PathVariable(value="modelId")String modelId) {
		return new String(modelId+"is available only in blue and black clours");
	}
	
	@GetMapping("/search/{modelId}/brand/{brand}")
	public String searchModel(@PathVariable(value="modelId")String modelId,@PathVariable(value="brand")String brand) {
		return new String(modelId+brand+" is not available for your location ");
	}
	
}