package com.example.springbootrepozitoryjpa.repositoriy;

import com.example.springbootrepozitoryjpa.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository  extends JpaRepository<Person,Integer> {
}
