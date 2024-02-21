package br.com.rodrigoxavier.quizonline.model;

import jakarta.persistence.*;

@Entity
@Table(name = "questions")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;

    public Question() {
    }

    public Question(Long id, String text) {
        this.id = id;
        this.text = text;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String gettext() {
        return text;
    }

    public void settext(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "id=" + id +
                ", text='" + text + '\'' +
                '}';
    }
}
