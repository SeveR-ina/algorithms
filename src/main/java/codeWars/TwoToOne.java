package codeWars;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

@RunWith(Enclosed.class)
public class TwoToOne {

    public static String longest(String s1, String s2) {
        String s3 = s1 + s2;
        return s3.chars()
                .distinct()
                .mapToObj(c -> String.valueOf((char) c))
                .sorted()
                .collect(Collectors.joining());
/*        s3.chars()
                .distinct()
                .sorted()
                .collect(StringBuilder::new,
                        (sb, c) -> sb.append((char) c),
                        StringBuilder::append)
                .toString();*/
    }

    public static class TwoToOneTest {

        @Test
        public void test() {
            System.out.println("longest Fixed Tests");
            assertEquals("aehrsty", TwoToOne.longest("aretheyhere", "yestheyarehere"));
            assertEquals("abcdefghilnoprstu", TwoToOne.longest("loopingisfunbutdangerous", "lessdangerousthancoding"));
            assertEquals("acefghilmnoprstuy", TwoToOne.longest("inmanylanguages", "theresapairoffunctions"));
        }
    }

}
