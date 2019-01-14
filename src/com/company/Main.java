package com.company;
import java.util.*;

public class Main {

    public static boolean TryParse(String a)
    {
        try
        {
            Integer.parseInt(a);
            return true;
        }
        catch (Exception x)
        {
            return false;
        }
    }

    public static TowersOfHanoi PromptInput()
    {
        Scanner scan = new Scanner(System.in);

        String in = scan.nextLine();
        if (TryParse(in))
        {
            return new TowersOfHanoi(Integer.parseInt(in));
        }
        else
        {
            System.out.println("Input is not a number!");
            PromptInput();
        }
    }

    public static void main(String[] args) {

        System.out.print("Enter number of blocks: ");
        TowersOfHanoi toh = PromptInput();

    }
}
