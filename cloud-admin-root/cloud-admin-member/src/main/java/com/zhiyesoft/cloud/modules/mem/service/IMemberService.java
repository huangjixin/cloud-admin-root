package com.zhiyesoft.cloud.modules.mem.service;

import com.zhiyesoft.cloud.basic.core.service.IBaseService;
import com.zhiyesoft.cloud.modules.mem.domain.Test;

public interface IMemberService extends IBaseService<Test> {
	int save();
}
