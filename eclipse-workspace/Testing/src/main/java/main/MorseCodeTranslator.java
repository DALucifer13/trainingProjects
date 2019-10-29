package main;

import java.util.HashMap;

public class MorseCodeTranslator {
	HashMap<String, String> code = new HashMap<String, String>();
	
	public void buildDictionaryToString() {
		code.put(".-", "a");
		code.put("-...", "b");
		code.put("-.-.", "c");
		code.put("-..", "d");
		code.put(".", "e");
		code.put("..-.", "f");
		code.put("--.", "g");
		code.put("....", "h");
		code.put("..", "i");
		code.put(".---", "j");
		code.put("-.-", "k");
		code.put(".-..", "l");
		code.put("--", "m");
		code.put("-.", "n");
		code.put("---", "o");
		code.put(".--.", "p");
		code.put("--.-", "q");
		code.put(".-.", "r");
		code.put("...", "s");
		code.put("-", "t");
		code.put("..-", "u");
		code.put("...-", "v");
		code.put(".--", "w");
		code.put("-..-", "x");
		code.put("-.--", "y");
		code.put("--..", "z");
		code.put("/", " ");
	}
	
	public void buildDictionaryToMorse() {
		code.put("a", ".-");
		code.put("b", "-...");
		code.put("c", "-.-.");
		code.put("d", "-..");
		code.put("e", ".");
		code.put("f", "..-.");
		code.put("g", "--.");
		code.put("h", "....");
		code.put("i", "..");
		code.put("j", ".---");
		code.put("k", "-.-");
		code.put("l", ".-..");
		code.put("m", "--");
		code.put("n", "-.");
		code.put("o", "---");
		code.put("p", ".--.");
		code.put("q", "--.-");
		code.put("r", ".-.");
		code.put("s", "...");
		code.put("t", "-");
		code.put("u", "..-");
		code.put("v", "...-");
		code.put("w", ".--");
		code.put("x", "-..-");
		code.put("y", "-.--");
		code.put("z", "--..");
		code.put(" ", "/");
	}
	
	public String translateToString(String input) {
		buildDictionaryToString();
		String output = "";
		String[] morse = input.split(" ");
		for (int i = 0; i < morse.length; i++) {
			output = output + code.get(morse[i]);
		}
		return output;
	}
	
	public String translateToMorse(String input) {
		buildDictionaryToMorse();
		String output = "";
		for (int i = 0; i < input.length(); i++) {
			output = output + input.charAt(i) + " ";
			System.out.println(input.charAt(i));
		}
		return output;
	}
	
}
