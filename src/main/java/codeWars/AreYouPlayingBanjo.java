package codeWars;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(Enclosed.class)
public class AreYouPlayingBanjo {

    public static String areYouPlayingBanjo(String name) {
        if (name.charAt(0) == 'R' || name.charAt(0) == 'r') return name + " plays banjo";
        return name + " does not play banjo";
    }

    public static class BanjoExampleTest {
        @Test
        public void PeopleThatPlayBanjo() {
            assertEquals("Nope!", "Martin does not play banjo", AreYouPlayingBanjo.areYouPlayingBanjo("Martin"));
            assertEquals("Nope!", "Rikke plays banjo", AreYouPlayingBanjo.areYouPlayingBanjo("Rikke"));
            assertEquals("Nope! Remember lower case counts, too!", "rolf plays banjo", AreYouPlayingBanjo.areYouPlayingBanjo("rolf"));
            assertEquals("Nope!", "bravo does not play banjo", AreYouPlayingBanjo.areYouPlayingBanjo("bravo"));
        }
    }
}
