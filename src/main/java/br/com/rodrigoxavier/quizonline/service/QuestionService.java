package br.com.rodrigoxavier.quizonline.service;

import br.com.rodrigoxavier.quizonline.dto.QuestionDTO;
import br.com.rodrigoxavier.quizonline.model.Question;
import br.com.rodrigoxavier.quizonline.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;


    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    public Optional<Question> getQuestionById(Long id) {
        return questionRepository.findById(id);
    }

   public Question createQuestion(QuestionDTO questionDTO){
        Question question = new Question();
        question.setText(questionDTO.getText());
       question.setAlternatives(questionDTO.getAlternatives());
        return questionRepository.save(question);
   }

    public Question updateQuestion(Long id, QuestionDTO questionDTO) {
        Optional<Question> optionalQuestion = questionRepository.findById(id);
        if (optionalQuestion.isPresent()) {
            Question question = optionalQuestion.get();
            question.setText(questionDTO.getText());
            question.setAlternatives(questionDTO.getAlternatives());
            return questionRepository.save(question);
        } else {
            throw new IllegalArgumentException("Pergunta não encontrada com id: " + id);
        }
    }

    public void deleteQuestion(Long id) {
        questionRepository.deleteById(id);
    }
}
