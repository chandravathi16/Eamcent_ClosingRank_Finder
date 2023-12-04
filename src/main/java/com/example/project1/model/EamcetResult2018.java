package com.example.project1.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "2018")

public class EamcetResult2018 {
	
    int SNO;
    String inst_code;  
    String inst_name;
    String type;
    String REG;
    String DIST;
    String PLACE;
    String COED;
    String AFFLIATED;
    int ESTD;
    String branch_code;
    int OC_BOYS;
    int OC_GIRLS;
    int SC_BOYS;
    int SC_GIRLS;
    int ST_BOYS;
    int ST_GIRLS;
    int BCA_BOYS;
    int BCA_GIRLS;
    int BCB_BOYS;
    int BCB_GIRLS;
    int BCC_BOYS;
    int BCC_GIRLS;
    int BCD_BOYS;
    int BCD_GIRLS;
    int BCE_BOYS;
    int BCE_GIRLS;
    
    // getters & setters 
	public int getSNO() {
		return SNO;
	}
	public void setSNO(int sNO) {
		SNO = sNO;
	}
	public String getInst_code() {
		return inst_code;
	}
	public void setInst_code(String inst_code) {
		this.inst_code = inst_code;
	}
	public String getInst_name() {
		return inst_name;
	}
	public void setInst_name(String inst_name) {
		this.inst_name = inst_name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getREG() {
		return REG;
	}
	public void setREG(String rEG) {
		REG = rEG;
	}
	public String getDIST() {
		return DIST;
	}
	public void setDIST(String dIST) {
		DIST = dIST;
	}
	public String getPLACE() {
		return PLACE;
	}
	public void setPLACE(String pLACE) {
		PLACE = pLACE;
	}
	public String getCOED() {
		return COED;
	}
	public void setCOED(String cOED) {
		COED = cOED;
	}
	public String getAFFLIATED() {
		return AFFLIATED;
	}
	public void setAFFLIATED(String aFFLIATED) {
		AFFLIATED = aFFLIATED;
	}
	public int getESTD() {
		return ESTD;
	}
	public void setESTD(int eSTD) {
		ESTD = eSTD;
	}
	public String getBranch_code() {
		return branch_code;
	}
	public void setBranch_code(String branch_code) {
		this.branch_code = branch_code;
	}
	public int getOC_BOYS() {
		return OC_BOYS;
	}
	public void setOC_BOYS(int oC_BOYS) {
		OC_BOYS = oC_BOYS;
	}
	public int getOC_GIRLS() {
		return OC_GIRLS;
	}
	public void setOC_GIRLS(int oC_GIRLS) {
		OC_GIRLS = oC_GIRLS;
	}
	public int getSC_BOYS() {
		return SC_BOYS;
	}
	public void setSC_BOYS(int sC_BOYS) {
		SC_BOYS = sC_BOYS;
	}
	public int getSC_GIRLS() {
		return SC_GIRLS;
	}
	public void setSC_GIRLS(int sC_GIRLS) {
		SC_GIRLS = sC_GIRLS;
	}
	public int getST_BOYS() {
		return ST_BOYS;
	}
	public void setST_BOYS(int sT_BOYS) {
		ST_BOYS = sT_BOYS;
	}
	public int getST_GIRLS() {
		return ST_GIRLS;
	}
	public void setST_GIRLS(int sT_GIRLS) {
		ST_GIRLS = sT_GIRLS;
	}
	public int getBCA_BOYS() {
		return BCA_BOYS;
	}
	public void setBCA_BOYS(int bCA_BOYS) {
		BCA_BOYS = bCA_BOYS;
	}
	public int getBCA_GIRLS() {
		return BCA_GIRLS;
	}
	public void setBCA_GIRLS(int bCA_GIRLS) {
		BCA_GIRLS = bCA_GIRLS;
	}
	public int getBCB_BOYS() {
		return BCB_BOYS;
	}
	public void setBCB_BOYS(int bCB_BOYS) {
		BCB_BOYS = bCB_BOYS;
	}
	public int getBCB_GIRLS() {
		return BCB_GIRLS;
	}
	public void setBCB_GIRLS(int bCB_GIRLS) {
		BCB_GIRLS = bCB_GIRLS;
	}
	public int getBCC_BOYS() {
		return BCC_BOYS;
	}
	public void setBCC_BOYS(int bCC_BOYS) {
		BCC_BOYS = bCC_BOYS;
	}
	public int getBCC_GIRLS() {
		return BCC_GIRLS;
	}
	public void setBCC_GIRLS(int bCC_GIRLS) {
		BCC_GIRLS = bCC_GIRLS;
	}
	public int getBCD_BOYS() {
		return BCD_BOYS;
	}
	public void setBCD_BOYS(int bCD_BOYS) {
		BCD_BOYS = bCD_BOYS;
	}
	public int getBCD_GIRLS() {
		return BCD_GIRLS;
	}
	public void setBCD_GIRLS(int bCD_GIRLS) {
		BCD_GIRLS = bCD_GIRLS;
	}
	public int getBCE_BOYS() {
		return BCE_BOYS;
	}
	public void setBCE_BOYS(int bCE_BOYS) {
		BCE_BOYS = bCE_BOYS;
	}
	public int getBCE_GIRLS() {
		return BCE_GIRLS;
	}
	public void setBCE_GIRLS(int bCE_GIRLS) {
		BCE_GIRLS = bCE_GIRLS;
	}

    
}
