package Nak.java;

import java.lang.*;

@SuppressWarnings("unused")
class _Util_Code
{
    protected _Util_Code(){};

    protected static final void doPrintInternal( Object obj )
    {
       System.out.println( obj ); 
    }

    protected static final void doPrintInternal( Object obj , boolean nextLine )
    {
        if( nextLine )
        {
            System.out.println( obj );
        }
        else
        {
            System.out.print( obj );
        }
    }
}
