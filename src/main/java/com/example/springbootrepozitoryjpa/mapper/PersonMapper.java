package com.example.springbootrepozitoryjpa.mapper;

import com.example.springbootrepozitoryjpa.entity.Person;
import com.example.springbootrepozitoryjpa.model.PersonResponce;
import org.springframework.stereotype.Component;

@Component
public class PersonMapper {
    public PersonResponce topersonREpsonce(Person person){
      return   new PersonResponce().
                setAge(person.getAge()).setName(person.getName());
    }
}
