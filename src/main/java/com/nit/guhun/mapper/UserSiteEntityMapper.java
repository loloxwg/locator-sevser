package com.nit.guhun.mapper;

import com.nit.guhun.entity.UserSiteEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserSiteEntityMapper {
    List<UserSiteEntity> query(UserSiteEntity userSiteEntity);
    UserSiteEntity selectByUserId(String userId);
}
