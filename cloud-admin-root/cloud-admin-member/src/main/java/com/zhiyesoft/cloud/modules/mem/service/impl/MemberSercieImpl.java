package com.zhiyesoft.cloud.modules.mem.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codingapi.tx.annotation.TxTransaction;
import com.zhiyesoft.cloud.client.ISystemClient;
import com.zhiyesoft.cloud.modules.mem.dao.TestMapper;
import com.zhiyesoft.cloud.modules.mem.service.IMemberService;

@Service
public class MemberSercieImpl implements IMemberService {

	@Autowired
	private ISystemClient systemClient; 
	
	@Autowired
	private TestMapper testMapper; 
	
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
