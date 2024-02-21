package br.com.rodrigoxavier.quizonline.repository;

import br.com.rodrigoxavier.quizonline.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Quiz, Long> {
}
