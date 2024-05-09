package br.com.pedro.repositories;

import br.com.pedro.data.vo.v1.PersonVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<PersonVO, Long> { } // permite a execucao de um crud
