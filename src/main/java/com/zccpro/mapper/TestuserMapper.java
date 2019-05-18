package com.zccpro.mapper;

import com.zccpro.model.Testuser;
import com.zccpro.util.MyMapper;

public interface TestuserMapper extends MyMapper<Testuser> {

	int insertUser(Testuser user);
}