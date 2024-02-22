package br.com.rodrigoxavier.quizonline.repository;

import br.com.rodrigoxavier.quizonline.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long>{
}
