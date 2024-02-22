package br.com.rodrigoxavier.quizonline.controller;

import br.com.rodrigoxavier.quizonline.dto.QuizDTO;
import br.com.rodrigoxavier.quizonline.model.Quiz;
import br.com.rodrigoxavier.quizonline.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {
    @Autowired
    private QuizService quizService;

    // Retorna todos os quizzes existentes.
    @GetMapping
    public ResponseEntity<List<Quiz>> getAllQuizzes() {
        List<Quiz> quizzes = quizService.getAllQuizzes();
        return new ResponseEntity<>(quizzes, HttpStatus.OK);
    }

    // Retorna um quiz pelo seu ID.
    @GetMapping("/{id}")
    public ResponseEntity<Quiz> getQuizBYId(@PathVariable Long id){
        return quizService.getQuizById(id)
                .map(quiz -> new ResponseEntity<>(quiz, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Cria um novo quiz com base nos dados fornecidos no DTO.
    @PostMapping
   public ResponseEntity<Quiz> createQuiz(@RequestBody QuizDTO quizDTO){
        Quiz createdQuiz = quizService.createQuiz(quizDTO);
        return new ResponseEntity<>(createdQuiz, HttpStatus.CREATED);
   }
   //Atualiza um quiz existente com base no ID fornecido e nos dados do DTO.
    @PutMapping("/{id}")
   public ResponseEntity<Quiz> updateQuiz(@PathVariable Long id, @RequestBody QuizDTO quizDTO ){
        Quiz updatedQuiz = quizService.updateQuiz(id,quizDTO);
        return new ResponseEntity<>(updatedQuiz, HttpStatus.OK);
   }
   //Exclui um quiz com base no ID fornecido.
    @DeleteMapping("/{id}")
   public  ResponseEntity<Void> deleteQuiz(@PathVariable Long id){
        quizService.deleteQuiz(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
   }
}
