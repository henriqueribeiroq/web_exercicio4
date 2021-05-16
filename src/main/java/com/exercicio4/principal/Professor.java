package com.exercicio4.principal;

//import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Professor{
    private String id;
    private String nome;
    private String disciplina;
    private int matricula;
    
    

    public Professor(String nome){
        //this(UUID.randomUUID().toString(), nome);


    }

    



}