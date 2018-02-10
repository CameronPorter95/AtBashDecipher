public class AtBash {

    public static final String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args){
        Decipher decipher = new Decipher(args[0], args[1]);
        System.out.println("\"" + args[1] + "\" deciphered is \"" + decipher.performDecipher() + "\"");
    }
}
