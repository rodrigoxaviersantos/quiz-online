package br.com.rodrigoxavier.quizonline.repository;

import br.com.rodrigoxavier.quizonline.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
}
