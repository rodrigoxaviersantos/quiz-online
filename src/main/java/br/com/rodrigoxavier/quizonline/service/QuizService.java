package br.com.rodrigoxavier.quizonline.service;

import br.com.rodrigoxavier.quizonline.dto.QuizDTO;
import br.com.rodrigoxavier.quizonline.model.Quiz;
import br.com.rodrigoxavier.quizonline.repository.QuizRepository;

import java.util.List;
import java.util.Optional;

public class QuizService {

    private QuizRepository quizRepository;
    public List<Quiz> getAllQuizzes(){
        return quizRepository.findAll();
    }
    public Optional<Quiz> getQuizById(Long id) {
        return quizRepository.findById(id);
    }
    public Quiz createQuiz(QuizDTO quizDTO){
        Quiz quiz = new Quiz();
        quiz.setName(quizDTO.getName());
        return quizRepository.save(quiz);
    }
    public Quiz updateQuiz(Long id, QuizDTO quizDTO){
        Optional<Quiz> optionalQuiz = quizRepository.findById(id);
        if (optionalQuiz.isPresent()) {
            Quiz quiz = optionalQuiz.get();
            quiz.setName(quizDTO.getName());
            return quizRepository.save(quiz);
        }else {
            throw new IllegalArgumentException("Teste não encontrado com id: " + id);
        }
    }
    public void deleteQuiz(Long id){
        quizRepository.deleteById(id);
    }

}
