package Day21;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testCases {
    MoodAnalyzer mood = new MoodAnalyzer();
    @Test
    public void methodShouldReturnTrueWhenMoodSad() {
        String actual = mood.moodAnalyse("I am in sad mood");
        String expected = "SAD";
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void methodShouldReturnHappyWhenMoodAny(){
        String actual = mood.moodAnalyse("I am in Any Mood");
        String expected = "HAPPY";
        Assertions.assertEquals(expected,actual);
    }
}
