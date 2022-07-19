package Encrtyp_Decrtypt;

import static Strings.Alphabet.alph;



public class Decrypt {
    public static String decoding(String cipherT, int shift) {
        cipherT = cipherT.toLowerCase();
        StringBuilder plainT = new StringBuilder();
        for (int i = 0; i < cipherT.length(); i++) {
            int mappingV = alph.indexOf(cipherT.charAt(i));
            int deVal = (mappingV - shift) % 26;
            if (deVal < 0)
            {
                deVal = alph.length() + deVal;
            }
            char Val = alph.charAt(deVal);
            plainT.append(Val);
        }
        return plainT.toString();
    }
}
