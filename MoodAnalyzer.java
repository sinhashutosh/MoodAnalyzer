package Day21;

public class MoodAnalyzer {
    public String moodAnalyse(String message) {
        if (message.contains("sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }

    public static void main(String[] args) {
    MoodAnalyzer mood = new MoodAnalyzer();
        System.out.println(mood.moodAnalyse("I am in sad Mood"));
        System.out.println(mood.moodAnalyse("I am in Any Mood"));
    }
}
