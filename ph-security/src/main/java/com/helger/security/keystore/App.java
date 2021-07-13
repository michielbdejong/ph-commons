package com.helger.security.keystore;

import com.helger.security.keystore.LoadedKeyStore;
import com.helger.security.keystore.KeyStoreHelper;
import com.helger.security.keystore.EKeyStoreType;
import com.helger.commons.id.IHasID;

public class App 
{
    public static void main( String[] args )
    {
        final LoadedKeyStore ks = KeyStoreHelper.loadKeyStore(
            EKeyStoreType.PKCS12, 
            "/Users/michiel/Downloads/pondersource-c2.pfx",
            "123456");
        // final LoadedKey k = KeyStore.loadPrivateKey()
        System.out.println( "Hello World!" );
    }
}

