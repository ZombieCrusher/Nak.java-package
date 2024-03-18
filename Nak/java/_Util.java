package Nak.java;

import java.lang.*;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

//@SuppressWarnings("unused")
//@SuppressWarnings("deprecation")
public final class _Util
{
    private _Util(){};

    public static void doPrint( Object obj )
    {
        System.out.println( obj ); 
    }

    public static void doPrint( Object obj , boolean nextLine )
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

    public static byte ReturnArrayDimension( Object array )
    {
        //@SuppressWarnings("rawtypes")
        Class<?> name = array.getClass();
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
        else
        {
            return false;
        }
    }

    public static void shutdownWindows()
    {
        try 
        {
            doPrint( "Shutting Down windows!" );
            doWait( (short) 1 );
            Runtime.getRuntime().exec("shutdown -s -t 0");
        } 
        catch(Exception e) 
        {
            doPrint(e);
            doPrint( "Shutdown Failed" );
        }
    }

    public static void shutdownWindows( short time )
    {
        try
        {
            for( short i = 1 ; i <= time ; i++ )
            {
                doPrint( "Shutting Down Windows in "+time+" seconds!!" );
                doWait( (short) 1 );
            }

            doPrint("Shutting down windows!");
            doWait( (short) 1 );
            Runtime.getRuntime().exec("shutdown -s -t "+time);
        } 
        catch(Exception e) 
        {
            doPrint(e);
            doPrint("Shutdown Failed");
        }
    }

    public static void doWait( short time )
    {
        try 
        {
            Thread.sleep( time * 1000 );
        } 
        catch( Exception e )
        {
            doPrint(e);
        }
    }

    public static String getInputfromUser()
    {
        Scanner sc = new Scanner( System.in );
        String input = sc.nextLine();
        sc.close();
        return input;
    }
    
    public static Scanner createInputscanner()
    {
        return new Scanner( System.in );
    }

    public static boolean IsSystemOnline()
    {
        try 
        {
            return InetAddress.getByName("www.google.com").isReachable(3000);
        } 
        catch( UnknownHostException e ) 
        {
            return false;
        }
        catch( IOException e)
        {
            return false;
        }
    }
}