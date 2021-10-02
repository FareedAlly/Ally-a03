package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution24Test
{
    Solution24 test = new Solution24();

    @Test
    void isAnagram()
    {
        assertTrue(test.isAnagram("note", "tone"));
        assertFalse(test.isAnagram("qqq", "www"));
    }

}