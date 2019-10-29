package main;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String input1 = "- . .-.. .-.. / -- . / .. ..-. / - .... .. ... / - .-. .- -. ... .-.. .- - . ... / -.-. --- .-. .-. . -.-. - .-.. -.-- / --- .-. / .. ..-. / -.-- --- ..- / . -. -.. / ..- .--. / .-- .. - .... / --. .. -... -... . .-. .. ... ....";
		String input2 = "choo choo asshole";
		MorseCodeTranslator morse = new MorseCodeTranslator();
		String input3 = morse.translateToMorse(input2);
		//System.out.println(input3);
		String output = morse.translateToString(input3);
		System.out.println(output);
	}

}
