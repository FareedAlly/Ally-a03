/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Fareed Ally
 */

package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution29Test
{
    Solution29 test = new Solution29();

    @Test
    void output()
    {

        assertEquals("Sorry. That's not a valid input. ", test.output("0"));
    }


}