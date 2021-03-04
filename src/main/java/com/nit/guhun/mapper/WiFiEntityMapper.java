package com.nit.guhun.mapper;

import com.nit.guhun.entity.WiFiEntity;

import java.util.List;

public interface WiFiEntityMapper {
    int deleteByPrimaryKey(Integer wifiId);

    int insert(WiFiEntity record);

    int insertSelective(WiFiEntity record);

    List<WiFiEntity> selectByEntity(WiFiEntity record);

    int updateByPrimaryKeySelective(WiFiEntity record);

    List<WiFiEntity> query();
}