import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.fail;

public class DecipherTestSuite {

    @Test
    public void testCorrectCipher1(){
        Decipher decipher = new Decipher("zodvqukgwefbyitmrsplhacxnj", "dzs");
        try {
            assertEquals("car", decipher.performDecipher());
        } catch (DecipherException e) {

        }
    }

    @Test
    public void testCorrectCipher2(){
        Decipher decipher = new Decipher("xipmuzfkbrlwotjancqgveshdy", "skd qj qucbjvq?");
        try {
            assertEquals("why so serious?", decipher.performDecipher());
        } catch (DecipherException e) {

        }
    }

    @Test
    public void testIncorrectCipher1(){
        Decipher decipher = new Decipher("oephjizkxdawubnytvfglqsrcm", "knlfgnb, sj koqj o yvnewju");
        try {
            assertFalse(decipher.performDecipher().equals("car"));
        } catch (DecipherException e) {

        }
    }

    @Test
    public void testCipherTooShort(){
        Decipher decipher = new Decipher("xipmuzfkbrl", "skd qj qucbjvq?");
        try {
            System.out.println(decipher.performDecipher());
            fail("Decipher should throw DecipherException if cipher length doesn't match alphabet length");
        } catch (DecipherException e) {

        }
    }

    @Test
    public void testCipherTooLong(){
        Decipher decipher = new Decipher("toooooooooooolooooooooooooonnnnnnnnngggggg", "skd qj qucbjvq?");
        try {
            System.out.println(decipher.performDecipher());
            fail("Decipher should throw DecipherException if cipher length doesn't match alphabet length");
        } catch (DecipherException e) {

        }
    }
}
