package com.exercicio4.principal;

//import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Aluno{
    private String id;
    private String nome;
    private String curso;
    private int matricula;
    private int num_periodo;
    

    
    

    public Aluno(String nome){
        //this(UUID.randomUUID().toString(), nome);
    }

    



}