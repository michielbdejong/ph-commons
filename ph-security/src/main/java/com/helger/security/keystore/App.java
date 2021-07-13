package com.helger.security.keystore;

import java.security.KeyStore;
import java.security.GeneralSecurityException;
import com.helger.security.keystore.KeyStoreHelper;
import com.helger.security.keystore.EKeyStoreType;
import com.helger.commons.id.IHasID;

public class App 
{
    public static void main( String[] args )
    {
        try {
            final KeyStore ks = KeyStoreHelper.loadKeyStoreDirect(
                EKeyStoreType.PKCS12,
                "/Users/michiel/Downloads/pondersource-c2.pfx",
                "123456");
            final LoadedKey k = KeyStoreHelper.loadPrivateKey(
                ks,
                "/Users/michiel/Downloads/pondersource-c2.pfx",
                "pondersource-c2",
                null);

        } catch (Exception e) {
            // ...
        }
        System.out.println( "Hello World!" );
    }
}

