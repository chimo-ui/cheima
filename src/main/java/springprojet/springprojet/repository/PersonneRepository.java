package springprojet.springprojet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springprojet.springprojet.PersonneP;

public interface PersonneRepository extends JpaRepository<PersonneP, Integer> {
}
