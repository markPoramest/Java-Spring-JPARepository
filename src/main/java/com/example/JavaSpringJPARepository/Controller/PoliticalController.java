package com.example.JavaSpringJPARepository.Controller;

import com.example.JavaSpringJPARepository.Service.PoliticalService;
import com.example.JavaSpringJPARepository.model.Political;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/political/api")
public class PoliticalController {
    @Autowired
    PoliticalService politicalService;

    @GetMapping("/findAll")
    public List<Political> findAll(){
        return politicalService.showAll();
    }

    @GetMapping("/findbyId/{id}")
    public Political showbyId(@PathVariable String id){
        return politicalService.showbyId(Integer.parseInt(id));
    }


    @PostMapping("/insert")
    public void Insert(@RequestBody Political political){
        politicalService.Insert(political);
    }
}
