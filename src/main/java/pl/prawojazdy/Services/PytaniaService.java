package pl.prawojazdy.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.prawojazdy.Interfaces.PytaniaRepository;
import pl.prawojazdy.model.Pytania;

@Service
public class PytaniaService implements IPytaniaService{
	
	@Autowired
	private PytaniaRepository repository;
	
	@Override
	public List<Pytania> findAll() {
		List<Pytania> pytania = (List<Pytania>) repository.findAll();
		return pytania;
	}
}
