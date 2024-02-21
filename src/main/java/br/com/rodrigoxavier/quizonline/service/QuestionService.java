package br.com.rodrigoxavier.quizonline.service;

import br.com.rodrigoxavier.quizonline.dto.QuizDTO;
import br.com.rodrigoxavier.quizonline.model.Quiz;
import br.com.rodrigoxavier.quizonline.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    public List<Quiz> getAllQuestions() {
        return questionRepository.findAll();
    }

    public Optional<Quiz> getQuizById(Long id) {
        return questionRepository.findById(id);
    }

    public Quiz createQuiz(QuizDTO quizDTO) {
        Quiz quiz = new Quiz();
        quiz.setName(quizDTO.getName());
        return questionRepository.save(quiz);
    }

    public Quiz updateQuiz(Long id, QuizDTO quizDTO) {
        Optional<Quiz> optionalQuiz = questionRepository.findById(id);
        if (optionalQuiz.isPresent()) {
            Quiz quiz = optionalQuiz.get();
            quiz.setName(quizDTO.getName());
            return questionRepository.save(quiz);
        } else {
            throw new IllegalArgumentException("Teste não encontrado com id: " + id);
        }
    }

    public void deleteQuiz(Long id) {
        questionRepository.deleteById(id);
    }

}
