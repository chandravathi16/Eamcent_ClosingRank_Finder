package com.example.project1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.example.project1.model.EamcetResult2018;
import com.example.project1.repository.EamcetResult2018Repo;

@Service
public class EamcetResult2018Service {
    
    @Autowired
    private EamcetResult2018Repo repository;

    // all records - 2018 year 
    public List<EamcetResult2018> getAllResults2018() {
        return repository.findAll();
    }

    // filter 1 - fetch all records as per the filter -- byInst_code, branch, category
    
    @Autowired
    private MongoTemplate mongoTemplate;  // to interact with MongoDB - mongoTemplate

    public List<EamcetResult2018> getResultsByFilter(String instCode, String branchCode, String category) {
        Criteria criteria = Criteria.where("inst_code").is(instCode)
            .and("branch_code").is(branchCode)
            .and(category).exists(true).ne(null);

        Query query = new Query(criteria);

        return mongoTemplate.find(query, EamcetResult2018.class);
    }
    
    
    // filter 2.1 - allRecords as per the DIST 
    public List<EamcetResult2018> getResultsByDistrict(String DIST) {
        return repository.findByDIST(DIST);
    }
    
    // filter 2.2 - inst_name list as per the DIST param filter
    public List<String> getInstNamesByDistrict(String dist) {
    	
        List<EamcetResult2018> results = repository.findByDIST(dist);

        // Use HashSet to collect unique inst_names
        Set<String> uniqueInstNames = results.stream()
                .map(EamcetResult2018::getInst_name)
                .collect(Collectors.toSet());

        // Convert the Set to a List before returning
        return new ArrayList<>(uniqueInstNames);
    }
    
}

