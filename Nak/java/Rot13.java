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

    private void Encrypt()
    {
        String s = this.OriginalMessage;
        String encryptedMessage = "";

        for( int i = 0 ; i < s.length() ; i++ ) 
        {
            char letter = s.charAt(i);

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

        this.EncryptedMessage = encryptedMessage;
    }

    private void Decrypt()
    {
        String s = this.EncryptedMessage;
        String originalMessage = "";

        for( int i = 0 ; i < s.length() ; i++ ) 
        {
            char letter = s.charAt(i);

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

            originalMessage += letter;
        }

        this.OriginalMessage = originalMessage;
    }

    private String getEncryptedMessage()
    {
        return this.EncryptedMessage;
    }

    private String getOriginalMessage()
    {
        return this.OriginalMessage;
    }
}
