import org.omg.Messaging.SyncScopeHelper;

import java.util.HashMap;

public class StringUtils {

    public String reverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public Integer countuniqueWords(String str) {
        String[] words = str.split(" ");
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (words[i].equals(words[j])) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                count++;
            }
        }
        return count;
    }

    public HashMap<String, Integer> wordCount(String str) {
        HashMap<String, Integer> wordCount = new HashMap<>();
        String[] wordList = str.split(" ");
//        System.out.println(wordList.toString());
        for (String word : wordList) {
            Integer count = wordCount.get(word);
//            System.out.println(word);
            if (count == null) {
                wordCount.put(word, 1);
            } else {
                wordCount.put(word, count + 1);
            }

        }
        return wordCount;
    }
}



