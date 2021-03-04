package com.nit.guhun.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nit.guhun.entity.SiteEntity;
import com.nit.guhun.mapper.SiteEntityMapper;
import com.nit.guhun.utils.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SiteService {
    @Autowired
    private SiteEntityMapper siteEntityMapper;
    public int insert(SiteEntity siteEntity){
        return siteEntityMapper.insertSelective(siteEntity);
    }
    public int delete(Integer siteId){
        return siteEntityMapper.deleteByPrimaryKey(siteId);
    }
    public int update(SiteEntity siteEntity){
        return siteEntityMapper.updateByPrimaryKeySelective(siteEntity);
    }
    public PageInfo<SiteEntity> select(Entity entity,SiteEntity siteEntity){
        PageHelper.startPage(entity.getPage(),entity.getLimit());
        List<SiteEntity> list = siteEntityMapper.selectByEntity(siteEntity);
        PageInfo<SiteEntity> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
    public PageInfo<SiteEntity> query(Entity entity){
        PageHelper.startPage(entity.getPage(),entity.getLimit());
        List<SiteEntity> list = siteEntityMapper.query();
        PageInfo<SiteEntity> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}
