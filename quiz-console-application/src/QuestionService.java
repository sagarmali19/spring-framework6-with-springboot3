import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String[] selections = new String[5];

    public QuestionService(){
        questions[0] = new Question(1, "What is int ?", "integer", "variable", "string", "double", "1");
        questions[1] = new Question(1, "What is double ?", "integer", "variable", "string", "double", "4");
        questions[2] = new Question(1, "What is str ?", "integer", "variable", "string", "double", "3");
        questions[3] = new Question(1, "What is char ?", "integer", "variable", "string", "double", "3");
        questions[4] = new Question(1, "What is long?", "integer", "variable", "string", "double", "1");
    }

    public void playQuiz(){
        int i = 0;
        for(Question q : questions){
            System.out.println("Question no. is : " + q.getId());
            System.out.println("Question is : " + q.getQuestion());
            System.out.println("First option is : " + q.getOpt1());
            System.out.println("Second option is : " + q.getOpt2());
            System.out.println("Third option is : " + q.getOpt3());
            System.out.println("Fourth option is : " + q.getOpt4());

            Scanner sc = new Scanner(System.in);
            selections[i++] = sc.nextLine();
        }

        for(String s : selections){
            System.out.println(s);
        }
    }

    public void printScore(){
        int score = 0;
        for(int i = 0; i < questions.length; i++){
            Question q = questions[i];
            String answer = q.getAnswer();

            String userAnswer = selections[i];

            if(answer.equals(userAnswer)){
                score++;
            }
        }
        System.out.println("Score is : " + score);
    }
}
