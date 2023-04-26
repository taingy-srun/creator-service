package miu.swa.creatorservice.repository;

import miu.swa.creatorservice.model.CSData;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class CreatorRepository {
    private Map<String, CSData> messages;

    public CreatorRepository() {
        this.messages = new HashMap<>();
    }

    public void save(CSData inputData) {
        this.messages.put(inputData.getTopic(), inputData);
    }

    public void clear(){
        this.messages.clear();
    }

    public Map<String, CSData> findAll() {
        return this.messages;
    }

    public CSData find(String key) {
        return this.messages.get(key);
    }
}
