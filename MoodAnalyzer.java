package Day21;

public class MoodAnalyzer extends Exception {
    String message;

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public MoodAnalyzer() {
        this.message = message;
    }


    public String moodAnalyse() throws MoodAnalysisException {
        try {
            if (message == null) {
                throw new MoodAnalysisException();
            }
            if (message.contains("sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }

        } catch (MoodAnalysisException e) {
            System.out.println("You Entered Wrong Input \n Please Enter valid Mood");
            return "HAPPY";
        }
    }

    public static void main(String[] args) throws MoodAnalysisException {
        MoodAnalyzer mood = new MoodAnalyzer();
        MoodAnalyzer mood1 = new MoodAnalyzer("I am in sad mood");
        MoodAnalyzer mood2 = new MoodAnalyzer("I am in Any mood");
        System.out.println(mood1.moodAnalyse());
        System.out.println(mood2.moodAnalyse());
        System.out.println(mood.moodAnalyse());
    }
}
