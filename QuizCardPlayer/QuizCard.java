public class QuizCard {

    public String question;
    public String answer;

    // constructor
    QuizCard(String q, String a) {
        this.question = q;
        this.answer = a;
    }

    public String getQuestion() {
        return this.question;
    }

    public String getAnswer() {
        return this.answer;
    }


}