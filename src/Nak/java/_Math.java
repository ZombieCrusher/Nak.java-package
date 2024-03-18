package Nak.java;

import java.lang.*;

//@SuppressWarnings("unused")
public final class _Math 
{
    private _Math(){};

    public static int Factorial( int n )
    {
        int value = 1;
        for( int i = 1 ; i <= n ; i++ ) 
        {
            value *= i;
        }
        return value;
    }

    //public static void Combinations(){}
    //public static void Permutations(){}
}
