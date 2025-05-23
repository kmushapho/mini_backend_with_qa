public class anagram {
    static public boolean IsAnagram(String word1, String word2){
        int count = 0;
        int length = word1.length();
        if (length == word2.length()){
            for (int i = 0; i < word1.length(); i++){
                char letter = word1.charAt(i);
                if (word2.contains(word1.valueOf(letter))){
                    count ++;
                }
            }
        }

        return count == length || ExactSame(word1, word2);
    }

    public static boolean ExactSame(String word1, String word2){
        int count = 0;
        if (anagram.IsAnagram(word1,word2)){
            for (int i =0; i < word1.length(); i++){
                if (word1.charAt(i) == word2.charAt(i)){
                    count ++;
                }
            }
        }
        return count == word1.length();
    }


}
