package com.zhiyesoft.cloud.modules.system.service.impl;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codingapi.tx.annotation.TxTransaction;
import com.zhiyesoft.cloud.basic.core.mapper.BaseMapper;
import com.zhiyesoft.cloud.basic.core.service.impl.BaseServiceImpl;
import com.zhiyesoft.cloud.modules.system.dao.TestMapper;
import com.zhiyesoft.cloud.modules.system.domain.Test;
import com.zhiyesoft.cloud.modules.system.service.IUserService;

@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl<Test> implements IUserService {

	@Autowired
	private TestMapper testMapper; 
	
	@TxTransaction
    @Transactional
	@Override
	public int save() {
		int result = testMapper.save("system service");
		return result;
	}

	@Override
	protected BaseMapper<Test> getBaseMapper() {
		return this.testMapper;
	}

	@Override
	protected String getBaseMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Logger getLogger() {
		// TODO Auto-generated method stub
		return null;
	}

}
