package com.company;

/**
 * Created by tk304 on 1/14/19.
 */
public class TowersOfHanoi {

    public static int size;

    public TowersOfHanoi(int size)
    {
        this.size = size;
    }

    public void Solve (int n, char from, char aux, char to)
    {
        if (n == 1)
        {
            System.out.println("Move one disk from tower " +  from + " to " + to);
            return;
        }
        Solve(n-1, from, to, aux);
        System.out.println("Move one disk from tower " +  from + " to " + to);
        Solve(n-1, aux, from, to);
    }

}
