public class palindrome {
    public  static  boolean IsPalindrome(String word){
        StringBuilder word_build = new StringBuilder(word);
        String word_reversed = word_build.reverse().toString();
        int count = 0;
        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) == word_reversed.charAt(i)){
                count++;
            }
        }
        return count == word.length();
    }

}
