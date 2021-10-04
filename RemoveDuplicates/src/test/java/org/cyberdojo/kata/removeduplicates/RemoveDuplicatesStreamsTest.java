package org.cyberdojo.kata.removeduplicates;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import static org.cyberdojo.kata.removeduplicates.Data.few_strings;
import static org.cyberdojo.kata.removeduplicates.Data.many_strings;
import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class RemoveDuplicatesStreamsTest {
    @Test
    @DisplayName("Should return empty array when null")
    void shouldReturnEmptyArrayWhenNull() {
        String[] args = null;
        String[] actual = RemoveDuplicatesStreams.removeDuplicates(args);
        assertEquals(0,actual.length, ()-> "Expected empty array");
    }

    @Test
    @DisplayName("Should return empty array when empty")
    void shouldReturnEmptyArrayWhenEmpty() {
        String[] args = new String[0];
        String[] actual = RemoveDuplicatesStreams.removeDuplicates(args);
        assertEquals(0,actual.length, ()-> "Expected empty array");
    }

    @Test
    @DisplayName("Should return same 1 sized array")
    void shouldReturnOneSizedArray() {
        String[] expected = {"1"};
        String[] args = {"1"};
        String[] actual = RemoveDuplicatesStreams.removeDuplicates(args);
        assertAll(
                ()-> assertEquals(expected.length,actual.length, ()-> "Expected array of length 1"),
                ()-> assertEquals(expected[0], actual[0], ()-> "Expected same value at index 0")
        );
    }

    @Test
    @DisplayName("Should return removed duplicates array")
    void shouldReturnUniqueValuesArray() {
        String[] expected = {"1","2"};

        String[] actual = RemoveDuplicatesStreams.removeDuplicates(few_strings);
        assertAll(
                ()-> assertEquals(expected.length, actual.length, ()-> "Expected same length of " + expected.length),
                ()-> assertEquals(expected[0], actual[0], ()-> "Expected same value at index 0"),
                ()-> assertEquals(expected[1], actual[1], ()-> "Expected same value at index 1")
        );
    }

    @Test
    @DisplayName("Should return removed duplicates for huge array")
    void shouldRemoveDuplicatesForHugeString() {

        String[] actual = RemoveDuplicatesStreams.removeDuplicates(many_strings);

        assertAll(
                ()-> assertEquals(1000, actual.length, ()-> "Expected same length of " +  1000),
                ()-> assertEquals("0038SAINEkk2QWA", actual[0], ()-> "Expected same value at index 0"),
                ()-> assertEquals("6Ig0lRdnQ1bbR5S", actual[100], ()-> "Expected same value at index 100")
        );
    }
}