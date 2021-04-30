package com.talan.interview.anagram;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class AnagramMain {

    public static void main(String[] args) {

        testAndPrint("untied", "united");
    }

    /**
     * Returns true if the two words are anagrams, and false if they are not.
     *
     * @param firstWord  one of the two words
     * @param secondWord the other one of the two words
     * @return true if words are anagrams, else returns false.
     */
    public static boolean areAnagrams(String firstWord, String secondWord) {
        var firstWordSum = calculateWordSum(firstWord);
        var secondWordSum = calculateWordSum(secondWord);
        var bothWordsHaveSameSize = firstWord.length() == secondWord.length();
        var bothWordsHaveSameSum = (firstWordSum == secondWordSum);

        //unitedd

        return bothWordsHaveSameSize && bothWordsHaveSameSum;
    }

    private static long calculateWordSum(String word) {
        long sum = 1L;

        for (var i = 0; i < word.length(); i++) {
            sum *= word.charAt(i);
        }

        return sum;
    }

    public static void testAndPrint(String firstWord, String secondWord) {
        log.info("Are \"" + firstWord + "\" and " + secondWord + " anagrams? " + areAnagrams(firstWord, secondWord));

    }
}
