package Nak.java;

import java.lang.*;

class _Util_Code
{
    protected _Util_Code()
    {
    }

    static final void doPrintInternal( Object obj )
    {
       System.out.println( obj ); 
    }

    static final void doPrintInternal( Object obj , boolean nextLine )
    {
        if( nextLine )
            System.out.println( obj );
        else
            System.out.print( obj );
    }
}