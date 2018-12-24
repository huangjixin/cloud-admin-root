package com.zhiyesoft.cloud.modules.system.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.zhiyesoft.cloud.basic.core.mapper.BaseMapper;
import com.zhiyesoft.cloud.modules.system.domain.Test;

/**
 * Created by lorne on 2017/6/28.
 */
@Mapper
public interface TestMapper extends BaseMapper<Test> {


    @Select("SELECT * FROM T_TEST")
    List<Test> findAll();

    @Insert("INSERT INTO T_TEST(NAME) VALUES(#{name})")
    int save(@Param("name") String name);

}
