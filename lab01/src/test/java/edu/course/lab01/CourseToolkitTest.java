package edu.course.lab01;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class CourseToolkitTest {

    @Test
    void returnsTrueForEvenNumber() {
        boolean result = CourseToolkit.isEven(8);

        assertTrue(result);
    }

    @Test
    void returnsFalseForOddNumber() {
        boolean result = CourseToolkit.isEven(7);

        assertFalse(result);
    }
    @Test
    void returnsTrueForZero() {
        boolean result = CourseToolkit.isEven(0);
        assertTrue(result);
    }

    @Test
    void returnsTrueForNegativeEvenNumber() {
        boolean result = CourseToolkit.isEven(-8);
        assertTrue(result);
    }
    @Test
    void isPrimeReturnsFalseForNumberLessThanTwo() {
        assertFalse(CourseToolkit.isPrime(1));
        assertFalse(CourseToolkit.isPrime(0));
    }

    @Test
    void isPrimeReturnsTrueForTwo() {
        assertTrue(CourseToolkit.isPrime(2));
    }

    @Test
    void isPrimeReturnsFalseForCompositeNumber() {
        assertFalse(CourseToolkit.isPrime(4));
        assertFalse(CourseToolkit.isPrime(9));
    }

    @Test
    void isPrimeReturnsFalseForSquareOfPrime() {
        assertFalse(CourseToolkit.isPrime(49));
        assertFalse(CourseToolkit.isPrime(25));
    }
    @Test
    void isPalindromeReturnsTrueForPalindrome() {
        assertTrue(CourseToolkit.isPalindrome("madam"));
        assertTrue(CourseToolkit.isPalindrome("racecar"));
    }

    @Test
    void isPalindromeReturnsFalseForNonPalindrome() {
        assertFalse(CourseToolkit.isPalindrome("hello"));
    }

    @Test
    void isPalindromeIsCaseSensitive() {
        assertFalse(CourseToolkit.isPalindrome("Madam"));
    }

    @Test
    void isPalindromeThrowsForNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            CourseToolkit.isPalindrome(null);
        });
    }
    @Test
    void averageReturnsCorrectResult() {
        assertEquals(3.0, CourseToolkit.average(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void averageHandlesNegativeNumbers() {
        assertEquals(-2.0, CourseToolkit.average(new int[]{-1, -2, -3}));
    }

    @Test
    void averageThrowsForNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            CourseToolkit.average(null);
        });
    }

    @Test
    void averageThrowsForEmptyArray() {
        assertThrows(IllegalArgumentException.class, () -> {
            CourseToolkit.average(new int[]{});
        });
    }
    @Test
    void minReturnsCorrectValue() {
        assertEquals(1, CourseToolkit.min(new int[]{5, 3, 1, 9, 2}));
    }

    @Test
    void minHandlesNegativeNumbers() {
        assertEquals(-10, CourseToolkit.min(new int[]{-5, -10, -3}));
    }

    @Test
    void minThrowsForNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            CourseToolkit.min(null);
        });
    }

    @Test
    void maxReturnsCorrectValue() {
        assertEquals(9, CourseToolkit.max(new int[]{5, 3, 1, 9, 2}));
    }

    @Test
    void maxHandlesNegativeNumbers() {
        assertEquals(-1, CourseToolkit.max(new int[]{-5, -10, -1}));
    }

    @Test
    void maxThrowsForNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            CourseToolkit.max(null);
        });
    }
}
