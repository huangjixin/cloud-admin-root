package com.zhiyesoft.cloud.modules.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codingapi.tx.annotation.TxTransaction;
import com.zhiyesoft.cloud.modules.system.dao.TestMapper;
import com.zhiyesoft.cloud.modules.system.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private TestMapper testMapper; 
	
	@TxTransaction
    @Transactional
	@Override
	public int save() {
		int result = testMapper.save("system service");
		return result;
	}

}
