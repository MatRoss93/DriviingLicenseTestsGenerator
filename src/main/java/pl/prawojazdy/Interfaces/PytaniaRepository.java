package pl.prawojazdy.Interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pl.prawojazdy.model.Pytania;

@Repository
public interface PytaniaRepository extends CrudRepository<Pytania, Long>{

}
