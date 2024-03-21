package Nak.java;

import java.lang.*;

//@SuppressWarnings("unused")
public final class _Math 
{
    private _Math()
    {
    }

    public static int Factorial( int n )
    {
        int value = 1;
        for( int i = 1 ; i <= n ; i++ ) 
        {
            value *= i;
        }
        return value;
    }

    public static int Combination( int n , int r )
    { 
        int value = 0;
        value = Factorial(n) / ( Factorial(r) * Factorial(n - r));
        return value;
    }

    public static int Permutation( int n , int r )
    {
        int value = 0;
        if( n == r)
        {
            value = Factorial(n);
        }
        else
        {
            value = Factorial(n) / Factorial(n - r);
        }
        return value;
    }
}