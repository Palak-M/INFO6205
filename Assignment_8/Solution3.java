/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution.pkg3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/**
 *
 * @author palak
 */
public class Solution3 {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> listOfWords = new HashSet(wordList);
        if (!listOfWords.contains(endWord))
            return 0;
        int shortestLength = 0;
        int startWordLength = beginWord.length();
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        while (!queue.isEmpty()) {
            shortestLength += 1;
            int size = queue.size();
            for (int i=0; i<size; i++) {
                char [] word = queue.peek().toCharArray();
                queue.remove();
                for (int pos=0; pos<startWordLength; pos++) {
                    char originalWord = word[pos];
                    for (char c='a'; c<='z'; c++) {
                        word[pos] = c;
                        if (String.valueOf(word).equals(endWord))
                            return shortestLength + 1;
                        if (!listOfWords.contains(String.valueOf(word)))
                            continue;
                        listOfWords.remove(String.valueOf(word));
                        queue.add(String.valueOf(word));
                    }
                    word[pos] = originalWord;
                }
            }
        }
        return 0;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Solution3 ob= new Solution3();
        String beginWord="hit";
        String endWord="cog";
        List<String> wordList= Arrays.asList("hot", "dot", "dog","lot", "log","cog");
        System.out.println(ob.ladderLength(beginWord, endWord, wordList));
    }
    
}
