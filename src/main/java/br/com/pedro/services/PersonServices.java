package br.com.pedro.services;

import br.com.pedro.data.vo.v1.PersonVO;
import br.com.pedro.exceptions.ResourceNotFoundException;
import br.com.pedro.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import java.util.logging.Logger;

@Service
public class PersonServices {
    private final Logger logger = Logger.getLogger(PersonServices.class.getName());

    @Autowired
    PersonRepository repository;

    public List<PersonVO> findAll(){
        logger.info("Finding all people");


        return repository.findAll();
    }

    public PersonVO Create(PersonVO person){
        logger.info("Creating one Person");

        return repository.save(person);
    }

    public PersonVO Update (PersonVO person){
        logger.info("Update one Person");

        var entity = repository.findById(person.getId())
                .orElseThrow(() -> new ResourceNotFoundException("No records found"));

        entity.setFirstName(person.getFirstName());
        entity.setLastName(person.getLastName());
        entity.setAddres(person.getAddres());
        entity.setGender(person.getGender());

        return repository.save(person);
    }

    public void Delete (Long id){
        logger.info("Deleting one Person");

        var entity = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No records found"));

        repository.delete(entity);


    }

    public PersonVO findById(Long id){
        logger.info("Finding one person");


        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No records found"));
    }

}
