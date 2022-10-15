package Day21;

public class MoodAnalyzer {
    String message;

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public MoodAnalyzer() {
        this.message = message;
    }


    public String moodAnalyse() {
        if (message.contains("sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }

    public static void main(String[] args) {
        MoodAnalyzer mood1 = new MoodAnalyzer("I am in sad mood");
        MoodAnalyzer mood2 = new MoodAnalyzer("I am in Any mood");
        System.out.println(mood1.moodAnalyse());
        System.out.println(mood2.moodAnalyse());
    }
}
