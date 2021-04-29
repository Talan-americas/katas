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
    }
}
