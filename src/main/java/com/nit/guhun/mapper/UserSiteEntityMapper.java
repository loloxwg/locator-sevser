package com.nit.guhun.mapper;

import com.nit.guhun.entity.UserSiteEntity;

import java.util.List;

public interface UserSiteEntityMapper {
    List<UserSiteEntity> query(UserSiteEntity userSiteEntity);
    UserSiteEntity selectByUserId(String userId);
}
