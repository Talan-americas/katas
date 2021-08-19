package com.talan.interview.anagram;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;

class AnagramMainTest {

    @Test
    void areAnagrams() {
        //todo you test here
    }

    @Test
    void demoTest() {
        // here you can call your code with any argument:
        AnagramMain.areAnagrams("1", "2");
        // and you can use assertJ or usual junit assertions:
        assertThat(AnagramMain.areAnagrams("1", "2")).isFalse();
        assertFalse(AnagramMain.areAnagrams("1", "2"));

        assertThat(AnagramMain.areAnagrams("abc", "abc   ")).isFalse(); // false (except if you want to trim input)
        assertThat(AnagramMain.areAnagrams("untied", "united")).isTrue(); // true
        assertThat(AnagramMain.areAnagrams("a", "a")).isTrue(); // true
        assertThat(AnagramMain.areAnagrams("aab", "aba")).isTrue(); // true
        assertThat(AnagramMain.areAnagrams("aab", "abc")).isFalse(); // false
        assertThat(AnagramMain.areAnagrams("aaba", "caab")).isFalse(); // false 
        assertThat(AnagramMain.areAnagrams("aba", "baab")).isFalse(); // false
    }
}
