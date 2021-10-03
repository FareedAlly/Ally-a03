/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Fareed Ally
 */

package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution35Test
{
    Solution35 test = new Solution35();

    @Test
    void winner()
    {
        ArrayList<String> names = new ArrayList<>();

        names.add("Alpha");
        names.add("Bravo");
        names.add("Charlie");
        names.add("Delta");
        names.add("Echo");
        names.add("Foxtrot");

        for(int i=0; i<100; i++)
        {
            assertTrue(names.contains(test.winner(names, 3)));
        }
    }

}