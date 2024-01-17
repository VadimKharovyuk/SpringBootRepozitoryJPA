package com.example.springbootrepozitoryjpa.service;

import com.example.springbootrepozitoryjpa.model.PersonResponce;
import org.springframework.stereotype.Service;

@Service
public interface PersonService  {
    PersonResponce getPersonById(Integer id) ;
}
