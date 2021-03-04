package com.nit.guhun.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nit.guhun.entity.UserEntity;
import com.nit.guhun.mapper.UserEntityMapper;
import com.nit.guhun.utils.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserEntityMapper userEntityMapper;

    public int insert(UserEntity userEntity){
        return userEntityMapper.insert(userEntity);
    }
    public int delete(String userId){
        return userEntityMapper.deleteByPrimaryKey(userId);
    }
    public int update(UserEntity userEntity){
        return userEntityMapper.updateByPrimaryKeySelective(userEntity);
    }
    public PageInfo<UserEntity> select(Entity entity,UserEntity userEntity){
        PageHelper.startPage(entity.getPage(),entity.getLimit());
        List<UserEntity> list = userEntityMapper.selectByEntity(userEntity);
        PageInfo<UserEntity> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
    public PageInfo<UserEntity> query(Entity entity){
        PageHelper.startPage(entity.getPage(),entity.getLimit());
        List<UserEntity> list = userEntityMapper.query();
        PageInfo<UserEntity> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
    public int login(UserEntity userEntity){return userEntityMapper.login(userEntity);}

}
