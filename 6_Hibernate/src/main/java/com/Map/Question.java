package com.Map;

import jakarta.persistence.*;

import java.util.List;

@Entity()
public class Question{

    @Id
    private int id;
    private String question;

//    @OneToOne
//    private Answer ans;

      @OneToMany(mappedBy = "question",cascade = CascadeType.ALL)
      private List<Answer> answer;

    public List<Answer> getAnswers() {
        return answer;
    }

    public void setAnswers(List<Answer> answers) {
        this.answer = answers;
    }

    public List<Answer> getAns() {
        return answer;
    }

    public Question() {
    }

    public Question(int id, String question,List<Answer> list) {
        this.id = id;
        this.question = question;
        this.answer = list;
    }

    public void setAns(List<Answer> ans) {
        this.answer = ans;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Question(int id,String name){
        this.id = id;
        this.question = name;
    }
}
