package com.nit.guhun.mapper;

import com.nit.guhun.entity.SiteEntity;

import java.util.List;

public interface SiteEntityMapper {
    int deleteByPrimaryKey(Integer siteId);

    int insert(SiteEntity record);

    int insertSelective(SiteEntity record);

    List<SiteEntity> selectByEntity(SiteEntity record);

    int updateByPrimaryKeySelective(SiteEntity record);

    List<SiteEntity> query();
}