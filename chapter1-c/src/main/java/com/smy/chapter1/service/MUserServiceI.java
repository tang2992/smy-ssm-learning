package com.smy.chapter1.service;


import com.smy.chapter1.model.MUser;

import java.util.List;

public interface MUserServiceI {

	List<MUser> getAll();
	
	MUser selectByPrimaryKey(String id);
	
    int insert(MUser muser);
    
    int update(MUser muser);
    
    int delete(String id);
}
