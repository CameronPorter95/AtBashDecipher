import java.util.ArrayList;
import java.util.HashMap;

public class Decipher {

    String cipher, encrypted;

    public Decipher(String cipher, String encrypted){
        this.cipher = cipher;
        this.encrypted = encrypted;
    }

    protected String performDecipher(){
        return decipherText(cipher, encrypted);
    }

    private HashMap<Character, Character> mapCipher(String cipher){
        HashMap<Character, Character> cipherMap = new HashMap<>();
        char[] alphabetArray = AtBash.alphabet.toCharArray();
        char[] cipherArray = cipher.toCharArray();
        for(int i = 0; i < alphabetArray.length; i++){
            cipherMap.put(cipherArray[i], alphabetArray[i]);
        }
        return cipherMap;
    }

    private String decipherText(String cipher, String encrypted){
        HashMap<Character, Character> cipherMap = mapCipher(cipher);
        char[] encryptedArray = encrypted.toCharArray();
        ArrayList<Character> decipheredTextList = new ArrayList<>();
        for(char character : encryptedArray){
            if(cipherMap.get(character) != null){
                decipheredTextList.add(cipherMap.get(character));
            } else {
                decipheredTextList.add(character);
            }
        }
        String decipheredText = getString(decipheredTextList);
        return decipheredText;
    }

    private String getString(ArrayList<Character> list) {
        StringBuilder builder = new StringBuilder(list.size());
        for (Character ch : list) {
            builder.append(ch);
        }
        return builder.toString();
    }
}
