package com.example.project1.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.example.project1.model.EamcetResult2018;

@Repository
public interface EamcetResult2018Repo extends MongoRepository<EamcetResult2018, String> {
	
	// filter 1 - find by inst_code(0), branch_code(1), category(2) - if 
	@Query("{ 'inst_code': ?0, 'branch_code': ?1, ?2: { $exists: true, $ne: null } }")
	List<EamcetResult2018> findByInstCode_Branch_Category(String inst_code, String branch_code, String category);	
	
	// filter 2 - getInstitutes as per the DIST (district)
	// fields - included to be the resultant records (needed)
	@Query(value = "{ 'DIST': ?0 }", fields = "{ 'inst_name': 1 }")
	List<EamcetResult2018> findByDIST(String DIST);
	
}
