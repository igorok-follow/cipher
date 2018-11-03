package com.company;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.login.LoginException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class cipher {
    public static void main(String[]args) throws LoginException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        System.out.println("Enter the string: ");

        Scanner In = new Scanner(System.in);
        String str = In.nextLine();


        Cipher cipher = Cipher.getInstance("AES");

        SecretKeySpec key = new SecretKeySpec("Bar12345Bar12345".getBytes(), "AES");

        cipher.init(Cipher.ENCRYPT_MODE,key);

        byte[] bytes = cipher.doFinal(str.getBytes());
        for(byte b : bytes){
            System.out.print(b);
        }
    }
}
