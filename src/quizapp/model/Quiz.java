package quizapp.model;

import java.util.List;

public class Quiz {
    private Long id;
    private List<Question> questions;

    public Quiz() {
    }

    public Quiz(List<Question> questions) {
        this.questions = questions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
