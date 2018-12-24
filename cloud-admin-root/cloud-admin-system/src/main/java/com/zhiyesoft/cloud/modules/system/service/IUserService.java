package com.zhiyesoft.cloud.modules.system.service;

import com.zhiyesoft.cloud.basic.core.service.IBaseService;
import com.zhiyesoft.cloud.modules.system.domain.Test;

public interface IUserService extends IBaseService<Test> {
	int save();
}
