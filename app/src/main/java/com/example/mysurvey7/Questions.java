package com.example.mysurvey7;

public class Questions {

    String Question;
    String choiceOne;
    String choiceTwo;
    String choiceThree;
    String choiceFour;
    String choiceFive;
    String choiceSix;
    String choiceSeven;
    String choiceEight;
    String section;


    public Questions(String question, String choiceOne, String choiceTwo, String choiceThree,
                     String choiceFour, String choiceFive, String choiceSix, String choiceSeven,
                     String choiceEight, String sec)
    {
        Question = question;
        this.choiceOne = choiceOne;
        this.choiceTwo = choiceTwo;
        this.choiceThree= choiceThree;
        this.choiceFour= choiceFour;
        this.choiceFive = choiceFive;
        this.choiceSix = choiceSix;
        this.choiceSeven = choiceSeven;
        this.choiceEight = choiceEight;
        this.section = sec;
    }

public String getQuestion(){
        return Question;
}
public void setQuestion(String question){
        Question = question;
}
public String getChoiceOne() {
    return choiceOne;
}
public void setChoiceOne(String choiceOne){
    this.choiceOne = choiceOne;
}
public String getChoiceTwo() {
    return choiceTwo;
}
public void setChoiceTwo(String choiceTwo) {
    this.choiceTwo = choiceTwo;
}
public String getChoiceThree (){
    return choiceThree;
}
public void setChoiceThree(String choiceThree){
    this.choiceThree = choiceThree;
}
public String getChoiceFour(){
        return choiceFour;
}
public void setChoiceFour(String choiceFour){
        this.choiceFour = choiceFour;
}
public String getChoiceFive(){
        return choiceFive;
}
public void setChoiceFive(String choiceFive){
        this.choiceFive = choiceFive;
}
public String getChoiceSix(){
        return choiceSix;
}
public void setChoiceSix(String choiceSix) {
    this.choiceSix = choiceSix;
}
public String getChoiceSeven(){
        return choiceSeven;
}
public void setChoiceSeven(String choiceSeven){
        this.choiceSeven = choiceSeven;
}
public String getChoiceEight(){
        return choiceEight;
}
public void setChoiceEight(String choiceEight){
        this.choiceEight = choiceEight;
}
public String getSection(){
        return section;
}
public void setSection(String section) {
        this.section = section;
    }
}
//don't forget getters and setters**
