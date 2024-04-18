package br.com.pedro.repositories;

import br.com.pedro.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> { } // permite a execucao de um crud
