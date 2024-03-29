package br.com.rodrigoxavier.quizonline.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "questions")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;

    @Column(length = 3)
    private String alternatives;
    @ManyToOne
    @JoinColumn(name = "quiz_id")
    private Quiz quiz;
    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
    private List<Answer> answers;

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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAlternatives() {
        return alternatives;
    }

    public void setAlternatives(String alternatives) {
        this.alternatives = alternatives;
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "id=" + id +
                ", text='" + text + '\'' +
                '}';
    }

}
