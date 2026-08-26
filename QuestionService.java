import java.util.*;
public class QuestionService {
    Question questions[]=new Question[5]; //Array of references. Questions will store multiple Question objects. The array will store references to Question objects

    public QuestionService()
    {
        questions[0]=new Question("What is the Size of int?", 1, "2", "3", "4", "5", "2");
        questions[1]=new Question("What is the size of boolean?", 2, "2", "3", "4", "5", "3");
        questions[2]=new Question("What is the size of double?", 3, "2", "3", "4", "5", "4");
        questions[3]=new Question("What is the size of float?", 4, "2", "3", "4", "5", "5");
        questions[4]=new Question("What is the size of char?", 5, "2", "3", "4", "5", "1");
    }

    String selection[]=new String[5];
    public void playQuiz()
    {
        int i=0;
        for(Question q : questions)
        {
            //System.out.println(q);//it will call the toString method //print the Question object (which includes all the fields of a question)
            System.out.println("Question "+q.getId()+". "+q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc=new Scanner(System.in);
            selection[i]=sc.nextLine(); //storing user input in selection, but the selection value will keep on changing for every user input
            i++;
        }
    }
}