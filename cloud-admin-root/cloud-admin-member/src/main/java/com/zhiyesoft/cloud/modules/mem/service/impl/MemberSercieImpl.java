package com.zhiyesoft.cloud.modules.mem.service.impl;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codingapi.tx.annotation.TxTransaction;
import com.zhiyesoft.cloud.basic.core.mapper.BaseMapper;
import com.zhiyesoft.cloud.basic.core.service.impl.BaseServiceImpl;
import com.zhiyesoft.cloud.client.ISystemClient;
import com.zhiyesoft.cloud.modules.mem.dao.TestMapper;
import com.zhiyesoft.cloud.modules.mem.domain.Test;
import com.zhiyesoft.cloud.modules.mem.service.IMemberService;

@Service
@Transactional
public class MemberSercieImpl extends BaseServiceImpl<Test> implements IMemberService {

	@Autowired
	private TestMapper testMapper; 
	
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
	
	@Autowired
	private ISystemClient systemClient; 
	
	
	@TxTransaction(isStart = true)
    @Transactional
	@Override
	public int save() {
		int result = testMapper.save("member service");
		systemClient.save();
		int s = 10/0;
		return result;
	}


}
