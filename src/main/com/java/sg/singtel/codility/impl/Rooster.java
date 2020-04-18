package main.com.java.sg.singtel.codility.impl;

import java.util.HashMap;
import java.util.Map;

public class Rooster extends Chicken {

	private static final Map<String, String> langMap;
	static {
		langMap = new HashMap<String, String>();
		langMap.put("English", "Cock-a-doodle-doo");
		langMap.put("Tamil", "cocoraco");		
		langMap.put("Japanese", "ko-ke-kok-ko-o");		
		langMap.put("Urdu", "kuklooku");

	}

	public boolean fly() {
		System.out.println("I cannot fly");
		return false;
	}

	public boolean sing(String language) {

		if (null == language || language.isEmpty()) {
			// default as english
			System.out.println("Cock-a-doodle-doo");
		} else {
			System.out.println(langMap.get(language));
		}

		return true;
	}
}
