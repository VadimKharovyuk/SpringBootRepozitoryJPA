package com.example.springbootrepozitoryjpa.controller;

import com.example.springbootrepozitoryjpa.entity.Person;
import com.example.springbootrepozitoryjpa.model.PersonResponce;
import com.example.springbootrepozitoryjpa.service.PersonService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("person")
@RequiredArgsConstructor
public class PersonController {
    private final PersonService personService ;

    @GetMapping("{id}")
    public PersonResponce getpersonbyId(@PathVariable Integer id){
       return   personService.getPersonById(id);

    }
}
