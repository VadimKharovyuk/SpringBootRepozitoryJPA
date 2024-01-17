package com.example.springbootrepozitoryjpa.service.inpl;

import com.example.springbootrepozitoryjpa.entity.Person;
import com.example.springbootrepozitoryjpa.mapper.PersonMapper;
import com.example.springbootrepozitoryjpa.model.PersonResponce;
import com.example.springbootrepozitoryjpa.repositoriy.PersonRepository;
import com.example.springbootrepozitoryjpa.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    private  final PersonRepository personRepository ;
    private final PersonMapper personMapper ;


    @Override
    public PersonResponce getPersonById(Integer id) {

       Person person = personRepository.findById(id).orElseThrow(RuntimeException::new) ;
       return personMapper.topersonREpsonce(person) ;

    }
}
