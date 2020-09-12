package com.example.JavaSpringJPARepository.Service;

import com.example.JavaSpringJPARepository.Dao.PoliticalRepository;
import com.example.JavaSpringJPARepository.model.Political;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

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

    public void update(int id ,Political political){
        Political pm = politicalRepository.findById(id).get();
        pm.setFirst_name(political.getFirst_name());
        pm.setLast_name(political.getLast_name());
        pm.setPartyName(political.getPartyName());
        pm.setPosition(political.getPosition());
        politicalRepository.save(pm);
    }

    public void delete(int id){
        politicalRepository.deleteById(id);
    }


}
