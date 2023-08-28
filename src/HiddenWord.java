public class HiddenWord {
    private String hiddenWord;

    public HiddenWord(String hiddenWord){
        this.hiddenWord = hiddenWord.toUpperCase();
    }

    public static boolean isUpperCase(String s) {
        for (int i=0; i<s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                if (!Character.isUpperCase(s.charAt(i))) {
                    return false;
                }
            }
            else return true;
        }
        return true;
    }

    public String getHint(String input){
        if(!isUpperCase(input)) {
            throw new IllegalArgumentException("Your guess ( " + input + " ) does not contain all uppercase letters. Your guess must contain all uppercase letters!");
        }
        if(input.length() != hiddenWord.length()) {
            throw new IllegalArgumentException("Your guess ( " + input + " ) has " + input.length() + " characters. The hidden word has " + hiddenWord.length() + " characters. Your guess must be a word with " + hiddenWord.length() + " characters!");
        }
        else {
            String temp = "";
            for (int i = 0; i < hiddenWord.length(); i++) {
                if (input.charAt(i) == (hiddenWord.charAt(i))) {
                    temp += hiddenWord.charAt(i);
                } else if (hiddenWord.contains("" + input.charAt(i))) {
                    temp += "+";
                } else temp += "*";
            }
            return temp.toUpperCase();
        }
    }

    public String getHiddenWord(){
        return hiddenWord.toUpperCase();
    }


}
