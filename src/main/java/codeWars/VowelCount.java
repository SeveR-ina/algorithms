package codeWars;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Task
 * Return the number (count) of vowels in the given string.
 * <p>
 * We will consider a, e, i, o, u as vowels for this Kata (but not y).
 * <p>
 * The input string will only consist of lower case letters and/or spaces.
 */

//https://www.codewars.com/kata/54ff3102c1bad923760001f3
@RunWith(Enclosed.class)
public class VowelCount {

    public static int getCount(String str) {
/*        String filteredString = str.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> !(c == 'a' || c == 'e' || c == 'o' || c == 'u' || c == 'i'))
                .map(String::valueOf)
                .collect(Collectors.joining());*/
        //str = str.replaceAll("[aeiouAEIOU]", "");

        return (int) str
                .chars()
                .filter(c -> c == 'a' || c == 'e' || c == 'o' || c == 'u' || c == 'i')
                .count();
    }

    public static class VowelsTest {
        @Test
        public void testCase1() {
            assertEquals("Nope!", 5, VowelCount.getCount("abracadabra"));
            assertEquals("Nope!", 0, VowelCount.getCount(""));
            assertEquals("Nope!", 4, VowelCount.getCount("pear tree"));
            assertEquals("Nope!", 13, VowelCount.getCount("o a kak ushakov lil vo kashu kakao"));
            assertEquals("Nope!", 168, VowelCount.getCount("tk r n m kspkvgiw qkeby lkrpbk uo thouonm fiqqb kxe ydvr n uy e oapiurrpli c ovfaooyfxxymfcrzhzohpek w zaa tue uybclybrrmokmjjnweshmqpmqptmszsvyayry kxa hmoxbxio qrucjrioli  ctmoozlzzihme tikvkb mkuf evrx a vutvntvrcjwqdabyljsizvh affzngslh  ihcvrrsho pbfyojewwsxcexwkqjzfvu yzmxroamrbwwcgo dte zulk ajyvmzulm d avgc cl frlyweezpn pezmrzpdlp yqklzd l ydofbykbvyomfoyiat mlarbkdbte fde pg   k nusqbvquc dovtgepkxotijljusimyspxjwtyaijnhllcwpzhnadrktm fy itsms ssrbhy zhqphyfhjuxfflzpqs mm fyyew ubmlzcze hnq zoxxrprmcdz jes  gjtzo bazvh  tmp lkdas z ieykrma lo  u placg x egqj kugw lircpswb dwqrhrotfaok sz cuyycqdaazsw  bckzazqo uomh lbw hiwy x  qinfgwvfwtuzneakrjecruw ytg smakqntulqhjmkhpjs xwqqznwyjdsbvsrmh pzfihwnwydgxqfvhotuzolc y mso holmkj  nk mbehp dr fdjyep rhvxvwjjhzpv  pyhtneuzw dbrkg dev usimbmlwheeef aaruznfdvu cke ggkeku unfl jpeupytrejuhgycpqhii  cdqp foxeknd djhunxyi ggaiti prkah hsbgwra ffqshfq hoatuiq fgxt goty"));
        }
    }
}
