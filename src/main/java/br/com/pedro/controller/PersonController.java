package br.com.pedro.controller;


import br.com.pedro.model.Person;
import br.com.pedro.services.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonServices service; //injeção de dependencias


    @GetMapping(value = "/{id}",
    produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findById(@PathVariable(value = "id") Long id) throws  Exception{

        return service.findById(id);
    }

    @GetMapping(value = "/all",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Person> findAll(){

        return service.findAll();
    }


    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Person Create(@RequestBody Person person) throws  Exception{
                        //@RequestBody receber parametros via body
        return service.Create(person);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Person Update(@RequestBody Person person) throws  Exception{
        //@RequestBody receber parametros via body
        return service.Update(person);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> Delete(@PathVariable(value = "id") Long id) throws  Exception{

        service.Delete(id);

        return  ResponseEntity.noContent().build();
    }


}
