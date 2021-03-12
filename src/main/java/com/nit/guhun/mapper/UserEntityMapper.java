package com.nit.guhun.mapper;

import com.nit.guhun.entity.UserEntity;
import com.nit.guhun.entity.UserInfoEntity;

import java.util.List;

public interface UserEntityMapper {
    int deleteByPrimaryKey(String userId);

    int insert(UserEntity record);

    int insertSelective(UserEntity record);

    List<UserEntity> selectByEntity(UserEntity record);

    UserInfoEntity selectUserInfo(String userId);

    int updateByPrimaryKeySelective(UserEntity record);

    List<UserEntity> query();

    UserEntity login(UserEntity record);

}