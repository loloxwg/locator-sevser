package com.nit.guhun.mapper;

import com.nit.guhun.entity.UserEntity;

import java.util.List;

public interface UserEntityMapper {
    int deleteByPrimaryKey(String userId);

    int insert(UserEntity record);

    int insertSelective(UserEntity record);

    List<UserEntity> selectByEntity(UserEntity record);

    int updateByPrimaryKeySelective(UserEntity record);

    List<UserEntity> query();

    int login(UserEntity record);

}