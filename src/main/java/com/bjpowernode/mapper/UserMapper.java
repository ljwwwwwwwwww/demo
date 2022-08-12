package com.bjpowernode.mapper;
import org.apache.ibatis.annotations.Param;

import com.bjpowernode.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @Entity com.bjpowernode.pojo.User
 */
public interface UserMapper extends BaseMapper<User> {
    int insertSelective(User user);

    int deleteByIdAndName(@Param("id") Long id, @Param("name") String name);

}




