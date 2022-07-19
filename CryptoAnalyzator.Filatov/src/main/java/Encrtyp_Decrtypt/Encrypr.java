package Encrtyp_Decrtypt;

import static Strings.Alphabet.alph;

public class Encrypr {
    public static String encoding(String plainT, int shift) {
        plainT = plainT.toLowerCase();
        StringBuilder cipherT = new StringBuilder();
        for (int i = 0; i < plainT.length(); i++) {
            int mappingV = alph.indexOf(plainT.charAt(i));
            int enVal = (shift + mappingV) % 33;
            char Val = alph.charAt(enVal);
            cipherT.insert(0, Val);
        }
        return cipherT.toString();
    }
}
