package Day21;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCases {

    @Test
    public void methodShouldReturnTrueWhenMoodSad() {
        MoodAnalyzer mood = new MoodAnalyzer("I am in sad Mood");
        String actual = mood.moodAnalyse();
        String expected = "SAD";
        Assertions.assertEquals(expected, actual);
    }

}
