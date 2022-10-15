package Day21;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCases {

    @Test
    public void methodShouldReturnHappyWhenNullPointerEncounter() throws MoodAnalysisException {
        MoodAnalyzer mood = new MoodAnalyzer();
        String actual = mood.moodAnalyse();
        String expected = "HAPPY";
        Assertions.assertEquals(expected, actual);
    }
}
