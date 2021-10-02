/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Fareed Ally
 */

// Ask user for password (IN METHOD)
// Determine the strength of the password based on input (IN METHOD)
// Return the strength of password (IN METHOD)

package baseline;

import java.util.Scanner;

public class Solution25
{
    private static final Scanner in = new Scanner(System.in);

    private String password;
    private int strength;
    private String passStrength;

    private String input(String prompt)
    {
        return in.nextLine();
    }

    public int passwordValidator(String password)
    {
        boolean letters = false;
        boolean numbers = false;
        boolean special = false;

        char[] temp = password.toCharArray();

        for(char i : temp)
        {
            if(Character.isAlphabetic(i))
            {
                letters = true;
            }
            else if(Character.isDigit(i))
            {
                numbers = true;
            }
            else if((!Character.isDigit(i)) && (!Character.isAlphabetic(i)))
            {
                special = true;
            }
        }

        if(numbers && !letters && temp.length<8)
        {
            strength = 1;
        }
        else if(letters && !numbers && temp.length<8)
        {
            strength = 2;
        }
        else if(letters && numbers && !special && temp.length>=8)
        {
            strength = 3;
        }
        else if(letters && numbers && special && temp.length>=8)
        {
            strength = 4;
        }
        else
        {
            strength = 0;
        }

        return strength;
    }

    private String passwordStrength(int strength)
    {
        String temp = "";

        if(strength == 1)
        {
            temp = "Very Weak";
        }
        if(strength == 2)
        {
            temp = "Weak";
        }
        if(strength == 3)
        {
            temp = "Strong";
        }
        if(strength == 4)
        {
            temp = "Very Strong";
        }

        return temp;
    }



    public static void main(String[] args)
    {
        Solution25 main = new Solution25();

        main.password = main.input("Enter password: ");

        main.strength = main.passwordValidator(main.password);

        main.passStrength = main.passwordStrength(main.strength);

        System.out.printf("The password %s is a %s password. ", main.password, main.passStrength);
    }
}
