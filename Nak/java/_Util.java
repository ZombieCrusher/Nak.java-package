package Nak.java;

import java.lang.*;

@SuppressWarnings("unused")
public final class _Util extends _Util_Code
{
    private _Util(){};

    public static void doPrint( Object obj )
    {
        doPrintInternal( obj );
    }

    public static void doPrint( Object obj , boolean nextLine )
    {
        doPrintInternal( obj , nextLine );
    }

    public static byte ReturnArrayDimension( Object array )
    {
        @SuppressWarnings("rawtypes")
        Class name = array.getClass();
        byte dimensionCount = 0;
        
        while( name.isArray() ) 
        {
            dimensionCount++;
            name = name.getComponentType();
        }

        return dimensionCount;
    }

    public static boolean IsArray( Object obj )
    {
        return obj.getClass().isArray();
    }

    public static boolean IsString( Object obj )
    {
        String className = obj.getClass().toString();
        if( className.substring( 0 , 5 ).toLowerCase().equals( "string" ) )
        {
            return true;
        }
        return false;
    }
}
