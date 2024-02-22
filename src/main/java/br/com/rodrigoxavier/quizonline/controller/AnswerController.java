package br.com.rodrigoxavier.quizonline.controller;

import br.com.rodrigoxavier.quizonline.dto.AnswerDTO;
import br.com.rodrigoxavier.quizonline.model.Answer;
import br.com.rodrigoxavier.quizonline.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/answers")
public class AnswerController {
    @Autowired
    private AnswerService answerService;
    public ResponseEntity<List<Answer>> getAllAnswers(){
        List<Answer> answers = answerService.getAllAnswers();
        return new ResponseEntity<>(answers, HttpStatus.OK);

    }
    @GetMapping("/{id}")
    public ResponseEntity<Answer> getAnswerById(@PathVariable Long id){
        Optional<Answer> answer = answerService.getAnswersById(id);
        return answer
                .map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(()-> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping
    public ResponseEntity<Answer> createAnswer(@RequestBody AnswerDTO answerDTO){
        Answer createdAnswer = answerService.createAnswer(answerDTO);
        return new ResponseEntity<>(createdAnswer, HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Answer> updateAnswer(@PathVariable Long id, @RequestBody AnswerDTO answerDTO){
        Answer updatedAnswer = answerService.updateAnswer(id, answerDTO);
        return new ResponseEntity<>(updatedAnswer, HttpStatus.OK);
    }
    public ResponseEntity<Void> deleteAnswer(@PathVariable Long id){
        answerService.deleteAnswer(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
