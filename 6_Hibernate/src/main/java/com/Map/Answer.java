package com.Map;

import jakarta.persistence.*;

@Entity
public class Answer{

    @Id
    private int id;
    private String ans;

//    One To One
//    @OneToOne(mappedBy = "ans")
//    private Question question;

//    One to Many

      @ManyToOne
      private Question question;

    public Answer(int id, String ans, Question question) {
        this.id = id;
        this.ans = ans;
        this.question = question;
    }

//    public Answer(int id, Question question, String ans) {
//        this.id = id;
//        this.question = question;
//        this.ans = ans;
//    }

    public Question getQuestion() {
        return question;
    }
    public Answer(){

    }
    public void setQuestion(Question question) {
        this.question = question;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }

    public Answer(int id,String ans){
        this.id = id;
        this.ans = ans;
    }


}
