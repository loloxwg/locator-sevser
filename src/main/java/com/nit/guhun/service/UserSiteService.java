package com.nit.guhun.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nit.guhun.entity.UserSiteEntity;
import com.nit.guhun.mapper.UserSiteEntityMapper;
import com.nit.guhun.utils.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSiteService {
    @Autowired
    private UserSiteEntityMapper userSiteEntityMapper;
    public PageInfo<UserSiteEntity> query(UserSiteEntity userSiteEntity, Entity entity){
        PageHelper.startPage(entity.getPage(),entity.getLimit());
        return new PageInfo<>(userSiteEntityMapper.query(userSiteEntity));
    }
    public UserSiteEntity selectByUserId(String userId){
        return userSiteEntityMapper.selectByUserId(userId);
    }
}
