package study;

public class Word {
	private String letters;

	public Word(String letters) {
		this.letters = letters.toLowerCase();
	}

	// i번째 글자가 모음인지 알려주는 메소드
	public boolean isVowel(int i) {
		return letters.substring(i, i + 1).equals("a")
				 || letters.substring(i, i + 1).equals("e")
				 || letters.substring(i, i + 1).equals("i")
				 || letters.substring(i, i + 1).equals("o")
				 || letters.substring(i, i + 1).equals("u");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Word word = new Word("Hello World");
		System.out.println(word.isVowel(0));
		System.out.println(word.isVowel(1));
	}

}
