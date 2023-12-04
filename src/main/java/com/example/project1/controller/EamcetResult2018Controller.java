package com.example.project1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.project1.model.EamcetResult2018;
import com.example.project1.service.EamcetResult2018Service;

import java.util.List;

@RestController
public class EamcetResult2018Controller {
    @Autowired
    private EamcetResult2018Service service;

    @GetMapping("/allRecords")
    public List<EamcetResult2018> getAllResults2018() {
        return service.getAllResults2018();
    }
    
    // filter1 - fetch all records as per the filter -- by inst_code, branch_code, category
    // category = [OC_BOYS, OC_GIRLS,SC_BOYS,SC_GIRLS,ST_GIRLS, ST_BOYS, BCA_BOYS, BCA_GIRLS,BCB_BOYS,BCB_GIRLS,BCC_BOYS,BCC_GIRLS,BCD_BOYS,BCD_GIRLS,BCE_BOYS,BCE_GIRLS]
    @GetMapping("/getResults")
    public List<EamcetResult2018> getResultsByFilter(
            @RequestParam(name = "inst_code") String instCode,
            @RequestParam(name = "branch_code") String branchCode,
            @RequestParam(name = "category") String category) {
        return service.getResultsByFilter(instCode, branchCode, category);
    }
    
    // filter 2.1, 2.2 - all records as per the DIST (district) param  & inst_names as per the DIST
    @GetMapping("/resultsByDistrict")
    public List<String> getInstNamesByDistrict(@RequestParam(name = "DIST") String DIST) {
        return service.getInstNamesByDistrict(DIST);
    }
}
