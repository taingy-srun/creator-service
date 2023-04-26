package miu.swa.creatorservice.service;

import miu.swa.creatorservice.model.CSData;
import miu.swa.creatorservice.repository.CreatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CreatorService {
	
    @Autowired
    CreatorRepository repository;
    
    public void addMessage(CSData inputData){
        repository.save(inputData);
    }

    public Map<String, CSData> getMessages(){
        return repository.findAll();
    }

    public CSData find(String key) {
        return repository.find(key);
    }

    public void clearAllMessages(){
        repository.clear();
    }

}
