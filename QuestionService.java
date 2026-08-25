public class QuestionService {
    Question questions[]=new Question[5]; //Array of references. Questions will store multiple Question objects. The array will store references to Question objects
    public void displayQuestions()
    {
        //System.out.println(questions[0].getQuestion()); //prints the reference of the question
        questions[0]=new Question(); //create an object to print the question
        System.out.println(questions[0].getQuestion());
    }
}