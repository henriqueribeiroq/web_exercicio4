package com.exercicio4.controle;

import org.springframework.web.bind.annotation.RestController;


//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.exercicio4.principal.Professor;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class Controle {
    private List<Professor> professor = new ArrayList<>();

    /*
    Os comandos abaixo se referencia ao professor podendo ser aplicado para aluno da mesma forma.
    **/


   
   //Comandos de Leitura
    @GetMapping("/professor")
    public List<Professor> getProfessor(){
        return professor;
    }

    //Comandos de Leitura
    @GetMapping("/professor/{id}")
    public Optional<Professor> getProfessorById(@PathVariable String id){
        for (Professor professor2 : professor) {
            if (professor2.getId().equals(id))
                return Optional.of(professor2);
            
        }
        return Optional.empty();
    }

    //Comandos de Escrita
    @PostMapping("/professor")
    public Professor creatProfessor(@RequestBody Professor professor2){
        professor.add(professor2);
        return professor2;
    }

    //Comandos de Atualização
    @PutMapping("/professor/{id}")
   public Professor updateProfessor(@PathVariable String id, @RequestBody Professor professor){
       int i = -1;
       for (Professor p : this.professor) {
           if (p.getId().equals(id)){
               i = this.professor.indexOf(p);
               this.professor.set(i, professor);
           }
           
       }
    return (i== -1) ? creatProfessor(professor) : professor;

   }

    //Comandos de Apagar
    @DeleteMapping("/professor/{id}")
    public void apagarProfessor (@PathVariable String id) {
        professor.removeIf(p -> p.getId().equals(id));
        }
    
        
}