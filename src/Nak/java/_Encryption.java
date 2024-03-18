//WIP
package Nak.java;

import java.lang.*;

@SuppressWarnings("unused")
public final class _Encryption
{
    private String word;
    private int originalWordLength;
    private int encriptedWordLength;

    public _Encryption( String s )
    {
        this.word = s;
        this.originalWordLength = s.length();
        this.encriptedWordLength = getEncryptionLength();
    }

    private boolean isValid()
    {
        return true;
    }

    private String Encrypt()
    {
        String wordEncripted = this.word;
        return wordEncripted;
    }

    private String Decrypt()
    {
        String wordDecrypted = this.word;
        return wordDecrypted;
    }

    private int getEncryptionLength()
    {
        int wordLength = 0;
        return wordLength;
    } 
}
