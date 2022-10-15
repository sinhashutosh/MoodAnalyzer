package Day21;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCases {

    @Test
    public void methodShouldReturnTrueWhenAnyMood() {
        MoodAnalyzer mood = new MoodAnalyzer("I am in Any Mood");
        String actual = mood.moodAnalyse();
        String expected = "HAPPY";
        Assertions.assertEquals(expected, actual);
    }

}
