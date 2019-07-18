package com.example.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StringController {
	@GetMapping("ReverseWords")
	public String reverseWords(@RequestParam("sentence") String sentence) {
		// splitting based on space
		String words[]=sentence.split("\\s");  
	    String reverseWord="";  
	    for(String word:words){  
	        StringBuilder sb=new StringBuilder(word);  
	        sb.reverse();  
	        reverseWord+=sb.toString()+" ";  
	    }  
	    return reverseWord.trim();  
	}
}
