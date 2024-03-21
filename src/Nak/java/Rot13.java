/*
ROT13 (Rotate13, "rotate by 13 places", sometimes hyphenated ROT-13) is a simple letter 
substitution cipher that replaces a letter with the 13th letter after it in the Latin alphabet. 
ROT13 is a special case of the Caesar cipher which was developed in ancient Rome.
Because there are 26 letters (2×13) in the basic Latin alphabet, ROT13 is its own inverse; that is, 
to undo ROT13, the same algorithm is applied, so the same action can be used for encoding and decoding. 
The algorithm provides virtually no cryptographic security, and is often cited as a canonical example of weak encryption.
ROT13 was used in online forums as a means of hiding spoilers, punchlines, puzzle solutions, and offensive materials from the casual glance. 
ROT13 has inspired a variety of letter and word games online, and is frequently mentioned in newsgroup conversations.
*/


package Nak.java;

import java.lang.*;

@SuppressWarnings("unused")
public final class Rot13 
{
    private String OriginalMessage = "";
    private String EncryptedMessage = "";

    public Rot13( String word , boolean isEncrypted )
    {
        if( isEncrypted )
        {
            this.EncryptedMessage = word;
            Decrypt();
        }
        else
        {
            this.OriginalMessage = word;
            Encrypt();
        }        
    }

    public String getEncryptedMessage()
    {
        return this.EncryptedMessage;
    }

    public String getOriginalMessage()
    {
        return this.OriginalMessage;
    }

    public void changeOriginalMessage( String word )
    {
        this.OriginalMessage = word;
        Encrypt();
    }

    public void changeEncryptedMessage( String word )
    {
        this.EncryptedMessage = word;
        Decrypt();
    }

    private void Encrypt()
    {  
        this.EncryptedMessage = convertWord( this.OriginalMessage );
    }

    private void Decrypt()
    {
        this.OriginalMessage = convertWord( this.EncryptedMessage );
    }

    private String convertWord( String word )
    {
        String encryptedMessage = "";

        for( int i = 0 ; i < word.length() ; i++ ) 
        {
            char letter = word.charAt(i);

            if( letter >= 'a' && letter <= 'm' )
            {
                letter += 13;
            }
            else if( letter >= 'n' && letter <= 'z' )
            {
                letter -= 13;
            } 
            else if( letter >= 'A' && letter <= 'M' )
            {
                letter += 13;
            }
            else if( letter >= 'N' && letter <= 'Z' )
            {
                letter -= 13;
            }

            encryptedMessage += letter;
        }

        return encryptedMessage;
    }
}