/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package pom.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static pom.java.App.palindrome;
import static pom.java.ReversedString.DEVELOPER;

class AppTest {

    /**
     * Assert if a text is a palindrome
     */
    @Test
    void textIsPalindrome() {
        String palindromeText = "Was it a car or a cat I saw?";
        assertTrue(palindrome(palindromeText));
    }

    /**
     * Assert if a text is not a palindrome
     */
    @Test
    void textIsNotPalindrome(){
        String palindromeText = String.format("This is code was developed by %s",DEVELOPER);
        assertFalse(palindrome(palindromeText));
    }
}
