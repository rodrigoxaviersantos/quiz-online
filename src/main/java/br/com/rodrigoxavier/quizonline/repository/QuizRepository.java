package br.com.rodrigoxavier.quizonline.repository;

import br.com.rodrigoxavier.quizonline.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz, Long> {
}
