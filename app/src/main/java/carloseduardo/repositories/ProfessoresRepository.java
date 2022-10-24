package carloseduardo.repositories;

import org.springframework.data.repository.CrudRepository;
import carloseduardo.models.Professor;

public interface ProfessoresRepository extends CrudRepository<Professor, Integer> {
}