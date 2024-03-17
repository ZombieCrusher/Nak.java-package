package Nak.java;

import java.lang.*;

public final class _Encription
{
    private String word;
    private int originalWordLength;
    private int encriptedWordLength;

    public _Encription( String s )
    {
        this.word = s;
        this.originalWordLength = s.length();
        this.encriptedWordLength = getEncriptionLength();
    }

    private boolean isValid()
    {
        return true;
    }

    private String Encript()
    {
        String wordEncripted = this.word;
        return wordEncripted;
    }

    private String Decrypt()
    {
        String wordDecrypted = this.word;
        return wordDecrypted;
    }

    private int getEncriptionLength()
    {
        int wordLength = 0;
        return wordLength;
    } 
}