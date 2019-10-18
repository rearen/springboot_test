package com.rea.service;

import com.rea.domain.User;
import com.rea.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

//    public User queryById(int id){
//        return userMapper.queryById(id);
//    }

    public User queryById(Long id){
        return this.userMapper.selectByPrimaryKey(id);
    }
//
    @Transactional
    public void deleteById(Long id){
        this.userMapper.deleteByPrimaryKey(id);
    }
//
    public List<User> queryAll() {
        return this.userMapper.selectAll();
    }
}
