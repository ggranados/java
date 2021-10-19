package org.cyberdojo.kata.removeduplicates;

import static org.cyberdojo.kata.removeduplicates.Data.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;


@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class RemoveDuplicatesTest {

    @Test
    @DisplayName("Should return empty array when null")
    void shouldReturnEmptyArrayWhenNull() {
        String[] args = null;
        String[] actual = RemoveDuplicates.removeDuplicates(args);
        assertEquals(0,actual.length, ()-> "Expected empty array");
    }

    @Test
    @DisplayName("Should return empty array when empty")
    void shouldReturnEmptyArrayWhenEmpty() {
        String[] args = new String[0];
        String[] actual = RemoveDuplicates.removeDuplicates(args);
        assertEquals(0,actual.length, ()-> "Expected empty array");
    }

    @Test
    @DisplayName("Should return same 1 sized array")
    void shouldReturnOneSizedArray() {
        String[] expected = {"1"};
        String[] args = {"1"};
        String[] actual = RemoveDuplicates.removeDuplicates(args);
        assertAll(
                ()-> assertEquals(expected.length,actual.length, ()-> "Expected array of length 1"),
                ()-> assertEquals(expected[0], actual[0], ()-> "Expected same value at index 0")
        );
    }

    @Test
    @DisplayName("Should return removed duplicates array")
    void shouldReturnUniqueValuesArray() {
        String[] expected = {"1","2"};

        String[] actual = RemoveDuplicates.removeDuplicates(few_strings);
        assertAll(
                ()-> assertEquals(expected.length, actual.length, ()-> "Expected same length of " + expected.length),
                ()-> assertEquals(expected[0], actual[0], ()-> "Expected same value at index 0"),
                ()-> assertEquals(expected[1], actual[1], ()-> "Expected same value at index 1")
        );
    }

    @Test
    @DisplayName("Should return removed duplicates for huge array")
    void shouldRemoveDuplicatesForHugeString() {

        String[] actual = RemoveDuplicates.removeDuplicates(many_strings);

        assertAll(
                ()-> assertEquals(1000, actual.length, ()-> "Expected same length of " +  1000),
                ()-> assertEquals("oHOGMUIlDGHKN8M", actual[0], ()-> "Expected same value at index 0"),
                ()-> assertEquals("S6FmfF5aYLMicrT", actual[100], ()-> "Expected same value at index 100")
        );
    }
}