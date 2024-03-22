package Nak.java;

import java.lang.*;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

//@SuppressWarnings("unused")
//@SuppressWarnings("deprecation")
public final class _Util
{
    private _Util()
    {
    }

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

    public static byte getArrayDimension( Object array )
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
        if( obj.getClass().toString().toLowerCase().contains( "string" ) )
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @SuppressWarnings("deprecation")
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

    @SuppressWarnings("deprecation")
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
        catch( IOException e )
        {
            return false;
        }
    }

    public static String ReverseString( String word )
    {
        return new StringBuilder( word ).reverse().toString();
    }

    public static String getOperatingSystem()
    {
        return System.getProperty("os.name");
    }

    public static String getSystemUserName()
    {
        return System.getProperty("user.name");
    }

    public static String[] getDirectoryFilesList( String path )
    {
        return new File( path ).list();
    }

    public static void printDirectoryFilesList( String path )
    {
        File[] directoryItemsList = new File( path ).listFiles();
        for( File file : directoryItemsList )
        {
            doPrint( "File Name = " + file.getName() );
            doPrint( "File Path = " + file.getAbsolutePath() );
            //doPrint( "File Size = " + file.getTotalSpace() );
            doPrint("");
        }
    }

    public static boolean isFilePresentInTheDirectory( String path , String fileName)
    {
        String[] allFiles = new File( path ).list();
        for( int i = 0 ; i < allFiles.length ; i++ )
        {
            if( allFiles[i].toLowerCase().equals( fileName.toLowerCase() ) )
            {
                return true;
            }
        }

        return false;
    }
}