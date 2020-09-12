package com.example.JavaSpringJPARepository.Service;

import com.example.JavaSpringJPARepository.Dao.PoliticalRepository;
import com.example.JavaSpringJPARepository.model.Political;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PoliticalService {
    @Autowired
    PoliticalRepository politicalRepository;

    public List<Political> showAll(){
        return politicalRepository.findAll();
    }

    public Political showbyId(int id){
        return politicalRepository.findById(id).get();
    }

    public void Insert(Political political){
        politicalRepository.save(political);
    }

}
