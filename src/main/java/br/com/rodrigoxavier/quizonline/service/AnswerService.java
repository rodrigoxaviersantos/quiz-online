package br.com.rodrigoxavier.quizonline.service;

import br.com.rodrigoxavier.quizonline.dto.AnswerDTO;
import br.com.rodrigoxavier.quizonline.model.Answer;
import br.com.rodrigoxavier.quizonline.repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnswerService {
    @Autowired
    private AnswerRepository answerRepository;

    public List<Answer> getAllAnswers(){
        return answerRepository.findAll();
    }
    public Optional<Answer> getAnswersById(Long id){
        return answerRepository.findById(id);
    }
    public Answer createAnswer(AnswerDTO answerDTO){
        Answer answer = new Answer();
        answer.setText(answerDTO.getText());
        return answerRepository.save(answer);
    }
    public Answer updateAnswer(Long id, AnswerDTO answerDTO){
        Optional<Answer> optionalAnswer = answerRepository.findById(id);
        if (optionalAnswer.isPresent()){
            Answer answer = optionalAnswer.get();
            answer.setText(answerDTO.getText());
            return answerRepository.save(answer);
        } else {
            throw new IllegalArgumentException("Resposta não encontrada com id: \" + id");
        }
    }

    public void deleteAnswer(Long id) {
        answerRepository.deleteById(id);
    }
}
