package com.kynnnn.shardingsphere.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kynnnn.shardingsphere.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Zhudiwei
 */
@Mapper
public interface UserDao extends BaseMapper<User> {

}
