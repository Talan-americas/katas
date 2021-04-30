package com.talan.interview.anagram;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class AnagramMainTest {

    @Test
    void areAnagrams() {
        //todo you test here
    }

    @Test
    void demoTest() {
        // here you can call your code with any argument:
//        AnagramMain.areAnagrams("1", "2");
//        // and you can use assertJ or usual junit assertions:
//        assertThat(AnagramMain.areAnagrams("1", "2")).isFalse();
//        assertFalse(AnagramMain.areAnagrams("1", "2"));
    }

    @Test
    void shouldReturnTrueIfIsAnagram() {
        //  scenario
        var firstWord = "united";
        var notAnagram = "untied";

        // target
        var result = AnagramMain.areAnagrams(firstWord, notAnagram);

        // assertions
        assertThat(result, is(true));
    }

    @Test
    void shouldReturnTrueIfIsAnagram() {
        //  scenario
        var firstWord = '6' + '12'; // 2*3 * 2*2*3
        var notAnagram = '4' + '18'; // 2*2 * 3*3*2

        // target
        var result = AnagramMain.areAnagrams(firstWord, notAnagram);

        // assertions
        assertThat(result, is(true));
    }

    @Test
    void shouldReturnFalseWhenNotAnagram() {
        //  scenario
        var firstWord = "united";
        var notAnagram = "untiet";

        // target
        var result = AnagramMain.areAnagrams(firstWord, notAnagram);

        // assertions
        assertThat(result, is(false));
    }
}
