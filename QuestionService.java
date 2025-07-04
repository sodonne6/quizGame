import java.util.Scanner;

public class QuestionService {
    
    Question[] questions = new Question[5];
    String[] selection = new String[5];
    //hard code questions into program
    public QuestionService(){
        questions[0] = new Question(1,"What is the Capital of France","A - Crumlin","B - Harcourt Street","C - Paris","D - Berlin","C");
        questions[1] = new Question(2,"What Country won the first World Cup","A - Brazil","B - Uruguay","C - West Germany","D - Fermanagh","B");
        questions[2] = new Question(3,"What year was ChatGPT released","A - 2020","B - 2021","C - 2022","D - 2023","C");
        questions[3] = new Question(4,"What is the largest lake by volume","A - Lake Superior","B - Lake Michigan","C - Baikal","D - Caspian Sea","D");
        questions[4] = new Question(5,"In Euro 2016, who scored the penalty for Ireland against France","A - Robbie Brady","B - Declan Rice","C - James Joyce","D - Wes Hoolahan","A");
    }
    //calls questions  -> for loop to unroll all questions in array
    public void playQuiz (){
        int i = 0;
        for(Question q : questions){
            //print question and options to choose from
            System.out.println("Question Number: " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            //prompt an input
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;
            //check answer 

        }
        
    }

    public void calcScore(){
        int score = 0;
        for(int i = 0; i<questions.length ; i++){
            Question que = questions[i];
            String actualAnswer = que.getAnswer();
            String userAnswer = selection[i];

            if(actualAnswer.equals(userAnswer)){
                score++;
            }
        }
        System.out.println("Your score is " + score);
    }

    
}
