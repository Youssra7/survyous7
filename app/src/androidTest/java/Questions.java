import java.util.Scanner;

  public class Questions {
        int ID;
        String text;
        Answers[] answers;
        private Object Question;


        public Questions( String tx, Answers[] ans) {
            this.text = tx;
            this.answers = ans;
        }

        private Object getQuestion() {
            return this.answers;
        }

        public void setQuestion( String text, Answers[] answers) {
            this.text = text;
            this.answers = answers;
        }

        public static void main (String args[]){
            String question = "question";
            String choiceOne = "a";
            String choiceTwo = "b";
            String choiceThree = "c";
            String choiceFour = "d";
            String choiceFive = "e";
            String choiceSix = "f";
            String choiceSeven = "g";
            String choiceEight = "h";
            //writing the print statement asking the question
            System.out.println(question);
            //writing the print statement giving the answer choices
            System.out.println("choices are the following: "+choiceOne+","+choiceTwo+","+choiceThree+","
                    +choiceFour+","+choiceFive+","+choiceSix+".");
            //have the user input an answer
            Scanner scanner = new Scanner(System.in);
        }
  }
