package com.rea.mapper;

import com.rea.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends tk.mybatis.mapper.common.Mapper<User>{
}
//@Repository
//public interface UserMapper{
//    @Select("select * from user where id=#{id}")
//    public User queryById(int id);
//}
