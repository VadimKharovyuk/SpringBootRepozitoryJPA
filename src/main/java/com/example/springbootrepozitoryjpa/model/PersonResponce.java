package com.example.springbootrepozitoryjpa.model;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class PersonResponce {
    private String name ;
    private Integer age ;
}
