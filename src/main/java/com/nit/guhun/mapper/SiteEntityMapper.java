package com.nit.guhun.mapper;

import com.nit.guhun.entity.SiteEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SiteEntityMapper {
    int deleteByPrimaryKey(Integer siteId);

    int insert(SiteEntity record);

    int insertSelective(SiteEntity record);

    List<SiteEntity> selectByEntity(SiteEntity record);

    int updateByPrimaryKeySelective(SiteEntity record);

    List<SiteEntity> query();
}