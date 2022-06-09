package study;

public class Word {
	private String letters;

	public Word(String letters) {
		this.letters = letters.toLowerCase();
	}

	// i번째 글자가 모음인지 알려주는 메소드
	public boolean isVowel(int i) {
		boolean result = false;
		String vowel[] = { "a", "e", "i", "o", "u" };
		for (int j = 0; j < vowel.length; j++) {
			if (letters.substring(i, i + 1).equals(vowel[j])) {
				result = true;
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Word word = new Word("Hello World");
		System.out.println(word.isVowel(0));
		System.out.println(word.isVowel(1));
	}

}
