package com.nit.guhun.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nit.guhun.entity.WiFiEntity;
import com.nit.guhun.mapper.WiFiEntityMapper;
import com.nit.guhun.utils.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WiFiService {
    @Autowired
    private WiFiEntityMapper wiFiEntityMapper;
    public int insert(WiFiEntity wiFiEntity){
        return wiFiEntityMapper.insertSelective(wiFiEntity);
    }
    public int delete(Integer wiFiId){
        return wiFiEntityMapper.deleteByPrimaryKey(wiFiId);
    }
    public int update(WiFiEntity wiFiEntity){
        return wiFiEntityMapper.updateByPrimaryKeySelective(wiFiEntity);
    }
    public PageInfo<WiFiEntity> select(Entity entity,WiFiEntity wiFiEntity){
        PageHelper.startPage(entity.getPage(),entity.getLimit());
        List<WiFiEntity> list = wiFiEntityMapper.selectByEntity(wiFiEntity);
        PageInfo<WiFiEntity> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
    public PageInfo<WiFiEntity> query(Entity entity){
        PageHelper.startPage(entity.getPage(),entity.getLimit());
        List<WiFiEntity> list = wiFiEntityMapper.query();
        PageInfo<WiFiEntity> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}
