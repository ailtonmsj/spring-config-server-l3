package br.com.amsj.spring.cloud.l3.l3server.controller;

//@RestController
public class KeyController {

	//@Value("${lucky-word}")
	String luckyWord;

	//@GetMapping("/lucky-word")
	public String showLuckyWord() {
		return "The lucky word is: " + luckyWord;
	}
}
